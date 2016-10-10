package com.example.android.mtgquiz;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Creating global variables
    int answeredCorrectly = 0;
    String name = "";

    //stores name of the user into a variable called name
    private void parseName() {
        EditText name_of_quiz_taker = (EditText) findViewById(R.id.name_of_quiz_taker);
        name = name_of_quiz_taker.getText().toString();
    }

    //checks to see if question 1 is correct
    private void parseQuestion1() {
        CheckBox q1a1 = (CheckBox) findViewById(R.id.q1a1);
        CheckBox q1a2 = (CheckBox) findViewById(R.id.q1a2);
        CheckBox q1a3 = (CheckBox) findViewById(R.id.q1a3);
        CheckBox q1a4 = (CheckBox) findViewById(R.id.q1a4);

        if (q1a1.isChecked()) {
            return;
        } else if (q1a2.isChecked() && q1a3.isChecked() && q1a4.isChecked()) {
            answeredCorrectly = answeredCorrectly + 1;
        }
    }
    private void parseQuestion2() {
        RadioButton q2a = (RadioButton) findViewById(R.id.q2a);

        if (q2a.isChecked()){
            answeredCorrectly = answeredCorrectly + 1;
        }
    }
    private void parseQuestion3() {
        RadioButton q3a = (RadioButton) findViewById(R.id.q3a);

        if (q3a.isChecked()){
            answeredCorrectly = answeredCorrectly + 1;
        }
    }
    private void parseQuestion4() {
        RadioButton q4a = (RadioButton) findViewById(R.id.q4a);

        if (q4a.isChecked()){
            answeredCorrectly = answeredCorrectly + 1;
        }
    }
    private void parseQuestion5(){
        EditText question_5_answer = (EditText) findViewById(R.id.question_5_answer);
        String q5a = question_5_answer.getText().toString();
        if (q5a.equals("plains") || q5a.equals("Plains")){
            answeredCorrectly = answeredCorrectly + 1;
        }
    }
    public void gradeAnswers(View view) {
        parseName();
        parseQuestion1();
        parseQuestion2();
        parseQuestion3();
        parseQuestion4();
        parseQuestion5();
        Context context = getApplicationContext();
        CharSequence text = name + ", You have answered " + answeredCorrectly + " out of 5 questions correctly!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        answeredCorrectly = 0;
    }
}
