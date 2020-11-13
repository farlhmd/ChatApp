package com.kelompok2.chatapp.data.repository.authentication

import com.kelompok2.chatapp.data.entity.User

interface AuthenticationRepositoryCallback {
    fun onSuccess(user: User)
    fun onFailed(error: String?)
}