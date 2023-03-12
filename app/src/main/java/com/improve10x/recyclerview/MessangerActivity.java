package com.improve10x.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MessangerActivity extends AppCompatActivity {
    MessangerItem[] messangerItems;
    RecyclerView messangerRv;
    MessangerItemAdapter messangerItemAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messanger);
        initViews();
        createData();
        createAdapter();
        connectAdapter();
    }

    private void initViews() {
        messangerRv = findViewById(R.id.messanger_rv);
    }

    public void createData() {
        messangerItems = new MessangerItem[6];

        messangerItems[0] = new MessangerItem();
        messangerItems[0].name = "Sam Scott";
        messangerItems[0].message = "Hey how's it going";
        messangerItems[0].profileIdUrl = "https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/5952bfa6-4594-4d7c-bee6-0b5a3988a099/dapn32z-2a11b870-38b2-4caf-ba16-5bbe9a84fe7f.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiJcL2ZcLzU5NTJiZmE2LTQ1OTQtNGQ3Yy1iZWU2LTBiNWEzOTg4YTA5OVwvZGFwbjMyei0yYTExYjg3MC0zOGIyLTRjYWYtYmExNi01YmJlOWE4NGZlN2YucG5nIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.Qdeo-Cdvh5tAKDTJUhS44oqIL4H-hwTpCO_ZGGHhqHM";

        messangerItems[1] = new MessangerItem();
        messangerItems[1].name = "Mai Tran";
        messangerItems[1].message = "Mai sent a sticker";
        messangerItems[1].profileIdUrl = "https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/5952bfa6-4594-4d7c-bee6-0b5a3988a099/dapn32z-2a11b870-38b2-4caf-ba16-5bbe9a84fe7f.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiJcL2ZcLzU5NTJiZmE2LTQ1OTQtNGQ3Yy1iZWU2LTBiNWEzOTg4YTA5OVwvZGFwbjMyei0yYTExYjg3MC0zOGIyLTRjYWYtYmExNi01YmJlOWE4NGZlN2YucG5nIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.Qdeo-Cdvh5tAKDTJUhS44oqIL4H-hwTpCO_ZGGHhqHM";

        messangerItems[2] = new MessangerItem();
        messangerItems[2].name = "Emmie Baros";
        messangerItems[2].message = "Hi again :)";
        messangerItems[2].profileIdUrl = "https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/5952bfa6-4594-4d7c-bee6-0b5a3988a099/dapn32z-2a11b870-38b2-4caf-ba16-5bbe9a84fe7f.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiJcL2ZcLzU5NTJiZmE2LTQ1OTQtNGQ3Yy1iZWU2LTBiNWEzOTg4YTA5OVwvZGFwbjMyei0yYTExYjg3MC0zOGIyLTRjYWYtYmExNi01YmJlOWE4NGZlN2YucG5nIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.Qdeo-Cdvh5tAKDTJUhS44oqIL4H-hwTpCO_ZGGHhqHM";

        messangerItems[3] = new MessangerItem();
        messangerItems[3].name = "Jarge Torres";
        messangerItems[3].message = "Can't wait!";
        messangerItems[3].profileIdUrl = "https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/5952bfa6-4594-4d7c-bee6-0b5a3988a099/dapn32z-2a11b870-38b2-4caf-ba16-5bbe9a84fe7f.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiJcL2ZcLzU5NTJiZmE2LTQ1OTQtNGQ3Yy1iZWU2LTBiNWEzOTg4YTA5OVwvZGFwbjMyei0yYTExYjg3MC0zOGIyLTRjYWYtYmExNi01YmJlOWE4NGZlN2YucG5nIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.Qdeo-Cdvh5tAKDTJUhS44oqIL4H-hwTpCO_ZGGHhqHM";

        messangerItems[4] = new MessangerItem();
        messangerItems[4].name = "Maria & Soumya";
        messangerItems[4].message = "Nice";
        messangerItems[4].profileIdUrl = "https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/5952bfa6-4594-4d7c-bee6-0b5a3988a099/dapn32z-2a11b870-38b2-4caf-ba16-5bbe9a84fe7f.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiJcL2ZcLzU5NTJiZmE2LTQ1OTQtNGQ3Yy1iZWU2LTBiNWEzOTg4YTA5OVwvZGFwbjMyei0yYTExYjg3MC0zOGIyLTRjYWYtYmExNi01YmJlOWE4NGZlN2YucG5nIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.Qdeo-Cdvh5tAKDTJUhS44oqIL4H-hwTpCO_ZGGHhqHM";

        messangerItems[5] = new MessangerItem();
        messangerItems[5].name = "Surf Team";
        messangerItems[5].message = "See you there 😎";
        messangerItems[5].profileIdUrl = "https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/5952bfa6-4594-4d7c-bee6-0b5a3988a099/dapn32z-2a11b870-38b2-4caf-ba16-5bbe9a84fe7f.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiJcL2ZcLzU5NTJiZmE2LTQ1OTQtNGQ3Yy1iZWU2LTBiNWEzOTg4YTA5OVwvZGFwbjMyei0yYTExYjg3MC0zOGIyLTRjYWYtYmExNi01YmJlOWE4NGZlN2YucG5nIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.Qdeo-Cdvh5tAKDTJUhS44oqIL4H-hwTpCO_ZGGHhqHM";
    }

    public void createAdapter() {
        messangerItemAdapter = new MessangerItemAdapter(messangerItems);
    }

    public void connectAdapter() {
        messangerRv.setLayoutManager(new LinearLayoutManager(this));
        messangerRv.setAdapter(messangerItemAdapter);
    }
}