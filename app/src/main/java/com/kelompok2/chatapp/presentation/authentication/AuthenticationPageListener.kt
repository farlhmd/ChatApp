package com.kelompok2.chatapp.presentation.authentication

import com.kelompok2.chatapp.data.entity.User

interface AuthenticationPageListener {
    fun onLoginPage()

    fun onRegisterPage()

    fun onAuthenticateSuccess(user: User)
}