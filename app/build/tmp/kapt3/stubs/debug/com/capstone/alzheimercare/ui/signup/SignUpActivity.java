package com.capstone.alzheimercare.ui.signup;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J!\u0010\u0005\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0002\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\rH\u0002J\b\u0010\u001a\u001a\u00020\u0014H\u0002J\b\u0010\u001b\u001a\u00020\u0014H\u0002J\b\u0010\u001c\u001a\u00020\u0014H\u0016J\u0012\u0010\u001d\u001a\u00020\u00142\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\b\u0010 \u001a\u00020\u0014H\u0002J\u0018\u0010!\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\rH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006#"}, d2 = {"Lcom/capstone/alzheimercare/ui/signup/SignUpActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/capstone/alzheimercare/databinding/ActivitySignUpBinding;", "check", "", "emailError", "passwordError", "preference", "Lcom/capstone/alzheimercare/ui/MyPreference;", "repeatError", "role", "", "viewModel", "Lcom/capstone/alzheimercare/ui/signup/SignUpViewModel;", "getViewModel", "()Lcom/capstone/alzheimercare/ui/signup/SignUpViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "", "p", "s", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "checkUser", "email", "initListeners", "initObserver", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setSpinner", "setUser", "password", "app_debug"})
public final class SignUpActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.capstone.alzheimercare.databinding.ActivitySignUpBinding binding;
    private com.capstone.alzheimercare.ui.MyPreference preference;
    private final kotlin.Lazy viewModel$delegate = null;
    private boolean emailError = false;
    private boolean passwordError = false;
    private boolean repeatError = false;
    private boolean check = false;
    private java.lang.String role = "Patient";
    
    private final com.capstone.alzheimercare.ui.signup.SignUpViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initListeners() {
    }
    
    private final void initObserver() {
    }
    
    private final void setSpinner() {
    }
    
    private final void checkUser(java.lang.String email) {
    }
    
    private final void check(java.lang.Boolean p, java.lang.Boolean s) {
    }
    
    private final void setUser(java.lang.String email, java.lang.String password) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    public SignUpActivity() {
        super();
    }
}