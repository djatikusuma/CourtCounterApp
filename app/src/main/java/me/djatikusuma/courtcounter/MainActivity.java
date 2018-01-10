package me.djatikusuma.courtcounter;

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

    public void addThreePointA(View v){
        scoreTeamA += 3;
        changeA(scoreTeamA);
    }

    public void addTwoPointA(View v){
        scoreTeamA += 2;
        changeA(scoreTeamA);
    }

    public void addFreePointA(View v){
        scoreTeamA += 1;
        changeA(scoreTeamA);
    }

    public void changeA(int score){
        TextView scoreA = findViewById(R.id.scoreA);
        scoreA.setText(String.valueOf(score));
    }


    public void addThreePointB(View v){
        scoreTeamB += 3;
        changeB(scoreTeamB);
    }

    public void addTwoPointB(View v){
        scoreTeamB += 2;
        changeB(scoreTeamB);
    }

    public void addFreePointB(View v){
        scoreTeamB += 1;
        changeB(scoreTeamB);
    }

    public void changeB(int score){
        TextView scoreB = findViewById(R.id.scoreB);
        scoreB.setText(String.valueOf(score));
    }

    public void resetScore(View v){
        scoreTeamA = 0;
        scoreTeamB = 0;
        changeA(scoreTeamA);
        changeB(scoreTeamB);
    }
}
