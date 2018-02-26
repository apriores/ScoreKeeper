package com.example.apriores.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.apriores.scorekeeper.R;

public class MainActivity extends AppCompatActivity {

    int t1Score = 0;
    int t2Score = 0;
    int yellowCardT1 = 0;
    int yellowCardT2 = 0;
    int redCardT1 = 0;
    int redCardT2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



}
