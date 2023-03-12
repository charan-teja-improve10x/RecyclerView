package com.improve10x.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class FacebookNotificationActivity extends AppCompatActivity {
    RecyclerView notificationRv;
    FacebookNotificationItemAdapter facebookNotificationItemAdapter;
    FacebookNotificationItem[] facebookNotificationItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook_notification);
        initViews();
        createData();
        createAdapter();
        connectAdapter();
    }

    private void initViews() {
       notificationRv = findViewById(R.id.notifications_rv);
    }

    public void createData() {
        facebookNotificationItems = new FacebookNotificationItem[7];

        facebookNotificationItems[0] = new FacebookNotificationItem();
        facebookNotificationItems[0].notification = "Angele jaemi Favorito Huit reacted to your story.";
        facebookNotificationItems[0].notificationTime = "1 hour ago";
        facebookNotificationItems[0].fbProfileUrl = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";

        facebookNotificationItems[1] = new FacebookNotificationItem();
        facebookNotificationItems[1].notification = "Kimwana Michael, Linh An and Channell Boxley asked to join I Love still Life painting";
        facebookNotificationItems[1].notificationTime = "1 hour ago";
        facebookNotificationItems[1].fbProfileUrl = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";

        facebookNotificationItems[2] = new FacebookNotificationItem();
        facebookNotificationItems[2].notification = "Lloyd Cafe Cadena is live now: Lapit NA MAG END OF SEASON!!!.";
        facebookNotificationItems[2].notificationTime = "5 minutes ago";
        facebookNotificationItems[2].fbProfileUrl = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";

        facebookNotificationItems[3] = new FacebookNotificationItem();
        facebookNotificationItems[3].notification = "Sai Ellise Mejorada commented on a post in Hachi,s buy abd Sell group.";
        facebookNotificationItems[3].notificationTime = "1 hour ago";
        facebookNotificationItems[3].fbProfileUrl = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";

        facebookNotificationItems[4] = new FacebookNotificationItem();
        facebookNotificationItems[4].notification = "Mavreen Anne Romero and others added to their stories.";
        facebookNotificationItems[4].notificationTime = "2 hour ago";
        facebookNotificationItems[4].fbProfileUrl = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";

        facebookNotificationItems[5] = new FacebookNotificationItem();
        facebookNotificationItems[5].notification = "Sosy Sophie, Rompage Traveland Tours and LetstricEcarg Nodner Nillilam listed in CAMSUR...";
        facebookNotificationItems[5].notificationTime = "2 hour ago";
        facebookNotificationItems[5].fbProfileUrl = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";

        facebookNotificationItems[6] = new FacebookNotificationItem();
        facebookNotificationItems[6].notification = "Bobby Alvarez and others added to theire stories.";
        facebookNotificationItems[6].notificationTime = "2 hour ago";
        facebookNotificationItems[6].fbProfileUrl = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
    }

    public void createAdapter(){
        facebookNotificationItemAdapter = new FacebookNotificationItemAdapter(facebookNotificationItems);
    }

    public void connectAdapter(){
        notificationRv.setLayoutManager(new LinearLayoutManager(this));
        notificationRv.setAdapter(facebookNotificationItemAdapter);
    }
}