package com.example.sharedanimation;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RelativeLayout mRelativeLayout;

    TextView tv_name,tv_details;
    ImageView imgDP;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRelativeLayout = findViewById(R.id.main_relative);

        tv_name = findViewById(R.id.main_name);
        tv_details = findViewById(R.id.main_detail);
        imgDP = findViewById(R.id.dp_small);

        mRelativeLayout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent sharedIntent = new Intent(MainActivity.this,ActivityShared.class);
                Pair[] pairs = new Pair[3];
                pairs[0] = new Pair<View,String>(imgDP,"imageTransition");
                pairs[1] = new Pair<View,String>(tv_name,"nameTransition");
                pairs[2] = new Pair<View,String>(tv_details,"detailsTransition");
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this,pairs);
                startActivity(sharedIntent,options.toBundle());
            }
        });
    }
}
