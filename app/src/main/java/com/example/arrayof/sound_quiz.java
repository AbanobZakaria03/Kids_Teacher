package com.example.arrayof;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class sound_quiz extends AppCompatActivity {
    ImageView image;
    ImageView next;
    ImageView res;
    EditText txt1;
    LinearLayout linearLayout;
    String option;
    MediaPlayer player;
    int index;
    int counter;
    int[] numaudio_ar = {
            R.raw.na1, R.raw.na2, R.raw.na3, R.raw.na4, R.raw.na5,
            R.raw.na6, R.raw.na7, R.raw.na8, R.raw.na9, R.raw.na10};
    //٠ ١ ٢ ٣ ٤ ٥ ٦ ٧ ٨ ٩
    String[] num_ar = {"١", "٢", "٣", "٤", "٥", "٦", "٧", "٨", "٩"};
    String[] num_en = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
    int[] img_number_en = {
            R.drawable.en1q, R.drawable.en2q, R.drawable.en3q, R.drawable.en4q, R.drawable.en5q,
            R.drawable.en6q, R.drawable.en7q, R.drawable.en8q, R.drawable.en9q, R.drawable.en10q};

    int[] numaudio_en = {
            R.raw.ne1, R.raw.ne2, R.raw.ne3, R.raw.ne4, R.raw.ne5,
            R.raw.ne6, R.raw.ne7, R.raw.ne8, R.raw.ne9, R.raw.ne10};

    String[] alpha_ar = {"أ", "ب", "ت", "ث", "ج", "ح", "خ", "د", "ذ", "ر", "ز", "س", "ش", "ص", "ض", "ط", "ظ", "ع", "غ", "ف", "ق", "ك", "ل", "م", "ن", "ه", "و", "ى"};
    int[] Alphabetical_ar = {
            R.raw.ar1, R.raw.ar2, R.raw.ar3,
            R.raw.ar4, R.raw.ar5, R.raw.ar6,
            R.raw.ar7, R.raw.ar8, R.raw.ar9,
            R.raw.ar10, R.raw.ar11, R.raw.ar12,
            R.raw.ar13, R.raw.ar14, R.raw.ar15,
            R.raw.ar16, R.raw.ar17, R.raw.ar18,
            R.raw.ar19, R.raw.ar20, R.raw.ar21,
            R.raw.ar22, R.raw.ar23, R.raw.ar24,
            R.raw.ar25, R.raw.ar26, R.raw.ar27, R.raw.ar28};

    String[] alpha_en = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    int[] Alphabetical_en = {
            R.raw.en1, R.raw.en2, R.raw.en3,
            R.raw.en4, R.raw.en5, R.raw.en6,
            R.raw.en7, R.raw.en8, R.raw.en9,
            R.raw.en10, R.raw.en11, R.raw.en12,
            R.raw.en13, R.raw.en14, R.raw.en15,
            R.raw.en16, R.raw.en17, R.raw.en18,
            R.raw.en19, R.raw.en20, R.raw.en21,
            R.raw.en22, R.raw.en23, R.raw.en24,
            R.raw.en25, R.raw.en26};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sound_quiz);
        Random random = new Random();
        setTitle("Quiz");
        image = findViewById(R.id.sound_quiz_imag);
        res = findViewById(R.id.sound_quiz_res);
        next = findViewById(R.id.sound_quiz_next);
        txt1 = findViewById(R.id.sound_quiz_txt);
        Bundle b = getIntent().getExtras();
        option = b.getString(Quiz_Main.intent_extra_key);
        counter = b.getInt(Quiz_Main.intent_extra__counter_key);

        //********************English******************************************
        if (option.equals(Quiz_Main.intent_extra__value_en)) {
            index = random.nextInt(26);
            player = MediaPlayer.create(this, Alphabetical_en[index]);
            player.start();
        }
        //************************Arabic*****************************************
        else if (option.equals(Quiz_Main.intent_extra_value_ar)) {
            index = random.nextInt(28);
            player = MediaPlayer.create(this, Alphabetical_ar[index]);
            player.start();

        }
        //**************************Math*****************************************
        else if (option.equals(Quiz_Main.intent_extra__value_mth_ar)) {
            index = random.nextInt(9);
            player = MediaPlayer.create(this, numaudio_ar[index]);
            player.start();
        } else if (option.equals(Quiz_Main.intent_extra__value_mth_en)) {
            index = random.nextInt(9);
            player = MediaPlayer.create(this, numaudio_en[index]);
            player.start();
        }
    }

    public void sound_play(View view) {
        player.release();
        //*****************************English**************************************
        if (option.equals(Quiz_Main.intent_extra__value_en)) {
            player = MediaPlayer.create(this, Alphabetical_en[index]);
            player.start();
        }
        //******************************Arabic*************************************
        else if (option.equals(Quiz_Main.intent_extra_value_ar)) {
            player = MediaPlayer.create(this, Alphabetical_ar[index]);
            player.start();

        }
        //****************************Math_en******************************************
        else if (option.equals(Quiz_Main.intent_extra__value_mth_en)) {
            player = MediaPlayer.create(this, numaudio_en[index]);
            player.start();
        }
        //****************************Math*_ar*****************************************
        else if (option.equals(Quiz_Main.intent_extra__value_mth_ar)) {
            player = MediaPlayer.create(this, numaudio_ar[index]);
            player.start();
        }

    }

    public void nextPress(View view) {
        String input = txt1.getText().toString();

        //**************************English**********************************
        if (option.equals(Quiz_Main.intent_extra__value_en)) {
            input = input.toUpperCase();
            if (input.equals(alpha_en[index])) {
                linearLayout = findViewById(R.id.linearview);
                linearLayout.setVisibility(View.INVISIBLE);
                res.setVisibility(View.VISIBLE);
                res.setImageResource(R.drawable.corct);
                player = MediaPlayer.create(this, R.raw.corct);
                player.start();
                Quiz_Main.grade += 10;
            } else {
                res.setImageResource(R.drawable.wrong);
                linearLayout = findViewById(R.id.linearview);
                linearLayout.setVisibility(View.INVISIBLE);
                res.setVisibility(View.VISIBLE);
                player = MediaPlayer.create(this, R.raw.wrong);
                player.start();
                Toast.makeText(sound_quiz.this, "the correct answer is:" + alpha_en[index] + "", Toast.LENGTH_SHORT).show();
            }
            //********************************Arabic****************************************
        } else if (option.equals(Quiz_Main.intent_extra_value_ar)) {
            if (input.equals(alpha_ar[index])) {
                res.setImageResource(R.drawable.corct);
                Quiz_Main.grade += 10;
                linearLayout = findViewById(R.id.linearview);
                linearLayout.setVisibility(View.INVISIBLE);
                res.setVisibility(View.VISIBLE);
                player = MediaPlayer.create(this, R.raw.corct);
                player.start();
            } else {
                res.setImageResource(R.drawable.wrong);
                linearLayout = findViewById(R.id.linearview);
                linearLayout.setVisibility(View.INVISIBLE);
                res.setVisibility(View.VISIBLE);
                player = MediaPlayer.create(this, R.raw.wrong);
                player.start();
                Toast.makeText(sound_quiz.this, "the correct answer is:" + alpha_ar[index] + "", Toast.LENGTH_SHORT).show();
            }
        }
        //***************************************Math_en***************************
        else if (option.equals(Quiz_Main.intent_extra__value_mth_en)) {
            if (input.equals(num_en[index])) {
                res.setImageResource(R.drawable.corct);
                linearLayout = findViewById(R.id.linearview);
                linearLayout.setVisibility(View.INVISIBLE);
                res.setVisibility(View.VISIBLE);
                player = MediaPlayer.create(this, R.raw.corct);
                player.start();
                Quiz_Main.grade += 10;
            } else {
                res.setImageResource(R.drawable.wrong);
                linearLayout = findViewById(R.id.linearview);
                linearLayout.setVisibility(View.INVISIBLE);
                res.setVisibility(View.VISIBLE);
                player = MediaPlayer.create(this, R.raw.wrong);
                player.start();
                Toast.makeText(sound_quiz.this, "the correct answer is : " + num_en[index] + "", Toast.LENGTH_SHORT).show();
            }
        }
        //********************************math_ar**********************
        else if (option.equals(Quiz_Main.intent_extra__value_mth_ar)) {
            if (input.equals(num_ar[index])) {
                res.setImageResource(R.drawable.corct);
                linearLayout = findViewById(R.id.linearview);
                linearLayout.setVisibility(View.INVISIBLE);
                res.setVisibility(View.VISIBLE);
                player = MediaPlayer.create(this, R.raw.corct);
                player.start();
                Quiz_Main.grade += 10;
            } else {
                res.setImageResource(R.drawable.wrong);
                linearLayout = findViewById(R.id.linearview);
                linearLayout.setVisibility(View.INVISIBLE);
                res.setVisibility(View.VISIBLE);
                player = MediaPlayer.create(this, R.raw.wrong);
                player.start();
                Toast.makeText(sound_quiz.this, "the correct answer is : " + num_ar[index] + "", Toast.LENGTH_SHORT).show();
            }
        }

    }

    public void intnt_onclick(View view) {
        player.stop();
        player.release();
        Intent intent;
        if (counter < 9) {
            counter++;
            if (option.equals(Quiz_Main.intent_extra__value_mth_ar) || option.equals(Quiz_Main.intent_extra__value_mth_en))
                intent = new Intent(sound_quiz.this, Choose_quiz.class);
            else
                intent = new Intent(sound_quiz.this, complet_quiz.class);
            intent.putExtra(Quiz_Main.intent_extra_key, option);
            intent.putExtra(Quiz_Main.intent_extra__counter_key, counter);
            startActivity(intent);
            finish();
        }else
        {
            linearLayout = findViewById(R.id.linearview);
            linearLayout.setVisibility(View.INVISIBLE);
            res.setVisibility(View.INVISIBLE);
            linearLayout = findViewById(R.id.gradeView);

            TextView textView = findViewById(R.id.grade);
            textView.setText(""+Quiz_Main.grade);
            textView = findViewById(R.id.gradetxt);
            if(Quiz_Main.grade>=90) {
                textView.setText("Excelent!");
                textView.setTextColor(ContextCompat.getColor(this,R.color.green));
            }
            else if(Quiz_Main.grade>=70) {
                textView.setText("Very Good!");
                textView.setTextColor(ContextCompat.getColor(this,R.color.colorAccent));
            }
            else if(Quiz_Main.grade>=50) {
                textView.setText("Good!");
                textView.setTextColor(ContextCompat.getColor(this,R.color.yellow));
            }
            else if(Quiz_Main.grade>=30) {
                textView.setText("Bad!");
                textView.setTextColor(ContextCompat.getColor(this,R.color.orange));
            }
            else {
                textView.setText("Very Bad!");
                textView.setTextColor(ContextCompat.getColor(this,R.color.red));

            }
            linearLayout.setVisibility(View.VISIBLE);
            Quiz_Main.grade=0;
        }
    }

}
