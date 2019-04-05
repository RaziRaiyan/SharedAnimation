package com.example.sharedanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ActivityShared extends AppCompatActivity {

    ImageView dp;
    TextView tv_name,tv_details;
    Button btn_follow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared);

        dp = findViewById(R.id.dp_large_shared);
        tv_name = findViewById(R.id.name_shared);
        tv_details = findViewById(R.id.details_shared);
        btn_follow = findViewById(R.id.btn_follow_shared);
    }
}
