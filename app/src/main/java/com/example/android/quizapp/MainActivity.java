package com.example.android.quizapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    //The below highlights the correct answers to each questions.
    // Question 1
    RadioButton question1_choice1;
    // Question 2
    RadioButton question2_choice3;
    // Question 3
    RadioButton question3_choice3;
    // Question 4
    CheckBox question4_choice1;
    CheckBox question4_choice2;
    CheckBox question4_choice3;
    CheckBox question4_choice4;
    // Question 5
    CheckBox question5_choice1;
    CheckBox question5_choice2;
    CheckBox question5_choice3;
    CheckBox question5_choice4;
    // Question 6
    EditText question6_answer;
    // Question 7
    EditText question7_answer;
    // Question 8
    EditText question8_answer;
    // Question 9
    EditText question9_answer;
    // Question 10
    EditText question10_answer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Hides the keyboard upon startup
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        setContentView(R.layout.activity_main);

    }


    public void Submit(View view) {
        CharSequence resultsDisplay;
        Log.e(LOG_TAG, " " + this.findViewById(R.id.question3_choice3));
        int answer1_score;
        int answer2_score;
        int answer3_score;
        int answer4_score;
        int answer5_score;
        int answer6_score;
        int answer7_score;
        int answer8_score;
        int answer9_score;
        int answer10_score;
        int final_score;

        // Question 1 - Correct Answer is option 1 "Abdulsaleem Abubaka"
        Boolean answer1;

        question1_choice1 = (RadioButton) this.findViewById(R.id.question1_choice1);
        answer1 = question1_choice1.isChecked();
        if (answer1) {
            answer1_score = 1;
        } else {
            answer1_score = 0;
        }

        // Question 2  - Correct Answers is option 3 "54"
        Boolean answer2;
        question2_choice3 = (RadioButton) this.findViewById(R.id.question2_choice3);
        answer2 = question2_choice3.isChecked();
        if (answer2) {
            answer2_score = 1;
        } else {
            answer2_score = 0;
        }

        // Question 3  - Correct Answers is option 3 "Arnold Smith"
        Boolean answer3;
        question3_choice3 = (RadioButton) this.findViewById(R.id.question3_choice3);
        answer3 = question3_choice3.isChecked();
        if (answer3) {
            answer3_score = 1;
        } else {
            answer3_score = 0;
        }

        // Question 4  - Correct Answers are option 3 (1966) and option 4 (1959)
        Boolean answer4_choice1;
        Boolean answer4_choice2;
        Boolean answer4_choice3;
        Boolean answer4_choice4;
        question4_choice1 = (CheckBox) this.findViewById(R.id.question4_choice1);
        question4_choice2 = (CheckBox) this.findViewById(R.id.question4_choice2);
        question4_choice3 = (CheckBox) this.findViewById(R.id.question4_choice3);
        question4_choice4 = (CheckBox) this.findViewById(R.id.question4_choice4);
        answer4_choice1 = question4_choice1.isChecked();
        answer4_choice2 = question4_choice2.isChecked();
        answer4_choice3 = question4_choice3.isChecked();
        answer4_choice4 = question4_choice4.isChecked();
        if (!answer4_choice1 && !answer4_choice2 && answer4_choice3 && answer4_choice4) {
            answer4_score = 1;
        } else {
            answer4_score = 0;
        }

        // Question 5  - Correct Answers are option 1 (1967) and option 3 (1970)
        Boolean answer5_choice1;
        Boolean answer5_choice2;
        Boolean answer5_choice3;
        Boolean answer5_choice4;
        question5_choice1 = (CheckBox) this.findViewById(R.id.question5_choice1);
        question5_choice2 = (CheckBox) this.findViewById(R.id.question5_choice2);
        question5_choice3 = (CheckBox) this.findViewById(R.id.question5_choice3);
        question5_choice4 = (CheckBox) this.findViewById(R.id.question5_choice4);
        answer5_choice1 = question5_choice1.isChecked();
        answer5_choice2 = question5_choice2.isChecked();
        answer5_choice3 = question5_choice3.isChecked();
        answer5_choice4 = question5_choice4.isChecked();
        if (answer5_choice1 && !answer5_choice2 && answer5_choice3 && !answer5_choice4) {
            answer5_score = 1;
        } else {
            answer5_score = 0;
        }

        // Question 6 - Correct Answer is "Strength"
        String answer6;
        question6_answer = (EditText) this.findViewById(R.id.question6_answer);
        answer6 = question6_answer.getText().toString().toLowerCase().trim();
        if (answer6.equals("strength")) {
            answer6_score = 1;
        } else {
            answer6_score = 0;
        }

        // Question 7 - Correct Answer is "Six"
        String answer7;
        question7_answer = (EditText) this.findViewById(R.id.question7_answer);
        answer7 = question7_answer.getText().toString().toLowerCase().trim();
        if (answer7.equals("six")) {
            answer7_score = 1;
        } else {
            answer7_score = 0;
        }

        // Question 8 - Correct Answer is "Grace Williams"
        String answer8;
        question8_answer = (EditText) this.findViewById(R.id.question8_answer);
        answer8 = question8_answer.getText().toString().toLowerCase().trim();
        if (answer8.equals("grace williams")) {
            answer8_score = 1;
        } else {
            answer8_score = 0;
        }

        // Question 9 - Correct Answer is "1914"
        String answer9;
        question9_answer = (EditText) this.findViewById(R.id.question9_answer);
        answer9 = question9_answer.getText().toString().toLowerCase().trim();
        if (answer9.equals("1914")) {
            answer9_score = 1;
        } else {
            answer9_score = 0;
        }

        // Question 10 - Correct Answer is "Herbert Macaulay"
        String answer10;
        question10_answer = (EditText) this.findViewById(R.id.question10_answer);
        answer10 = question10_answer.getText().toString().toLowerCase().trim();
        if (answer10.equals("herbert macaulay")) {
            answer10_score = 1;
        } else {
            answer10_score = 0;
        }

        // Final Score
        final_score = answer1_score + answer2_score + answer3_score + answer4_score + answer5_score +
                answer6_score + answer7_score + answer8_score + answer9_score + answer10_score;

        if (final_score == 10) {
            resultsDisplay = "Perfect! You scored 10 out of 10";
        } else {
            resultsDisplay = "Try again. You scored " + final_score + " out of 10";
        }

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, resultsDisplay, duration);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }

}


