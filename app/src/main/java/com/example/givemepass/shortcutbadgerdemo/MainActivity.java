package com.example.givemepass.shortcutbadgerdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import me.leolin.shortcutbadger.ShortcutBadger;

public class MainActivity extends AppCompatActivity {

    private Button remove;
    private Button add;
    private Button sub;
    public int badgeCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        remove = (Button) findViewById(R.id.btn);
        remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                badgeCount = 0;
                ShortcutBadger.removeCount(MainActivity.this);
            }
        });
        add = (Button) findViewById(R.id.add);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                badgeCount++;
                ShortcutBadger.applyCount(MainActivity.this, badgeCount);
            }
        });
        sub = (Button) findViewById(R.id.subtraction);
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                badgeCount--;
                ShortcutBadger.applyCount(MainActivity.this, badgeCount);
            }
        });
    }
}
