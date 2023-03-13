package com.improve10x.recyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class InstaItemViewHolder extends RecyclerView.ViewHolder {
    TextView instaIdTxt;
    TextView descriptionTxt;
    ImageView instaProfileIv;
    public InstaItemViewHolder(@NonNull View itemView) {
        super(itemView);
        instaIdTxt = itemView.findViewById(R.id.insta_id_txt);
        instaProfileIv = itemView.findViewById(R.id.insta_profile_iv);
        descriptionTxt = itemView.findViewById(R.id.description_txt);
    }
}
