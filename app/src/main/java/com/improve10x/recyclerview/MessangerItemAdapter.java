package com.improve10x.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class MessangerItemAdapter extends RecyclerView.Adapter<MessangerItemViewHolder> {
    MessangerItem[] items;

    public MessangerItemAdapter(MessangerItem[] messangerItems){
        items = messangerItems;
    }
    @NonNull
    @Override
    public MessangerItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.messanger_item,parent,false);
        MessangerItemViewHolder viewHolder = new MessangerItemViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MessangerItemViewHolder holder, int position) {
        MessangerItem item = items[position];
        holder.messangerNameTxt.setText(item.name);
        holder.messageTxt.setText(item.message);
        Picasso.get().load(item.profileIdUrl).into(holder.profileIdIv);
    }

    @Override
    public int getItemCount() {
        return items.length;
    }
}
