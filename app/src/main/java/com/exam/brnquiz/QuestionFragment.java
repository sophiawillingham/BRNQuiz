package com.exam.brnquiz;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Random;


public class QuestionFragment extends Fragment {

    private ListView listView;
    private Button submitButton;
    private int selectedPosition = -1;

    //example question and 6 options
    private String question = "What is the capital of Colombia?";
    private String[] answers = {"Medellin", "Madrid", "Bogota", "Washington DC", "What is Colombia", "None of the above"};


    public QuestionFragment() { }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_question, container, false);

        TextView questionText = view.findViewById(R.id.question_text);
        questionText.setText(question);

        listView = view.findViewById(R.id.answers_list);
        submitButton = view.findViewById(R.id.submit_button);

        //ListView with single choice
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getContext(),
                android.R.layout.simple_list_item_single_choice, answers);
        listView.setAdapter(adapter);
        listView.setChoiceMode(ListView.CHOICE_MODE_SINGLE);

        //listens for selection
        listView.setOnItemClickListener((parent, v, position, id) -> selectedPosition = position);

        //checks answer
        submitButton.setOnClickListener(v -> {
            if (selectedPosition == -1) {
                Toast.makeText(getContext(), "please select an answer", Toast.LENGTH_SHORT).show();
                return;
            }

            if (selectedPosition == 2) { // correct answer index = 2 (bogota)
                ((QuizActivity) getActivity()).increaseScore();
                Toast.makeText(getContext(), "yay!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getContext(), "Wrong! Use your BRN(AI)", Toast.LENGTH_SHORT).show();
            }

            //EC: disable selection after submitting
            submitButton.setEnabled(false);
        });

        return view;
    }
}

