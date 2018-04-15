package com.introlist.djy.androidintrolist;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Intro04Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro04);
    }

    public void btn(View view) {

        Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://cqu.edu.cn"));
        startActivity(mIntent);
    }
}
