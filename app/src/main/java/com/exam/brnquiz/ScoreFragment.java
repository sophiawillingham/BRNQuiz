package com.exam.brnquiz;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class ScoreFragment extends Fragment {

    private TextView scoreNumber;

    public ScoreFragment() { }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_score, container, false);
        scoreNumber = view.findViewById(R.id.score_number);

        //NEW: Set initial score
        Bundle args = getArguments();
        if (args != null) {
            int initialScore = args.getInt("score", 0);
            scoreNumber.setText(String.valueOf(initialScore));
        }

        return view;
    }

    //NEW: Update score dynamically
    public void updateScore(int newScore) {
        if (scoreNumber != null) {
            scoreNumber.setText(String.valueOf(newScore));
        }
    }
}
