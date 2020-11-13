package com.kelompok2.chatapp.data.repository.database

import com.kelompok2.chatapp.data.entity.Chat

interface MessageRepositoryCallback {
    fun onMessageComing(chat: Chat)
    fun onMessageUpdate(position: Int, chat: Chat)
    fun onMessageDeleted(position: Int)
}