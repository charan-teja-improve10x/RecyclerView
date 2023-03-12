package com.improve10x.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class CallLogActivity extends AppCompatActivity {
    CallItems[] callItems;
    RecyclerView callsRv;
    CallsItemAdapter callsItemAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_log);
        initViews();
        createData();
        createAdapter();
        connectAdapter();
    }


    private void initViews() {
        callsRv = findViewById(R.id.calls_rv);
    }

    public void createData(){
        callItems = new CallItems[6];

        callItems[0] =  new CallItems();
        callItems[0].contactUrl = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        callItems[0].contactName = "+91 9313549611";
        callItems[0].callTime = "↙ India, 6 min. ago";

        callItems[1] =  new CallItems();
        callItems[1].contactUrl = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        callItems[1].contactName = "WiFi";
        callItems[1].callTime = "↩ Mobile, 1 hr. ago";

        callItems[2] =  new CallItems();
        callItems[2].contactUrl = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        callItems[2].contactName = "+91 7678605379";
        callItems[2].callTime = "↗ India, 22 hr. ago";

        callItems[3] =  new CallItems();
        callItems[3].contactUrl = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        callItems[3].contactName = "+91 8130592642";
        callItems[3].callTime = "↙ India, 2 days ago";

        callItems[4] =  new CallItems();
        callItems[4].contactUrl = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        callItems[4].contactName = "+91 11 4940 2363";
        callItems[4].callTime = "↙ New Delhi, 2 days ago";

        callItems[5] =  new CallItems();
        callItems[5].contactUrl = "https://cdn1.iconfinder.com/data/icons/user-pictures/100/unknown-128.png";
        callItems[5].contactName = "1909";
        callItems[5].callTime = "↗ 2 days ago";
    }

    public void createAdapter(){
        callsItemAdapter = new CallsItemAdapter(callItems);
    }

    public void connectAdapter(){
        callsRv.setLayoutManager(new LinearLayoutManager(this));
        callsRv.setAdapter(callsItemAdapter);
    }
}
