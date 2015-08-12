package com.kartheek.healthclubapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.kartheek.healthclubapp.task1.LoginActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openTask1(View view) {
        startActivity(new Intent(this, LoginActivity.class));
    }
}
