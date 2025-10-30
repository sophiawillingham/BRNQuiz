package com.exam.brnquiz;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class QuizActivity extends AppCompatActivity {

    //Score to track the correct answers
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        //load scoreFragment and questionFragment
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        ScoreFragment scoreFragment = new ScoreFragment();
        QuestionFragment questionFragment = new QuestionFragment();

        //pass the initial score
        Bundle scoreBundle = new Bundle();
        scoreBundle.putInt("score", score);
        scoreFragment.setArguments(scoreBundle);

        ft.replace(R.id.scoreFrag, scoreFragment);
        ft.replace(R.id.quizFrag, questionFragment);
        ft.commit();
    }

    //method called from questionFragment to increment score
    public void increaseScore() {
        score++;
        ScoreFragment scoreFrag = (ScoreFragment) getSupportFragmentManager().findFragmentById(R.id.scoreFrag);
        if (scoreFrag != null) {
            scoreFrag.updateScore(score);
        }
    }
}


