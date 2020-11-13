package com.kelompok2.chatapp.presentation

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.kelompok2.chatapp.R
import com.kelompok2.chatapp.presentation.authentication.AuthenticationActivity
import com.kelompok2.chatapp.presentation.chatroom.ChatRoomActivity

class LauncherActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launcher)

        val auth = FirebaseAuth.getInstance()

        if (auth.currentUser != null) {
            startActivity(Intent(this, ChatRoomActivity::class.java))
        } else {
            startActivity(Intent(this, AuthenticationActivity::class.java))
        }

        finish()
    }
}