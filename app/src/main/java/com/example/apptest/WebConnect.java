package com.example.apptest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class WebConnect extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.connect_web);

    }

    public void LoadWebPage1(View v){

        Intent intent = new Intent(this, WebActivity.class);
        startActivity(intent);
    }

    public void LoadWebPage2(View v){

        Intent intent = new Intent(this, WebActivity2.class);
        startActivity(intent);
    }

    public void LoadWebPage3(View v){

        Intent intent = new Intent(this, WebActivity3.class);
        startActivity(intent);
    }

}