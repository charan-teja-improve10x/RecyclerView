package com.improve10x.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class CallsItemAdapter extends RecyclerView.Adapter<CallsItemViewHolder> {
    CallItems[] items;

    public CallsItemAdapter(CallItems[] callItems){
        items = callItems;
    }
    @NonNull
    @Override
    public CallsItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.call_items,parent,false);
        CallsItemViewHolder viewHolder = new CallsItemViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CallsItemViewHolder holder, int position) {
        CallItems item = items[position];
        holder.contactNameTxt.setText(item.contactName);
        holder.callTimeTxt.setText(item.callTime);
        Picasso.get().load(item.contactUrl).into(holder.contactIv);
    }

    @Override
    public int getItemCount() {
        return items.length;
    }
}
/*
public class FacebookRvAdapter extends RecyclerView.Adapter<FacebookRvViewHolder> {

    public  FaceBookItem[] items;

    public FacebookRvAdapter(FaceBookItem[] faceBookItems){
        items = faceBookItems;
    }

    @NonNull
    @Override
    public FacebookRvViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.facebookitem, parent, false);
        FacebookRvViewHolder viewHolder = new FacebookRvViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FacebookRvViewHolder holder, int position) {
        FaceBookItem item = items[position];
        holder.title.setText(item.message);
        holder.title2.setText(item.time2);;
        Picasso.get().load(item.imageUrl2).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return items.length;
    }
}
 */