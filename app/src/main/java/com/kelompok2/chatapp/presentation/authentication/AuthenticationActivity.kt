package com.kelompok2.chatapp.presentation.authentication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kelompok2.chatapp.R
import com.kelompok2.chatapp.data.entity.User
import com.kelompok2.chatapp.preferences.ChatPreferences
import com.kelompok2.chatapp.presentation.authentication.login.LoginFragment
import com.kelompok2.chatapp.presentation.authentication.register.RegisterFragment
import com.kelompok2.chatapp.presentation.chatroom.ChatRoomActivity
import com.kelompok2.chatapp.replaceFragment

class AuthenticationActivity : AppCompatActivity(), AuthenticationPageListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)

        if (savedInstanceState == null) {
            replaceFragment(R.id.containerAuth, LoginFragment())
        }
    }

    override fun onLoginPage() = replaceFragment(R.id.containerAuth, LoginFragment())

    override fun onRegisterPage() = replaceFragment(R.id.containerAuth, RegisterFragment())

    override fun onAuthenticateSuccess(user: User) {
        ChatPreferences.initPreferences(this).userInfo = user
        startActivity(Intent(this@AuthenticationActivity, ChatRoomActivity::class.java))
        finish()
    }
}