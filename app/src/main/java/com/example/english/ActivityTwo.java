package com.example.english;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityTwo extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        String [][] arr = {{"123","1","2","3"},
                {"456","4","5","6"},
                {"789","7","8","9"}};




        Button Button1 = findViewById(R.id.button1);
        Button Button2 = findViewById(R.id.button2);
        Button Button3 = findViewById(R.id.button3);
        TextView Question = findViewById(R.id.question);

        Button1.setText(String.format(getString(R.string.text), arr[0][1]));
        Button2.setText(String.format(getString(R.string.text), arr[0][2]));
        Button3.setText(String.format(getString(R.string.text), arr[0][3]));
        Question.setText(String.format(getString(R.string.text), arr[0][0]));


        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }


        });

        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



            }
        });

        Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



            }
        });



    }
}