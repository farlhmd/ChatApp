package com.kelompok2.chatapp.presentation.authentication.register

import com.kelompok2.chatapp.data.entity.User

interface RegisterView {
    fun onUsernameEmpty()
    fun onEmailEmpty()
    fun onEmailInvalid()
    fun onPasswordEmpty()
    fun onPasswordToShort()
    fun onConfirmPasswordEmpty()
    fun onConfirmPasswordNotMatch()
    fun onRegisterStart()
    fun onProgress(visibility: Int)
    fun onRegisterSuccess(user: User)
    fun onRegisterFailed(error: String?)
}