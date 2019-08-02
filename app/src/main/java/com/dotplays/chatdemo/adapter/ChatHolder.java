package com.dotplays.chatdemo.adapter;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dotplays.chatdemo.R;
import com.rockerhieu.emojicon.EmojiconTextView;
import com.vanniktech.emoji.EmojiTextView;

class ChatHolder extends RecyclerView.ViewHolder {

    public final TextView tvName;
    public final EmojiconTextView tvChat;
    public ChatHolder(@NonNull View itemView) {
        super(itemView);
        tvChat = itemView.findViewById(R.id.tvChat);
        tvName = itemView.findViewById(R.id.tvName);
    }
}
