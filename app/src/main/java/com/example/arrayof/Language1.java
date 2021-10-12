package com.example.arrayof;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class Language1 extends AppCompatActivity {
    public static final String intent_extra_value_ar = "Ar";
    public static final String intent_extra__value_en = "En";
    public static final String intent_extra__value_mth= "Mth";
    public static final String intent_extra__value_mth_ar = "Mth_ar";
    public static final String intent_extra__value_mth_en = "Mth_en";
    public static final String intent_extra__value_col = "Col";
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
        setContentView(R.layout.activity_language1);
        Bundle b = getIntent().getExtras();
        option = b.getString(Quiz_Main.intent_extra_key);
        counter = b.getInt(Quiz_Main.intent_extra__counter_key);

    }

    public void arabic_quiz_onClick(View view) {
        if(option.equals(intent_extra__value_mth)){
            intent=new Intent(Language1.this  ,app_type.class);
            intent.putExtra(Quiz_Main.intent_extra_key,intent_extra__value_mth_ar);
            intent.putExtra(intent_extra__counter_key,counter);
            startActivity(intent);
        }
        else  if(option.equals(intent_extra__value_col)){
            intent=new Intent(Language1.this  ,MainColor.class);
            intent.putExtra(Quiz_Main.intent_extra_key,Quiz_Main.intent_extra__value_col_ar);
            intent.putExtra(intent_extra__counter_key,counter);
            startActivity(intent);
        }
    }

    public void english_quiz_onClick(View view) {
        if(option.equals(intent_extra__value_mth)){
            intent=new Intent(Language1.this  ,app_type.class);
            intent.putExtra(Quiz_Main.intent_extra_key,intent_extra__value_mth_en);
            intent.putExtra(intent_extra__counter_key,counter);
            startActivity(intent);
        }
        else  if(option.equals(intent_extra__value_col)){
            intent=new Intent(Language1.this  ,MainColor.class);
            intent.putExtra(Quiz_Main.intent_extra_key,Quiz_Main.intent_extra__value_col_en);
            intent.putExtra(intent_extra__counter_key,counter);
            startActivity(intent);
        }
    }
}
