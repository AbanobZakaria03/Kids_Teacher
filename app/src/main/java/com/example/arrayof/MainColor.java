package com.example.arrayof;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class MainColor extends AppCompatActivity {
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
    String option;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_color);
        Bundle b = getIntent().getExtras();
        option = b.getString(Quiz_Main.intent_extra_key);
        counter =b.getInt((Quiz_Main.intent_extra__counter_key));
        counter=0;
    }

    public void learn_onClick(View view) {
        if(option.equals(intent_extra__value_col_ar)){
            intent=new Intent(MainColor.this  ,Color_ar.class);
            intent.putExtra(Quiz_Main.intent_extra_key,intent_extra__value_col_ar);
            intent.putExtra(intent_extra__counter_key,counter);
            startActivity(intent);
        }
            else  if(option.equals(intent_extra__value_col_en)){
            intent=new Intent(MainColor.this  ,Color_en.class);
            intent.putExtra(Quiz_Main.intent_extra_key,intent_extra__value_col_en);
            intent.putExtra(intent_extra__counter_key,counter);
            startActivity(intent);
        }

    }

    public void song_onClick(View view) {
        intent = new Intent(MainColor.this,Song.class);
        intent.putExtra(Quiz_Main.intent_extra_key,option);
        startActivity(intent);
    }
}
