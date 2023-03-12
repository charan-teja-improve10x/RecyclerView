package com.improve10x.recyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class GmailItemsViewHolder extends RecyclerView.ViewHolder {
    TextView nameTxt;
    TextView subjectTxt;
    TextView timeTxt;
    ImageView profileIv;

    public GmailItemsViewHolder(@NonNull View itemView) {
        super(itemView);
        nameTxt = itemView.findViewById(R.id.name_txt);
        subjectTxt = itemView.findViewById(R.id.subject_txt);
        timeTxt = itemView.findViewById(R.id.notification_time_txt);
        profileIv = itemView.findViewById(R.id.profile_iv);
    }
}
