package com.improve10x.recyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MessangerItemViewHolder extends RecyclerView.ViewHolder{
    TextView messangerNameTxt;
    TextView messageTxt;
    ImageView profileIdIv;


    public MessangerItemViewHolder(@NonNull View itemView) {
        super(itemView);
        messangerNameTxt = itemView.findViewById(R.id.messanger_name_txt);
        messageTxt = itemView.findViewById(R.id.message_txt);
        profileIdIv = itemView.findViewById(R.id.profileid_iv);
    }
}
