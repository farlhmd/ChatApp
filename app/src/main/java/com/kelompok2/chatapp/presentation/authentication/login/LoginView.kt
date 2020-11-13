package com.kelompok2.chatapp.presentation.authentication.login

import com.kelompok2.chatapp.data.entity.User


interface LoginView {
        fun onEmailEmpty()
        fun onEmailInvalid()
        fun onPasswordEmpty()
        fun onLoginStart()
        fun onProgress(visibility: Int)
        fun onLoginSuccess(user: User)
        fun onLoginFailed(error: String?)
}
