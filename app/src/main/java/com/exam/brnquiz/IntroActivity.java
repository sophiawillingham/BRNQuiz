package com.exam.brnquiz;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.graphics.Color;
import android.widget.Button;
import java.util.Random;
import android.content.Intent;

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

        Button beginButton = findViewById(R.id.button);

 //random button color each time the app launches

        Random random = new Random();
        int red = random.nextInt(100);
        int green = random.nextInt(100);
        int blue = random.nextInt(100);
        int randomColor = Color.rgb(red, green, blue);
        beginButton.setBackgroundColor(randomColor);

        beginButton.setOnClickListener(v -> {
            Intent intent = new Intent(IntroActivity.this, QuizActivity.class);
            startActivity(intent);
        });

        //pressing the button opens QuizActivity
        beginButton.setOnClickListener(v -> {
            //intent to switch to QuizActivity
            Intent intent = new Intent(IntroActivity.this, QuizActivity.class);
            //start when begin is pressed
            startActivity(intent);
        });
    }
}
