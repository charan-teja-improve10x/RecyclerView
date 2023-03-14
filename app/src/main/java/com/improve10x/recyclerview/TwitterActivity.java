package com.improve10x.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class TwitterActivity extends AppCompatActivity {
    TwitterItem[] twitterItems;
    TwitterItemAdapter twitterItemAdapter;
    RecyclerView twitterRv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twitter);
        initViews();
        createTweeterData();
        createAdapter();
        connectAdapter();
    }

    private void initViews() {
        twitterRv = findViewById(R.id.twitter_rv);
    }

    public void createTweeterData(){
        twitterItems = new TwitterItem[6];

        twitterItems[0] = new TwitterItem();
        twitterItems[0].personName = "Silvia";
        twitterItems[0].twitterProfileUrl = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        twitterItems[0].tweetTime = "@machadocomamida.1m";
        twitterItems[0].tweet = "ppl keep saying hot girl summer but i'm just trying to stay out of the humidity";
        twitterItems[0].comments = "5";
        twitterItems[0].rotate = "8";
        twitterItems[0].likes = "12";

        twitterItems[1] = new TwitterItem();
        twitterItems[1].personName = "Jasi";
        twitterItems[1].twitterProfileUrl = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        twitterItems[1].tweetTime = "@k9lover85.20m";
        twitterItems[1].tweet = "Pop songs just hit different when you're driving";
        twitterItems[1].comments = "7";
        twitterItems[1].rotate = "3";
        twitterItems[1].likes = "20";

        twitterItems[2] = new TwitterItem();
        twitterItems[2].personName = "Vera";
        twitterItems[2].twitterProfileUrl = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        twitterItems[2].tweetTime = "@Veracordeiro20.1h";
        twitterItems[2].tweet = "Help i can't stop cancelling meetings";
        twitterItems[2].comments = "2";
        twitterItems[2].rotate = "1";
        twitterItems[2].likes = "6";

        twitterItems[3] = new TwitterItem();
        twitterItems[3].reTweet = "🔀 Silver Jones Retweeted";
        twitterItems[3].personName = "Twitter";
        twitterItems[3].twitterProfileUrl = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        twitterItems[3].tweetTime = "@Twitter.2/8/21";
        twitterItems[3].tweet = "memes have expiration dates";
        twitterItems[3].comments = "135k";
        twitterItems[3].rotate = "32.9k";
        twitterItems[3].likes = "269k";

        twitterItems[4] = new TwitterItem();
        twitterItems[4].personName = "Harold";
        twitterItems[4].twitterProfileUrl = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        twitterItems[4].tweetTime = "@h_wang84.3h";
        twitterItems[4].tweet = "There are to many people outside";
        twitterItems[4].comments = "4";
        twitterItems[4].rotate = "8";
        twitterItems[4].likes = "25";

        twitterItems[5] = new TwitterItem();
        twitterItems[5].personName = "Allen";
        twitterItems[5].twitterProfileUrl = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        twitterItems[5].tweetTime = "@grayhamsays.12h";
        twitterItems[5].tweet = "ppl keep saying hot girl summer but i'm just trying to stay out of the humidity";
        twitterItems[5].comments = "5";
        twitterItems[5].rotate = "8";
        twitterItems[5].likes = "12";
    }

    public void createAdapter(){
       twitterItemAdapter = new TwitterItemAdapter(twitterItems);
    }

    public void connectAdapter(){
        twitterRv.setLayoutManager(new LinearLayoutManager(this));
        twitterRv.setAdapter(twitterItemAdapter);
    }

}