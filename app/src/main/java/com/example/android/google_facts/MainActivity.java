package com.example.android.google_facts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int score;
    RadioButton q1A2;
    EditText q2A;
    RadioButton q3A1;
    CheckBox q4A1;
    CheckBox q4A3;
    CheckBox q4A4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        q1A2 = findViewById(R.id.q1_a2);
        q2A = findViewById(R.id.q2_a);
        q3A1 = findViewById(R.id.q3_a1);
        q4A1 = findViewById(R.id.q4_a1);
        q4A3 = findViewById(R.id.q4_a3);
        q4A4 = findViewById(R.id.q4_a4);
    }

    /**
     * This method is called when the SUBMIT button is clicked. It calculates the score and displays
     * a TOAST message with the score.
     */
    public void submitQuiz(View view) {
        score = 0;
        if (q1A2.isChecked()) {
            score += 25;
        }
        if (q2A.getText().toString().equals("100")) {
            score += 25;
        }
        if (q3A1.isChecked()) {
            score += 25;
        }
        if ((q4A1.isChecked()) && (q4A3.isChecked()) && (q4A4.isChecked())) {
            score += 25;
        }
        if (score == 0) {
            Toast.makeText(getApplicationContext(), getString(R.string.incorrect_0),
                    Toast.LENGTH_LONG).show();
        }
        if (score == 25) {
            Toast.makeText(getApplicationContext(), getString(R.string.incorrect_25),
                    Toast.LENGTH_LONG).show();
        }
        if (score == 50) {
            Toast.makeText(getApplicationContext(), getString(R.string.incorrect_50),
                    Toast.LENGTH_LONG).show();
        }
        if (score == 75) {
            Toast.makeText(getApplicationContext(), getString(R.string.incorrect_75),
                    Toast.LENGTH_LONG).show();
        }
        if (score == 100) {
            Toast.makeText(getApplicationContext(), getString(R.string.correct),
                    Toast.LENGTH_LONG).show();
        }
    }
}
