package com.kelompok2.chatapp.module

import com.google.firebase.auth.FirebaseAuth
import com.kelompok2.chatapp.data.repository.authentication.AuthenticationRepository
import com.kelompok2.chatapp.data.repository.database.MessageRepository
import com.kelompok2.chatapp.data.route.ChatReferences
import com.kelompok2.chatapp.presentation.authentication.login.LoginPresenter
import com.kelompok2.chatapp.presentation.authentication.register.RegisterPresenter
import com.kelompok2.chatapp.presentation.chatroom.ChatRoomPresenter
import org.koin.dsl.module

val chatModule = module {
    single { ChatReferences() }
    single { FirebaseAuth.getInstance() }

    factory { AuthenticationRepository(get(), get()) }
    factory { MessageRepository(get()) }

    factory { LoginPresenter(get()) }
    factory { RegisterPresenter(get()) }
    factory { ChatRoomPresenter(get()) }
}