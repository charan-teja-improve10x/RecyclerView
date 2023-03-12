package com.improve10x.recyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FaceNotificationViewHolder extends RecyclerView.ViewHolder {
    TextView notificationTxt;
    TextView notificationTimeTxt;
    ImageView fbProfileIv;

    public FaceNotificationViewHolder(@NonNull View itemView) {
        super(itemView);
        notificationTxt = itemView.findViewById(R.id.notification_txt);
        notificationTimeTxt = itemView.findViewById(R.id.notification_time_txt);
        fbProfileIv = itemView.findViewById(R.id.fb_profile_iv);
    }
}
