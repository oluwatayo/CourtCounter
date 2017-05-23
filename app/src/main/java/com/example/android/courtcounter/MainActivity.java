package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
    }
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    public void plus_three_a(View view){
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }
    public void plus_two_a(View view){
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }
    public void plus_one_a(View view){
        scoreTeamA ++; displayForTeamA(scoreTeamA);
    }
    public void plus_three_b(View view){
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }
    public void plus_two_b(View view){
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }
    public void plus_one_b(View view){
        scoreTeamB ++; displayForTeamB(scoreTeamB);
    }
    public void reset(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamB(scoreTeamB);
        displayForTeamA(scoreTeamA);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
