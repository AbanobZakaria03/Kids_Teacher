package com.example.arrayof;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

public class app_type extends AppCompatActivity {
String option;
Intent intent;
int counter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_type);
        Bundle b = getIntent().getExtras();
        option = b.getString(Quiz_Main.intent_extra_key);
        counter =b.getInt((Quiz_Main.intent_extra__counter_key));
        counter=0;
    }

    public void learn_onClick(View view) {
        if (option.equals(Quiz_Main.intent_extra__value_en)) {
            intent = new Intent(app_type.this, Main2Activity.class);
            intent.putExtra(Quiz_Main.intent_extra_key, Quiz_Main.intent_extra__value_en);
            intent.putExtra(Quiz_Main.intent_extra__counter_key, counter);
            startActivity(intent);

        } else if (option.equals(Quiz_Main.intent_extra_value_ar)) {
            intent = new Intent(app_type.this, MainActivity.class);
            intent.putExtra(Quiz_Main.intent_extra_key, Quiz_Main.intent_extra_value_ar);
            intent.putExtra(Quiz_Main.intent_extra__counter_key, counter);
            startActivity(intent);
        } else if (option.equals(Quiz_Main.intent_extra__value_mth_ar)) {
            intent = new Intent(app_type.this, Number_ar.class);
            startActivity(intent);
            /*
            intent.putExtra(Quiz_Main.intent_extra_key, Quiz_Main.intent_extra__value_mth_ar);
            intent.putExtra(Quiz_Main.intent_extra__counter_key, counter);
            startActivity(intent);
            */
        }
        else if (option.equals(Quiz_Main.intent_extra__value_mth_en)) {
            intent = new Intent(app_type.this, Number_en.class);
            intent.putExtra(Quiz_Main.intent_extra_key, Quiz_Main.intent_extra__value_mth_en);
            intent.putExtra(Quiz_Main.intent_extra__counter_key, counter);
            startActivity(intent);
        }

    }
    public void song_onClick(View view) {

            intent = new Intent(app_type.this, Song.class);
            intent.putExtra(Quiz_Main.intent_extra_key, option);
            intent.putExtra(Quiz_Main.intent_extra__counter_key, counter);
            startActivity(intent);
    }

    public void quiz_onClick(View view) {
        Quiz_Main.grade=0;
        intent = new Intent(app_type.this, Choose_quiz.class);
        intent.putExtra(Quiz_Main.intent_extra_key, option);
        intent.putExtra(Quiz_Main.intent_extra__counter_key, counter);
        startActivity(intent);
    }
}
