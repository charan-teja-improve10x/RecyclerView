package com.improve10x.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class GmailItemsAdapter extends RecyclerView.Adapter<GmailItemsViewHolder> {
    GmailItems[] items;
    public GmailItemsAdapter(GmailItems[] gmailItems){
      items = gmailItems;
    }
    @NonNull
    @Override
    public GmailItemsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.gmail_items,parent,false);
        GmailItemsViewHolder viewHolder = new GmailItemsViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull GmailItemsViewHolder holder, int position) {
        GmailItems item = items[position];
        holder.nameTxt.setText(item.name);
        holder.timeTxt.setText(item.time);
        holder.subjectTxt.setText(item.subject);
        Picasso.get().load(item.profileUrl).into(holder.profileIv);
    }

    @Override
    public int getItemCount() {
       return items.length;
    }
}
