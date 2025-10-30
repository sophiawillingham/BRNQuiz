package com.exam.brnquiz;

import android.content.Intent; //NEW: allows starting another activity
import android.os.Bundle;
import android.widget.Button; //NEW: for accessing the Begin button

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class IntroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //NEW: find the Begin button in the layout
        Button beginButton = findViewById(R.id.button);

        //NEW: set an onClickListener so pressing the button opens QuizActivity
        beginButton.setOnClickListener(v -> {
            //NEW: create an Intent to switch to QuizActivity
            Intent intent = new Intent(IntroActivity.this, QuizActivity.class);
            //NEW: start the QuizActivity when Begin is pressed
            startActivity(intent);
        });
    }
}
