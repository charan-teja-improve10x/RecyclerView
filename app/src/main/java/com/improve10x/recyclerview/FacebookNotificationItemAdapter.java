package com.improve10x.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class FacebookNotificationItemAdapter extends RecyclerView.Adapter<FaceNotificationViewHolder> {
    FacebookNotificationItem[] items;

    public FacebookNotificationItemAdapter(FacebookNotificationItem[] facebookNotificationItem){
        items = facebookNotificationItem;
    }

    @NonNull
    @Override
    public FaceNotificationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.facebook_notification_item,parent,false);
        FaceNotificationViewHolder viewHolder = new FaceNotificationViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FaceNotificationViewHolder holder, int position) {
        FacebookNotificationItem item = items[position];
        holder.notificationTxt.setText(item.notification);
        holder.notificationTimeTxt.setText(item.notificationTime);
        Picasso.get().load(item.fbProfileUrl).into(holder.fbProfileIv);
    }

    @Override
    public int getItemCount() {
        return items.length;
    }
}
