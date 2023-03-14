package com.improve10x.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class TwitterItemAdapter extends RecyclerView.Adapter<TwitterItemViewHolder> {
    TwitterItem[] items;

    public TwitterItemAdapter(TwitterItem[] twitterItems){
        items = twitterItems;
    }
    @NonNull
    @Override
    public TwitterItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.twitter_item,parent,false);
        TwitterItemViewHolder viewHolder = new TwitterItemViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TwitterItemViewHolder holder, int position) {
        TwitterItem item = items[position];
        holder.reTweetTxt.setText(item.reTweet);
        holder.personNameTxt.setText(item.personName);
        holder.tweetTimeTxt.setText(item.tweetTime);
        holder.tweetTxt.setText(item.tweet);
        holder.rotateTxt.setText(item.rotate);
        holder.likesTxt.setText(item.likes);
        holder.commentTxt.setText(item.comments);
        Picasso.get().load(item.twitterProfileUrl).into(holder.twitterProfileIv);
    }

    @Override
    public int getItemCount() {
        return items.length;
    }
}
