package com.example.english;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    public int score;
    public int maxScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Button ButtonClose = findViewById(R.id.buttonClose);
        TextView TextResult = findViewById(R.id.textResult);

        score = getIntent().getIntExtra("score", -1);
        maxScore = getIntent().getIntExtra("MaxScore", -1);

        TextResult.setText(String.format(getString(R.string.strResult), String.valueOf(score), String.valueOf(maxScore)));


        ButtonClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();

            }
        });

    }
}