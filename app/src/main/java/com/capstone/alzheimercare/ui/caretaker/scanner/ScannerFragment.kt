package com.capstone.alzheimercare.ui.caretaker.scanner

import android.Manifest
import android.content.pm.PackageManager
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.fragment.app.Fragment
import com.budiyev.android.codescanner.*
import com.capstone.alzheimercare.R
import com.capstone.alzheimercare.databinding.FragmentCaretakerScannerBinding
import com.capstone.alzheimercare.ui.caretaker.task.AddTaskFragment
import com.capstone.alzheimercare.utils.Utility.navigateTo

class ScannerFragment : Fragment() {
    private var _binding: FragmentCaretakerScannerBinding? = null
    private val binding get() = _binding as FragmentCaretakerScannerBinding
    private lateinit var codeScanner: CodeScanner
    private var link = ""

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {

        _binding = FragmentCaretakerScannerBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupPermissions()
        codeScanner()

        binding.openBtn.setOnClickListener {
            if (link != "") {
                val fragment = AddTaskFragment()
                val bundle = Bundle().apply {
                    putString("idPatient", link)
                }
                fragment.arguments = bundle
                activity?.navigateTo(fragment, R.id.frame)
            }
        }
    }

    private fun codeScanner() {
        codeScanner = CodeScanner(requireContext(), binding.scanner)

        codeScanner.apply {
            camera = CodeScanner.CAMERA_BACK
            formats = CodeScanner.ALL_FORMATS

            autoFocusMode = AutoFocusMode.SAFE
            scanMode = ScanMode.CONTINUOUS
            isAutoFocusEnabled = true
            isFlashEnabled = false

            decodeCallback = DecodeCallback {
                if (activity != null) {
                    requireActivity().runOnUiThread {
                        binding.scannerLink.text = it.text
                        link = it.text
                    }
                }
            }

            errorCallback = ErrorCallback {
                if (activity != null) {
                    requireActivity().runOnUiThread {
                        Log.e("Main", "codeScanner: ${it.message}")
                    }
                }
            }

            binding.scanner.setOnClickListener {
                codeScanner.startPreview()
            }
        }
    }

    private fun setupPermissions() {
        if (requireContext().checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED) {
            requestPermission.launch(Manifest.permission.CAMERA)
        }
    }

    private val requestPermission =
        registerForActivityResult(ActivityResultContracts.RequestPermission()) { isGranted ->
            if (!isGranted) {
                Toast.makeText(
                    context,
                    "You need the camera permission to use this app",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }

    override fun onResume() {
        super.onResume()
        codeScanner.startPreview()
    }

    override fun onPause() {
        codeScanner.releaseResources()
        super.onPause()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        codeScanner.releaseResources()
        _binding = null
    }
}