package com.example.arrayof;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class Quiz_Main extends AppCompatActivity {

    public static final String intent_extra_key = "option";
    public static final String intent_extra_value_ar = "Ar";
    public static final String intent_extra__value_en = "En";
    public static final String intent_extra__value_mth = "Mth";
    public static final String intent_extra__value_mth_ar= "Mth_ar";
    public static final String intent_extra__value_mth_en= "Mth_en";
    public static final String intent_extra__value_col = "Col";
    public static final String intent_extra__value_col_ar= "Col_ar";
    public static final String intent_extra__value_col_en= "Col_en";

    public static int grade;
    public int counter=0;
    public static final String intent_extra__counter_key = "index";
    public Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz__main);
        setTitle("Quiz");
    }

    public void arabic_quiz_onClick(View view) {
        intent=new Intent(Quiz_Main.this  ,app_type.class);
        intent.putExtra(intent_extra_key,intent_extra_value_ar);
        intent.putExtra(intent_extra__counter_key,counter);
        startActivity(intent);

    }

    public void english_quiz_onClick(View view) {
        intent=new Intent(Quiz_Main.this  , app_type.class);
        intent.putExtra(intent_extra_key,intent_extra__value_en);
        startActivity(intent);
    }

    public void math_quiz_onClick(View view) {
        intent=new Intent(Quiz_Main.this  ,  Language1.class);
        intent.putExtra(intent_extra_key,intent_extra__value_mth);
        startActivity(intent);
    }

    public void color_quiz_onClick(View view) {
        intent=new Intent(Quiz_Main.this  ,  Language1.class);
        intent.putExtra(intent_extra_key,intent_extra__value_col);
        startActivity(intent);
    }
}
