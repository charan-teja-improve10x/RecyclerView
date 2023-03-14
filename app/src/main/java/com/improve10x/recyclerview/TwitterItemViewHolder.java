package com.improve10x.recyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TwitterItemViewHolder extends RecyclerView.ViewHolder {
    ImageView twitterProfileIv;
    TextView reTweetTxt;
    TextView personNameTxt;
    TextView tweetTimeTxt;
    TextView tweetTxt;
    TextView commentTxt;
    TextView rotateTxt;
    TextView likesTxt;
    public TwitterItemViewHolder(@NonNull View itemView) {
        super(itemView);
        twitterProfileIv = itemView.findViewById(R.id.tweeter_profile_iv);
        reTweetTxt = itemView.findViewById(R.id.retweet_txt);
        personNameTxt = itemView.findViewById(R.id.person_name_txt);
        tweetTimeTxt = itemView.findViewById(R.id.tweet_time_txt);
        tweetTxt = itemView.findViewById(R.id.tweet_txt);
        commentTxt = itemView.findViewById(R.id.comment_txt);
        rotateTxt = itemView.findViewById(R.id.rotate_txt);
        likesTxt = itemView.findViewById(R.id.like_txt);
    }
}
