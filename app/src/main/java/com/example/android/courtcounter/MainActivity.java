package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA = 0, scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add3ToA(View view) {
        scoreA += 3;
        displayForTeamA(scoreA);
    }

    public void add2ToA(View view) {
        scoreA += 2;
        displayForTeamA(scoreA);
    }

    public void add1ToA(View view) {
        scoreA += 1;
        displayForTeamA(scoreA);
    }

    public void add3ToB(View view) {
        scoreB += 3;
        displayForTeamB(scoreB);
    }

    public void add2ToB(View view) {
        scoreB += 2;
        displayForTeamB(scoreB);
    }

    public void add1ToB(View view) {
        scoreB += 1;
        displayForTeamB(scoreB);
    }

    public void Reset(View view) {
        scoreB = 0;
        scoreA = 0;
        displayForTeamB(scoreB);
        displayForTeamA(scoreA);
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamB_a_score);
        scoreView.setText(String.valueOf(score));
    }

}
