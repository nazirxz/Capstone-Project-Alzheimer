package com.capstone.alzheimercare.ui.caretaker.profile

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.capstone.alzheimercare.R
import com.capstone.alzheimercare.ui.MyPreference
import org.koin.android.viewmodel.ext.android.viewModel
import com.capstone.alzheimercare.databinding.FragmentCaretakerProfileBinding
import com.capstone.alzheimercare.ui.login.LoginActivity
import com.capstone.alzheimercare.utils.Utility.convertEmpty
import com.capstone.alzheimercare.utils.Utility.navigateTo
import com.capstone.alzheimercare.utils.Utility.setImage


class ProfileFragment : Fragment() {
    private lateinit var preference: MyPreference
    private val profileCaretakerViewModel: ProfileCaretakerViewModel by viewModel()
    private var _binding: FragmentCaretakerProfileBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentCaretakerProfileBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        preference = MyPreference(requireActivity())

        profileCaretakerViewModel.getCaretaker(preference.getId()).observe(viewLifecycleOwner, {
            if (it.data != null) {
                with(it.data) {
                    binding.tvFullname.text = name.convertEmpty()
                    binding.tvEmail.text = email.convertEmpty()
                    binding.tvPhonenumber.text = phoneNumber.convertEmpty()
                    binding.tvDate.text = dateBirth.convertEmpty()
                    binding.tvAddress.text = address.convertEmpty()
                    binding.tvGender.text = gender.convertEmpty()
                    binding.tvEmailProfile.text = email.convertEmpty()
                    binding.tvName.text = name.convertEmpty()
                    binding.avatar.setImage(picture)
                }
            }
        })

        binding.logoutBtn.setOnClickListener {
            preference.setId("")
            preference.setRole("")
            val intent = Intent(activity, LoginActivity::class.java)
            startActivity(intent)
            activity?.finish()
        }
        binding.btnEdit.setOnClickListener {
            activity?.navigateTo(UpdateProfileFragment(), R.id.frame)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}