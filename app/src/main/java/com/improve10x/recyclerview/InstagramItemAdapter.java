package com.improve10x.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class InstagramItemAdapter extends RecyclerView.Adapter<InstaItemViewHolder> {
    InstagramItems[] items;

    public InstagramItemAdapter(InstagramItems[] instagramItems){
        items = instagramItems;
    }

    @NonNull
    @Override
    public InstaItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.instagram_items,parent,false);
        InstaItemViewHolder viewHolder = new InstaItemViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull InstaItemViewHolder holder, int position) {
        InstagramItems item = items[position];
        holder.instaIdTxt.setText(item.instaId);
        holder.descriptionTxt.setText(item.description);
        Picasso.get().load(item.instaProfileUrl).into(holder.instaProfileIv);
    }

    @Override
    public int getItemCount() {
        return items.length;
    }
}
