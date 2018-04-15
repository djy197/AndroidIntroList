package com.introlist.djy.androidintrolist;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;

public class Intro05Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Connect this java file with the xml layout
        setContentView(R.layout.activity_intro05);

        // Connect the Button and set the onClick listener
        (findViewById(R.id.btn)).setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getBaseContext(), Intro05_1Activity.class);
                startActivity(intent);
            }
        });
    }
}
