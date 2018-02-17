package com.r4dixx.cheesywintercontest;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Point values
    int pointsForTartiflette = 1;
    int pointsForRaclette = 2;
    int pointsForFondue = 3;

    // Tracks the scores
    int scorePlayer1 = 0;
    int scorePlayer2 = 0;
    int verdictValue = 0;
    String verdictComment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Adds 1 to the score for Player 1 and 150g to verdict value
    public void scorePlusOne1(View view) {
        scorePlayer1 = scorePlayer1 + pointsForTartiflette;
        verdictValue = verdictValue + 150;
        verdictComment = getString(R.string.textVerdictComment2);
        displayForPlayer1(scorePlayer1);
        displayVerdict(verdictValue + getString(R.string.unit));
        displayVerdictComment(verdictComment);

    }

    // Adds 2 to the score for Player 1 and 200g to verdict value
    public void scorePlusTwo1(View view) {
        scorePlayer1 = scorePlayer1 + pointsForRaclette;
        verdictValue = verdictValue + 200;
        verdictComment = getString(R.string.textVerdictComment2);
        displayForPlayer1(scorePlayer1);
        displayVerdict(verdictValue + getString(R.string.unit));
        displayVerdictComment(verdictComment);
    }

    // Adds 3 to the score for Player 1 and 250g to verdict value
    public void scorePlusThree1(View view) {
        scorePlayer1 = scorePlayer1 + pointsForFondue;
        verdictValue = verdictValue + 250;
        verdictComment = getString(R.string.textVerdictComment2);
        displayForPlayer1(scorePlayer1);
        displayVerdict(verdictValue + getString(R.string.unit));
        displayVerdictComment(verdictComment);
    }

    // Adds 1 to the score for Player 2 and 150g to verdict value
    public void scorePlusOne2(View view) {
        scorePlayer2 = scorePlayer2 + pointsForTartiflette;
        verdictValue = verdictValue + 150;
        verdictComment = getString(R.string.textVerdictComment2);
        displayForPlayer2(scorePlayer2);
        displayVerdict(verdictValue + getString(R.string.unit));
        displayVerdictComment(verdictComment);
    }

    // Adds 2 to the score for Player 2 and 200g to verdict value
    public void scorePlusTwo2(View view) {
        scorePlayer2 = scorePlayer2 + pointsForRaclette;
        verdictValue = verdictValue + 200;
        verdictComment = getString(R.string.textVerdictComment2);
        displayForPlayer2(scorePlayer2);
        displayVerdict(verdictValue + getString(R.string.unit));
        displayVerdictComment(verdictComment);
    }

    // Adds 3 to the score for Player 2 and 250g to verdict value
    public void scorePlusThree2(View view) {
        scorePlayer2 = scorePlayer2 + pointsForFondue;
        verdictValue = verdictValue + 250;
        verdictComment = getString(R.string.textVerdictComment2);
        displayForPlayer2(scorePlayer2);
        displayVerdict(verdictValue + getString(R.string.unit));
        displayVerdictComment(verdictComment);
    }

    // Resets scores and verdict text and comment
    public void scoreReset(View view) {
        scorePlayer1 = 0;
        scorePlayer2 = 0;
        verdictValue = 0;
        verdictComment = getString(R.string.textVerdictComment3);
        displayForPlayer1(scorePlayer1);
        displayForPlayer2(scorePlayer2);
        displayVerdict(verdictValue + getString(R.string.unit));
        displayVerdictComment(verdictComment);
    }

    // Displays the score for Player 1 and updates verdict text and value
    public void displayForPlayer1(int scorePlayer1) {
        TextView scoreView = findViewById(R.id.player_one_score);
        scoreView.setText(String.valueOf(scorePlayer1));
    }

    // Displays the score for Player 2 and updates verdict text and value
    public void displayForPlayer2(int scorePlayer2) {
        TextView scoreView = findViewById(R.id.player_two_score);
        scoreView.setText(String.valueOf(scorePlayer2));
    }

    // Displays the total amount of cheese eaten (verdict)
    public void displayVerdict(String verdictValue) {
        TextView scoreView = findViewById(R.id.verdictValue);
        scoreView.setText(String.valueOf(verdictValue));
    }

    // Displays a comment for verdict
    public void displayVerdictComment(String verdictComment) {
        TextView scoreView = findViewById(R.id.textVerdictComment);
        scoreView.setText(String.valueOf(verdictComment));
    }
}