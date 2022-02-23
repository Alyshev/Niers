package com.example.english;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ActivityTwo extends AppCompatActivity {

    public int i;
    public int score;
    public int complexity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        complexity = getIntent().getIntExtra("complexity", -1);

        String [][][] arr =
                        {{{"1праворпаво паовропавр рпаворполавпа рпоав","11","12","13","1"},
                        {"1праворпаво паовропавр рпаворполавпа рпоав","14","15","16","2"},
                        {"1праворпаво паовропавр рпаворполавпа рпоав","17","18","19","3"}},


                        {{"2праворпаво паовропавр рпаворполавпа рпоав","21","22","23","1"},
                        {"2праворпаво паовропавр рпаворполавпа рпоав","24","25","26","2"},
                        {"2праворпаво паовропавр рпаворполавпа рпоав","24","25","26","2"},
                        {"2праворпаво паовропавр рпаворполавпа рпоав","27","28","29","3"}}};
                            //{вопрос,ответ1,ответ2,ответ3,номер верного ответа}


        i = 0;
        score = 0;

        Button Button1 = findViewById(R.id.button1);
        Button Button2 = findViewById(R.id.button2);
        Button Button3 = findViewById(R.id.button3);
        TextView Txt = findViewById(R.id.txt);

        Button1.setText(String.format(getString(R.string.text), arr[complexity][i][1]));
        Button2.setText(String.format(getString(R.string.text), arr[complexity][i][2]));
        Button3.setText(String.format(getString(R.string.text), arr[complexity][i][3]));
        Txt.setText(String.format(getString(R.string.text), arr[complexity][i][0]));

        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (arr[complexity][i][4] == "1") {
                    score ++;
                }

                i++;
                if (i < arr[complexity].length) {
                    Button1.setText(String.format(getString(R.string.text), arr[complexity][i][1]));
                    Button2.setText(String.format(getString(R.string.text), arr[complexity][i][2]));
                    Button3.setText(String.format(getString(R.string.text), arr[complexity][i][3]));
                    Txt.setText(String.format(getString(R.string.text), arr[complexity][i][0]));


                }
                else {
                    Intent i = new Intent(ActivityTwo.this, Result.class);

                    i.putExtra("score", score);
                    i.putExtra("MaxScore", arr[complexity].length);

                    startActivity(i);
                    finish();
                }
            }



        });

        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (arr[complexity][i][4] == "2") {
                    score ++;
                }

                i++;
                if (i < arr[complexity].length) {
                    Button1.setText(String.format(getString(R.string.text), arr[complexity][i][1]));
                    Button2.setText(String.format(getString(R.string.text), arr[complexity][i][2]));
                    Button3.setText(String.format(getString(R.string.text), arr[complexity][i][3]));
                    Txt.setText(String.format(getString(R.string.text), arr[complexity][i][0]));


                }
                else {

                    Intent i = new Intent(ActivityTwo.this, Result.class);

                    i.putExtra("score", score);
                    i.putExtra("MaxScore", arr[complexity].length);

                    startActivity(i);
                    finish();
                }
            }
        });

        Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (arr[complexity][i][4] == "3") {
                    score ++;
                }

                i++;
                if (i < arr[complexity].length) {
                    Button1.setText(String.format(getString(R.string.text), arr[complexity][i][1]));
                    Button2.setText(String.format(getString(R.string.text), arr[complexity][i][2]));
                    Button3.setText(String.format(getString(R.string.text), arr[complexity][i][3]));
                    Txt.setText(String.format(getString(R.string.text), arr[complexity][i][0]));


                }
                else {
                    Intent i = new Intent(ActivityTwo.this, Result.class);

                    i.putExtra("score", score);
                    i.putExtra("MaxScore", arr[complexity].length);

                    startActivity(i);
                    finish();
                }
            }
        });




    }


}