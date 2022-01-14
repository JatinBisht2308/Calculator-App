package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editTextNumber1,editTextNumber2;
    TextView tvAnswer;
    Button button1,button2,button3,button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextNumber1 = findViewById(R.id.editTextNumber1);
        editTextNumber2 = findViewById(R.id.editTextNumber2);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        tvAnswer = findViewById(R.id.tvAnswer);


    }

    public void btnsum(View view) {
        int num_1 = Integer.parseInt(editTextNumber1.getText().toString());
        int num_2 = Integer.parseInt(editTextNumber2.getText().toString());
        int result = num_1+num_2;
        tvAnswer.setText(String.valueOf(result));
    }
    public void btnsubtract(View view) {
        int num_1 = Integer.parseInt(editTextNumber1.getText().toString());
        int num_2 = Integer.parseInt(editTextNumber2.getText().toString());
        int result = num_1-num_2;
        tvAnswer.setText(String.valueOf(result));
    }
    public void btnmultiply(View view) {
        int num_1 = Integer.parseInt(editTextNumber1.getText().toString());
        int num_2 = Integer.parseInt(editTextNumber2.getText().toString());
        double result = num_1*num_2;
        tvAnswer.setText(String.valueOf(result));
    }
    public void btndivide(View view) {
        int num_1 = Integer.parseInt(editTextNumber1.getText().toString());
        int num_2 = Integer.parseInt(editTextNumber2.getText().toString());
        double result = num_1/num_2;
        tvAnswer.setText(String.valueOf(result));
    }
}