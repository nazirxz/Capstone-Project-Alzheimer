package com.capstone.alzheimercare.di

import com.capstone.alzheimercare.core.domain.usecase.*
import com.capstone.alzheimercare.ui.login.LoginViewModel
import com.capstone.alzheimercare.ui.signup.SignUpViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val useCaseModule = module {
    factory<PatientUseCase> { PatientInteractor(get()) }
    factory<CaretakerUseCase> { CaretakerInteractor(get()) }
}

val viewModelModule = module {

    //auth
    viewModel { SignUpViewModel(get(), get()) }
    viewModel { LoginViewModel(get(), get()) }
}