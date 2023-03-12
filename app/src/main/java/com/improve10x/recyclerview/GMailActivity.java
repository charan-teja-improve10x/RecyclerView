package com.improve10x.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ListView;

public class GMailActivity extends AppCompatActivity {
    GmailItems[] gmailItems;
    RecyclerView mailsRv;
    GmailItemsAdapter gmailItemsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gmail);
        initViews();
        createData();
        createAdapter();
        connectAdapter();
    }

    private void initViews() {
        mailsRv = findViewById(R.id.mails_rv);
    }

    public void createData(){
        gmailItems = new GmailItems[6];

        gmailItems[0] = new GmailItems();
        gmailItems[0].name = "Lisa Paik";
        gmailItems[0].subject = "Volunteering at the Lakestone student art... Hi Julia! Thank you for interest in volun...";
        gmailItems[0].time = "3:43 PM";
        gmailItems[0].profileUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSiNiRvww3b0g1mQ6T_4I-NtoLPcmZY4qc-eqmyWx5_TxTuHj6NzXnSZfZRulrab516Kk8&usqp=CAU";

        gmailItems[1] = new GmailItems();
        gmailItems[1].name = "▶ Elena Casarosa";
        gmailItems[1].subject = "Portrait special! We,d like to announce a holiday portrait spec...";
        gmailItems[1].time = "11:24 AM";
        gmailItems[1].profileUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSiNiRvww3b0g1mQ6T_4I-NtoLPcmZY4qc-eqmyWx5_TxTuHj6NzXnSZfZRulrab516Kk8&usqp=CAU";

        gmailItems[2] = new GmailItems();
        gmailItems[2].name = "Medium Daily Digest";
        gmailItems[2].subject = "7 Drawing to make you feel better. public... Medium Daily Digest Get Medium for iOS or... ";
        gmailItems[2].time = "6:30 AM";
        gmailItems[2].profileUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSiNiRvww3b0g1mQ6T_4I-NtoLPcmZY4qc-eqmyWx5_TxTuHj6NzXnSZfZRulrab516Kk8&usqp=CAU";

        gmailItems[3] = new GmailItems();
        gmailItems[3].name = "▶ Grace Ellington";
        gmailItems[3].subject = "Volunteer opportunity I would like to inform you of a volunteer op..";
        gmailItems[3].time = "Nov 19";
        gmailItems[3].profileUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSiNiRvww3b0g1mQ6T_4I-NtoLPcmZY4qc-eqmyWx5_TxTuHj6NzXnSZfZRulrab516Kk8&usqp=CAU";

        gmailItems[4] = new GmailItems();
        gmailItems[4].name = "▶ Henri Rousseau";
        gmailItems[4].subject = "Niagra falls pictures Julia, Here are the pictures of Niagra Falls y..";
        gmailItems[4].time = "Nov 19";
        gmailItems[4].profileUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSiNiRvww3b0g1mQ6T_4I-NtoLPcmZY4qc-eqmyWx5_TxTuHj6NzXnSZfZRulrab516Kk8&usqp=CAU";

        gmailItems[5] = new GmailItems();
        gmailItems[5].name = "Olenna Mason";
        gmailItems[5].subject = "Lakestone student art exhibition  You're invited to Lakestone's annual student";
        gmailItems[5].profileUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSiNiRvww3b0g1mQ6T_4I-NtoLPcmZY4qc-eqmyWx5_TxTuHj6NzXnSZfZRulrab516Kk8&usqp=CAU";
    }

    public void createAdapter(){
        gmailItemsAdapter = new GmailItemsAdapter(gmailItems);
    }

    public void connectAdapter(){
        mailsRv.setLayoutManager(new LinearLayoutManager(this));
        mailsRv.setAdapter(gmailItemsAdapter);
    }
    }
