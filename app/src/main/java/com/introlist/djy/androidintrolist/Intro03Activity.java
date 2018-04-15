package com.introlist.djy.androidintrolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Intro03Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro03);
    }

    public void mBtn(View view) {
        Toast.makeText(this, " You clicked the button", Toast.LENGTH_LONG).show();
    }
}
