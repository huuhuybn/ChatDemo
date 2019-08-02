package com.dotplays.chatdemo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dotplays.chatdemo.R;
import com.dotplays.chatdemo.model.Chat;

import java.util.List;

public class ChatAdapter extends RecyclerView.Adapter<ChatHolder> {


    private List<Chat> chatList;
    private Context context;

    public ChatAdapter(List<Chat> chatList, Context context) {
        this.chatList = chatList;
        this.context = context;
    }

    @NonNull
    @Override
    public ChatHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.chat,parent,false);
        return new ChatHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ChatHolder holder, int position) {

        holder.tvName.setText(chatList.get(position).name);
        holder.tvChat.setText(chatList.get(position).message);

    }

    @Override
    public int getItemCount() {
        return chatList.size();
    }
}
