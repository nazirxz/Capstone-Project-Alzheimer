package com.capstone.alzheimercare.di

import com.capstone.alzheimercare.core.domain.usecase.*
import com.capstone.alzheimercare.ui.caretaker.scanner.ScannerViewModel
import com.capstone.alzheimercare.ui.login.LoginViewModel
import com.capstone.alzheimercare.ui.patient.home.HomeViewModel
import com.capstone.alzheimercare.ui.patient.profile.ProfileViewModel
import com.capstone.alzheimercare.ui.patient.profile.UpdatePatientViewModel
import com.capstone.alzheimercare.ui.signup.SignUpViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val useCaseModule = module {
    factory<PatientUseCase> { PatientInteractor(get()) }
    factory<CaretakerUseCase> { CaretakerInteractor(get()) }
}

val viewModelModule = module {

    viewModel { HomeViewModel(get()) }
    viewModel { ProfileViewModel(get()) }
    viewModel { UpdatePatientViewModel(get()) }

    viewModel { ScannerViewModel(get(),get()) }

    //auth
    viewModel { SignUpViewModel(get(), get()) }
    viewModel { LoginViewModel(get(), get()) }
}