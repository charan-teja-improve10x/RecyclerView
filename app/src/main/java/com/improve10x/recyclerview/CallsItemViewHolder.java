package com.improve10x.recyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CallsItemViewHolder extends RecyclerView.ViewHolder {
    TextView contactNameTxt;
    TextView callTimeTxt;
    ImageView contactIv;
    public CallsItemViewHolder(@NonNull View itemView) {
       super(itemView);
       callTimeTxt = itemView.findViewById(R.id.call_time_txt);
       contactNameTxt = itemView.findViewById(R.id.contact_name_txt);
       contactIv = itemView.findViewById(R.id.contact_iv);
    }
}

/*
public class FacebookRvViewHolder extends RecyclerView.ViewHolder {

    public TextView title;
    public TextView title2;
    public ImageView imageView;

    public FacebookRvViewHolder(@NonNull View itemView) {
        super(itemView);
        title = itemView.findViewById(R.id.note_txt);
        title2 = itemView.findViewById(R.id.timedate_txt);
        imageView = itemView.findViewById(R.id.facebookpos_iv);
    }
}
 */