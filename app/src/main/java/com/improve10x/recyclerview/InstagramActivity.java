package com.improve10x.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.widget.HorizontalScrollView;

public class InstagramActivity extends AppCompatActivity {
    InstagramItemAdapter instagramItemAdapter;
    InstagramItemAdapter instaSuggetionsAdapter;
    RecyclerView favoritesRv;
    RecyclerView suggetionsRv;
    InstagramItems[] instagramItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instagram);
        initViews();
        createFavoritesData();
        createFavoriteAdapter();
        connectAdapter();
    }

    private void initViews() {
        favoritesRv = findViewById(R.id.favorites_rv);
        suggetionsRv = findViewById(R.id.suggetions_rv);
    }

    public void createFavoritesData(){
        instagramItems = new InstagramItems[4];

        instagramItems[0] = new InstagramItems();
        instagramItems[0].instaId = "lil_wyatt838";
        instagramItems[0].description = "Wyatt Torres";
        instagramItems[0].instaProfileUrl = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";

        instagramItems[1] = new InstagramItems();
        instagramItems[1].instaId = "sprinkles_bby19";
        instagramItems[1].description = "Gabrila Perez";
        instagramItems[1].instaProfileUrl = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";

        instagramItems[2] = new InstagramItems();
        instagramItems[2].instaId = "xander.the.great178";
        instagramItems[2].description = "Alex Koch";
        instagramItems[2].instaProfileUrl = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";

        instagramItems[3] = new InstagramItems();
        instagramItems[3].instaId = "Kyia_kayaks";
        instagramItems[3].description = "Kyra Marie";
        instagramItems[3].instaProfileUrl = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
    }

    public void createFavoriteAdapter(){
       instagramItemAdapter = new InstagramItemAdapter(instagramItems);
       instaSuggetionsAdapter = new InstagramItemAdapter(instagramItems);
    }

    public void connectAdapter(){
        favoritesRv.setLayoutManager(new LinearLayoutManager(this));
        favoritesRv.setAdapter(instagramItemAdapter);
        suggetionsRv.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        suggetionsRv.setAdapter(instaSuggetionsAdapter);
    }

}