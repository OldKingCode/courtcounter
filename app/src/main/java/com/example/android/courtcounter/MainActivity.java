package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * this method displays Team B score
     */

    public void displayScoreA(int score) {
        TextView displayText = (TextView) findViewById(R.id.score_a_text);
        displayText.setText(String.valueOf( score));
    }

    /**
     * this button adds three to the Team B score
     */
    public void addThreeButton(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayScoreA(scoreTeamA);
    }


    /**
     * this button adds two to the Team B score
     */
    public void addTwoButton(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayScoreA(scoreTeamA);
    }

    /***
     * this button adds one to the Team B score
     */
    public void addOneButton(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayScoreA(scoreTeamA);
    /**
 * this methods displays the Team B score
 */
    }

    public void displayScoreB(int score) {
        TextView displaytext = (TextView) findViewById(R.id.score_b_text);
        displaytext.setText(String.valueOf( score));

    }


    /**
     * this button adds three to the Team B score
     */
    public void addThreeButtonB(View view) {
        scoreTeamB = scoreTeamB + 3;
        displayScoreB(scoreTeamB);
    }

    /**
     * this button adds two to the Team B score
     */
    public void addTwoButtonB(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayScoreB(scoreTeamB);

    }

    /**
     * this button adds one to the Team B score
     */

    public void addOneButtonB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayScoreB(scoreTeamB);
    }



    public  void resetButton(View view)
    {
        scoreTeamB=0;
        scoreTeamA=0;
        displayScoreB(scoreTeamB);
        displayScoreA(scoreTeamA);

    }
}
