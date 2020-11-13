package com.kelompok2.chatapp.presentation.chatroom.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.kelompok2.chatapp.data.entity.Chat
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.to_message.*

class HolderMessageTo(override val containerView: View?) : RecyclerView.ViewHolder(containerView as View), LayoutContainer {

    fun bindChatContent(chat: Chat) {
        if (chat.isSameUser == true) {
            toUsernameGroup.visibility = View.GONE
        } else {
            toUsernameGroup.visibility = View.VISIBLE
        }

        toUsername.text = chat.user
        toMessage.text = chat.message
    }
}