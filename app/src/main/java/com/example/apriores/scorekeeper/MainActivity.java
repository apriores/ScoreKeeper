package com.example.apriores.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.apriores.scorekeeper.R;

public class MainActivity extends AppCompatActivity {

    int team1Score = 0;
    int team2Score = 0;
    int yellowCardTeam1 = 0;
    int yellowCardTeam2 = 0;
    int redCardTeam1 = 0;
    int redCardTeam2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayTeam1Score(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team1_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayTeam2Score(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team2_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayTeam1YellowCard(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team1_yellow_card);
        scoreView.setText(String.valueOf(score));
    }

    public void displayTeam2YellowCard(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team2_yellow_card);
        scoreView.setText(String.valueOf(score));
    }

    public void displayTeam1RedCard(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team1_red_card);
        scoreView.setText(String.valueOf(score));
    }

    public void displayTeam2RedCard(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team2_red_card);
        scoreView.setText(String.valueOf(score));
    }

    public void addScoreT1(View v) {
        team1Score = team1Score + 1;
        displayTeam1Score(team1Score);
    }

    public void addScoreT2(View v) {
        team2Score = team2Score +1;
        displayTeam2Score(team2Score);
    }

    public void addYellowOnT1(View v) {
        yellowCardTeam1 = yellowCardTeam1 + 1;
        displayTeam1YellowCard(yellowCardTeam1);
    }

    public void addYellowOnT2(View v) {
        yellowCardTeam2 = yellowCardTeam2 + 1;
        displayTeam2YellowCard(yellowCardTeam2);
    }

    public void addRedOnT1(View v) {
        redCardTeam1 = redCardTeam1 + 1;
        displayTeam1RedCard(redCardTeam1);
    }

    public void addRedOnT2(View v) {
        redCardTeam2 = redCardTeam2 + 1;
        displayTeam2RedCard(redCardTeam2);
    }

    public void resetScore(View v) {
        team1Score = 0;
        team2Score = 0;
        yellowCardTeam1 = 0;
        yellowCardTeam2 = 0;
        redCardTeam1 = 0;
        redCardTeam2 = 0;
        displayTeam1Score(team1Score);
        displayTeam2Score(team2Score);
        displayTeam1YellowCard(yellowCardTeam1);
        displayTeam2YellowCard(yellowCardTeam2);
        displayTeam1RedCard(redCardTeam1);
        displayTeam2RedCard(redCardTeam2);
    }

}
