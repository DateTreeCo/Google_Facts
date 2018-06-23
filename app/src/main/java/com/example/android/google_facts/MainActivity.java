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
    RadioButton q1A1;
    RadioButton q1A2;
    RadioButton q1A3;
    RadioButton q1A4;
    EditText q2A;
    RadioButton q3A1;
    RadioButton q3A2;
    CheckBox q4A1;
    CheckBox q4A2;
    CheckBox q4A3;
    CheckBox q4A4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        q1A1 = findViewById(R.id.q1_a1);
        q1A2 = findViewById(R.id.q1_a2);
        q1A3 = findViewById(R.id.q1_a3);
        q1A4 = findViewById(R.id.q1_a4);
        q2A = findViewById(R.id.q2_a);
        q3A1 = findViewById(R.id.q3_a1);
        q3A2 = findViewById(R.id.q3_a2);
        q4A1 = findViewById(R.id.q4_a1);
        q4A2 = findViewById(R.id.q4_a2);
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
        if ((q4A1.isChecked()) && (!q4A2.isChecked()) && (q4A3.isChecked()) && (q4A4.isChecked())) {
            score += 25;
        }

        if (score == 100) {
            Toast.makeText(getApplicationContext(), getString(R.string.correct),
                    Toast.LENGTH_SHORT).show();
        } else if (score == 75) {
            Toast.makeText(getApplicationContext(), getString(R.string.percent_75) + getString(R.string.incorrect),
                    Toast.LENGTH_SHORT).show();
        } else if (score == 50) {
            Toast.makeText(getApplicationContext(), getString(R.string.percent_50) + getString(R.string.incorrect),
                    Toast.LENGTH_SHORT).show();
        } else if (score == 25) {
            Toast.makeText(getApplicationContext(), getString(R.string.percent_25) + getString(R.string.incorrect),
                    Toast.LENGTH_SHORT).show();
        } else if (score == 0) {
            Toast.makeText(getApplicationContext(), getString(R.string.percent_0) + getString(R.string.incorrect),
                    Toast.LENGTH_SHORT).show();
        }
    }

    /*This code is not necessary to save instance state for these view objects as this is handled
    automatically, but is rather a basic how-to for future projects where other object types are not
    automatically handled.

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putBoolean("q1A1State", q1A1.isChecked());
        outState.putBoolean("q1A2State", q1A2.isChecked());
        outState.putBoolean("q1A3State", q1A3.isChecked());
        outState.putBoolean("q1A4State", q1A4.isChecked());
        outState.putString("q2AState", q2A.getText().toString());
        outState.putBoolean("q3A1State", q3A1.isChecked());
        outState.putBoolean("q3A2State", q3A2.isChecked());
        outState.putBoolean("q4A1State", q4A1.isChecked());
        outState.putBoolean("q4A2State", q4A2.isChecked());
        outState.putBoolean("q4A3State", q4A3.isChecked());
        outState.putBoolean("q4A4State", q4A4.isChecked());
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        q1A1.setChecked(savedInstanceState.getBoolean("q1A1State"));
        q1A2.setChecked(savedInstanceState.getBoolean("q1A2State"));
        q1A3.setChecked(savedInstanceState.getBoolean("q1A3State"));
        q1A4.setChecked(savedInstanceState.getBoolean("q1A4State"));
        q2A.setText(savedInstanceState.getString("q2AState"));
        q3A1.setChecked(savedInstanceState.getBoolean("q3A1State"));
        q3A2.setChecked(savedInstanceState.getBoolean("q3A2State"));
        q4A1.setChecked(savedInstanceState.getBoolean("q4A1State"));
        q4A2.setChecked(savedInstanceState.getBoolean("q4A2State"));
        q4A3.setChecked(savedInstanceState.getBoolean("q4A3State"));
        q4A4.setChecked(savedInstanceState.getBoolean("q4A4State"));
    }*/
}
