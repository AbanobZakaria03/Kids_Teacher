package com.example.arrayof;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.daimajia.androidanimations.library.YoYo;
import com.daimajia.androidanimations.library.Techniques;

import java.util.Random;

public class Choose_quiz extends AppCompatActivity {

    private Button btn1;
    private Button btn2;
    private Button btn3;
    private String option;
    LinearLayout linearLayout;
    int answer = 0;
    private ImageView image;
    private ImageView res;
    private ImageView next;
    int index;
    int arr_number;
    int choose1_index;
    int choose2_index;
    int counter;
    Random random = new Random();
    MediaPlayer player;
    //  int [] img_number_ar ={
    //      R.drawable.ar1,R.drawable.ar2,R.drawable.ar3,R.drawable.ar4,R.drawable.ar5,
    //    R.drawable.ar6,R.drawable.ar7,R.drawable.ar8,R.drawable.ar9,R.drawable.ar10};

    int[] numaudio_ar = {
            R.raw.na1,R.raw.na2,R.raw.na3,R.raw.na4,R.raw.na5,
            R.raw.na6,R.raw.na7,R.raw.na8,R.raw.na9,R.raw.na10};
    //٠ ١ ٢ ٣ ٤ ٥ ٦ ٧ ٨ ٩
    String [] num_ar={"١","٢","٣","٤","٥","٦","٧","٨","٩","١٠"};
    int [] num_en={1,2,3,4,5,6,7,8,9,10};
    int [] img_number_en ={
            R.drawable.en1q,R.drawable.en2q,R.drawable.en3q,R.drawable.en4q,R.drawable.en5q,
            R.drawable.en6q,R.drawable.en7q,R.drawable.en8q,R.drawable.en9q,R.drawable.en10q};

    int[] numaudio_en = {
            R.raw.ne1,R.raw.ne2,R.raw.ne3,R.raw.ne4,R.raw.ne5,
            R.raw.ne6,R.raw.ne7,R.raw.ne8,R.raw.ne9,R.raw.ne10};


    int[] image_id1_ar = {
            R.drawable.a1_image1, R.drawable.a2_image1, R.drawable.a3_image1, R.drawable.a4_image1, R.drawable.a5_image1,
            R.drawable.a6_image1, R.drawable.a7_image1, R.drawable.a8_image1, R.drawable.a9_image1, R.drawable.a10_image1,
            R.drawable.a11_image1, R.drawable.a12_image1, R.drawable.a13_image1, R.drawable.a14_image1, R.drawable.a15_image1,
            R.drawable.a16_image1, R.drawable.a17_image1, R.drawable.a18_image1, R.drawable.a19_image1, R.drawable.a20_image1,
            R.drawable.a21_image1, R.drawable.a22_image1, R.drawable.a23_image1, R.drawable.a24_image1, R.drawable.a25_image1,
            R.drawable.a26_image1, R.drawable.a27_image1, R.drawable.a28_image1};


    int[] image_id2_ar = {
            R.drawable.a1_image2, R.drawable.a2_image2, R.drawable.a3_image2, R.drawable.a4_image2, R.drawable.a5_image2,
            R.drawable.a6_image2, R.drawable.a7_image2, R.drawable.a8_image2, R.drawable.a9_image2, R.drawable.a10_image2,
            R.drawable.a11_image2, R.drawable.a12_image2, R.drawable.a13_image2, R.drawable.a14_image2, R.drawable.a15_image2,
            R.drawable.a16_image2, R.drawable.a17_image2, R.drawable.a18_image2, R.drawable.a19_image2, R.drawable.a20_image2,
            R.drawable.a21_image2, R.drawable.a22_image2, R.drawable.a23_image2, R.drawable.a24_image2, R.drawable.a25_image2,
            R.drawable.a26_image2, R.drawable.a27_image2, R.drawable.a28_image2};

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

    int[] img1audio_ar = {
            R.raw.a1audio1, R.raw.a2audio1, R.raw.a3audio1, R.raw.a4audio1, R.raw.a5audio1,
            R.raw.a6audio1, R.raw.a7audio1, R.raw.a8audio1, R.raw.a9audio1, R.raw.a10audio1,
            R.raw.a11audio1, R.raw.a12audio1, R.raw.a13audio1, R.raw.a14audio1, R.raw.a15audio1,
            R.raw.a16audio1, R.raw.a17audio1, R.raw.a18audio1, R.raw.a19audio1, R.raw.a20audio1,
            R.raw.a21audio1, R.raw.a22audio1, R.raw.a23audio1, R.raw.a24audio1, R.raw.a25audio1,
            R.raw.a26audio1, R.raw.a27audio1, R.raw.a28audio1};

    int[] img2audio_ar = {
            R.raw.a1audio2, R.raw.a2audio2, R.raw.a3audio2, R.raw.a4audio2, R.raw.a5audio2,
            R.raw.a6audio2, R.raw.a7audio2, R.raw.a8audio2, R.raw.a9audio2, R.raw.a10audio2,
            R.raw.a11audio2, R.raw.a12audio2, R.raw.a13audio2, R.raw.a14audio2, R.raw.a15audio2,
            R.raw.a16audio2, R.raw.a17audio2, R.raw.a18audio2, R.raw.a19audio2, R.raw.a20audio2,
            R.raw.a21audio2, R.raw.a22audio2, R.raw.a23audio2, R.raw.a24audio2, R.raw.a25audio2,
            R.raw.a26audio2, R.raw.a27audio2, R.raw.a28audio2};
    int[] image_id1_en = {
            R.drawable.e1_image1, R.drawable.e2_image1, R.drawable.e3_image1, R.drawable.e4_image1, R.drawable.e5_image1,
            R.drawable.e6_image1, R.drawable.e7_image1, R.drawable.e8_image1, R.drawable.e9_image1, R.drawable.e10_image1,
            R.drawable.e11_image1, R.drawable.e12_image1, R.drawable.e13_image1, R.drawable.e14_image1, R.drawable.e15_image1,
            R.drawable.e16_image1, R.drawable.e17_image1, R.drawable.e18_image1, R.drawable.e19_image1, R.drawable.e20_image1,
            R.drawable.e21_image1, R.drawable.e22_image1, R.drawable.e23_image1, R.drawable.e24_image1, R.drawable.e25_image1,
            R.drawable.e26_image1};


    int[] image_id2_en = {
            R.drawable.e1_image2, R.drawable.e2_image2, R.drawable.e3_image2, R.drawable.e4_image2, R.drawable.e5_image2,
            R.drawable.e6_image2, R.drawable.e7_image2, R.drawable.e8_image2, R.drawable.e9_image2, R.drawable.e10_image2,
            R.drawable.e11_image2, R.drawable.e12_image2, R.drawable.e13_image2, R.drawable.e14_image2, R.drawable.e15_image2,
            R.drawable.e16_image2, R.drawable.e17_image2, R.drawable.e18_image2, R.drawable.e19_image2, R.drawable.e20_image2,
            R.drawable.e21_image2, R.drawable.e22_image2, R.drawable.e23_image2, R.drawable.e24_image2, R.drawable.e25_image2,
            R.drawable.e26_image2};

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

    int[] img1audio_en = {
            R.raw.e1audio1, R.raw.e2audio1, R.raw.e3audio1, R.raw.e4audio1, R.raw.e5audio1,
            R.raw.e6audio1, R.raw.e7audio1, R.raw.e8audio1, R.raw.e9audio1, R.raw.e10audio1,
            R.raw.e11audio1, R.raw.e12audio1, R.raw.e13audio1, R.raw.e14audio1, R.raw.e15audio1,
            R.raw.e16audio1, R.raw.e17audio1, R.raw.e18audio1, R.raw.e19audio1, R.raw.e20audio1,
            R.raw.e21audio1, R.raw.e22audio1, R.raw.e23audio1, R.raw.e24audio1, R.raw.e25audio1,
            R.raw.e26audio1};

    int[] img2audio_en = {
            R.raw.e1audio2, R.raw.e2audio2, R.raw.e3audio2, R.raw.e4audio2, R.raw.e5audio2,
            R.raw.e6audio2, R.raw.e7audio2, R.raw.e8audio2, R.raw.e9audio2, R.raw.e10audio2,
            R.raw.e11audio2, R.raw.e12audio2, R.raw.e13audio2, R.raw.e14audio2, R.raw.e15audio2,
            R.raw.e16audio2, R.raw.e17audio2, R.raw.e18audio2, R.raw.e19audio2, R.raw.e20audio2,
            R.raw.e21audio2, R.raw.e22audio2, R.raw.e23audio2, R.raw.e24audio2, R.raw.e25audio2,
            R.raw.e26audio2};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_quiz);
        setTitle("Quiz");
        image = findViewById(R.id.choose_quiz_imag);
        next = findViewById(R.id.choose_quiz_next);
        res = findViewById(R.id.choose_quiz_res);
        btn1 = findViewById(R.id.choose_quiz_btn1);
        btn2 = findViewById(R.id.choose_quiz_btn2);
        btn3 = findViewById(R.id.choose_quiz_btn3);
        Bundle b = getIntent().getExtras();
        option = b.getString(Quiz_Main.intent_extra_key);
        counter = b.getInt(Quiz_Main.intent_extra__counter_key);
        //************************************English******************************************************
        if (option.equals(Quiz_Main.intent_extra__value_en)) {

            if (arr_number == 0) { index = random.nextInt(26);
                arr_number = random.nextInt(2);
                while (true) {
                    choose1_index = random.nextInt(26);
                    if (choose1_index != index)
                        break;
                }
                while (true) {
                    choose2_index = random.nextInt(26);
                    if (choose2_index != index && choose2_index != choose1_index)
                        break;
                }
                int correct_choose = random.nextInt(3);
                if (correct_choose == 0) {
                    btn1.setText(alpha_en[index]);
                    btn2.setText(alpha_en[choose1_index]);
                    btn3.setText(alpha_en[choose2_index]);
                } else if (correct_choose == 1) {
                    btn2.setText(alpha_en[index]);
                    btn1.setText(alpha_en[choose1_index]);
                    btn3.setText(alpha_en[choose2_index]);
                } else if (correct_choose == 2) {
                    btn3.setText(alpha_en[index]);
                    btn2.setText(alpha_en[choose1_index]);
                    btn1.setText(alpha_en[choose2_index]);
                }
                image.setImageResource(image_id1_en[index]);
                player = MediaPlayer.create(this, img1audio_en[index]);
            } else {
                image.setImageResource(image_id2_en[index]);
                player = MediaPlayer.create(this, img2audio_en[index]);
            }
            player.start();
        }
        //***************************************arabic*************************
        else if (option.equals(Quiz_Main.intent_extra_value_ar)) {
            index = random.nextInt(28);
            arr_number = random.nextInt(2);
            while (true) {
                choose1_index = random.nextInt(28);
                if (choose1_index != index)
                    break;
            }
            while (true) {
                choose2_index = random.nextInt(28);
                if (choose2_index != index && choose2_index != choose1_index)
                    break;
            }
            int correct_choose = random.nextInt(3);
            if (correct_choose == 0) {
                btn1.setText(alpha_ar[index]);
                btn2.setText(alpha_ar[choose1_index]);
                btn3.setText(alpha_ar[choose2_index]);
            } else if (correct_choose == 1) {
                btn2.setText(alpha_ar[index]);
                btn1.setText(alpha_ar[choose1_index]);
                btn3.setText(alpha_ar[choose2_index]);
            } else if (correct_choose == 2) {
                btn3.setText(alpha_ar[index]);
                btn2.setText(alpha_ar[choose1_index]);
                btn1.setText(alpha_ar[choose2_index]);
            }
            if (arr_number == 0) {
                image.setImageResource(image_id1_ar[index]);
                player = MediaPlayer.create(this, img1audio_ar[index]);
            } else {
                image.setImageResource(image_id2_ar[index]);
                player = MediaPlayer.create(this, img2audio_ar[index]);
            }
            player.start();
        }
        //************************************************math_en****************************
        else  if (option.equals(Quiz_Main.intent_extra__value_mth_en)) {
            index = random.nextInt(10);

            while (true) {
                choose1_index = random.nextInt(10);
                if (choose1_index != index)
                    break;
            }
            while (true) {
                choose2_index = random.nextInt(10);
                if (choose2_index != index && choose2_index != choose1_index)
                    break;
            }
            int correct_choose = random.nextInt(3);
            if (correct_choose == 0) {
                btn1.setText(num_en[index]+"");
                btn2.setText(num_en[choose1_index]+"");
                btn3.setText(num_en[choose2_index]+"");

            } else if (correct_choose == 1) {
                btn2.setText(num_en[index]+"");
                btn1.setText(num_en[choose1_index]+"");
                btn3.setText(num_en[choose2_index]+"");
            } else if (correct_choose == 2) {
                btn3.setText(num_en[index]+"");
                btn2.setText(num_en[choose1_index]+"");
                btn1.setText(num_en[choose2_index]+"");
            }

            image.setImageResource(img_number_en[index]);
            player = MediaPlayer.create(this, numaudio_en[index]);
            player.start();
        }
        //************************************************math_en****************************
        else  if (option.equals(Quiz_Main.intent_extra__value_mth_ar)) {
            index = random.nextInt(10);

            while (true) {
                choose1_index = random.nextInt(10);
                if (choose1_index != index)
                    break;
            }
            while (true) {
                choose2_index = random.nextInt(10);
                if (choose2_index != index && choose2_index != choose1_index)
                    break;
            }
            int correct_choose = random.nextInt(3);
            if (correct_choose == 0) {
                btn1.setText(num_ar[index]+"");
                btn2.setText(num_ar[choose1_index]+"");
                btn3.setText(num_ar[choose2_index]+"");

            } else if (correct_choose == 1) {
                btn2.setText(num_ar[index]+"");
                btn1.setText(num_ar[choose1_index]+"");
                btn3.setText(num_ar[choose2_index]+"");
            } else if (correct_choose == 2) {
                btn3.setText(num_ar[index]+"");
                btn2.setText(num_ar[choose1_index]+"");
                btn1.setText(num_ar[choose2_index]+"");
            }

            image.setImageResource(img_number_en[index]);
            player = MediaPlayer.create(this, numaudio_ar[index]);
            player.start();
        }
    }




    public void choose_quiz_onClick1(View view) {
        answer = 1;
        YoYo.with(Techniques.Pulse).duration(200).playOn(btn1);
        final int sdk = android.os.Build.VERSION.SDK_INT;
        if (sdk < android.os.Build.VERSION_CODES.JELLY_BEAN) {
            btn1.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.choose_quiz_item2));
            btn2.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.choose_quiz_item1));
            btn3.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.choose_quiz_item1));
        } else {
            btn1.setBackground(ContextCompat.getDrawable(this, R.drawable.choose_quiz_item2));
            btn2.setBackground(ContextCompat.getDrawable(this, R.drawable.choose_quiz_item1));
            btn3.setBackground(ContextCompat.getDrawable(this, R.drawable.choose_quiz_item1));
        }
    }

    public void choose_quiz_onClick2(View view) {
        YoYo.with(Techniques.Shake).duration(200).playOn(btn2);
        answer = 2;
        final int sdk = android.os.Build.VERSION.SDK_INT;
        if (sdk < android.os.Build.VERSION_CODES.JELLY_BEAN) {
            btn2.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.choose_quiz_item2));
            btn1.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.choose_quiz_item1));
            btn3.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.choose_quiz_item1));
        } else {
            btn2.setBackground(ContextCompat.getDrawable(this, R.drawable.choose_quiz_item2));
            btn1.setBackground(ContextCompat.getDrawable(this, R.drawable.choose_quiz_item1));
            btn3.setBackground(ContextCompat.getDrawable(this, R.drawable.choose_quiz_item1));
        }
    }

    public void choose_quiz_onClick3(View view) {
        answer = 3;
        YoYo.with(Techniques.DropOut).duration(200).playOn(btn3);
        final int sdk = android.os.Build.VERSION.SDK_INT;
        if (sdk < android.os.Build.VERSION_CODES.JELLY_BEAN) {
            btn3.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.choose_quiz_item2));
            btn2.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.choose_quiz_item1));
            btn1.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.choose_quiz_item1));
        } else {
            btn3.setBackground(ContextCompat.getDrawable(this, R.drawable.choose_quiz_item2));
            btn2.setBackground(ContextCompat.getDrawable(this, R.drawable.choose_quiz_item1));
            btn1.setBackground(ContextCompat.getDrawable(this, R.drawable.choose_quiz_item1));
        }
    }

    public void nextPress(View view) {
        //****************************English***********************************************
        if (option.equals(Quiz_Main.intent_extra__value_en)) {
            if (answer == 1) {
                if (btn1.getText().toString().equals(alpha_en[index]))
                {
                    linearLayout = findViewById(R.id.linearview);
                    linearLayout.setVisibility(View.INVISIBLE);
                    res.setVisibility(View.VISIBLE);
                    res.setImageResource(R.drawable.corct);
                    player = MediaPlayer.create(Choose_quiz.this,R.raw.corct);
                    player.start();
                    Quiz_Main.grade+=10;
                }
                else
                {
                    res.setImageResource(R.drawable.wrong);
                    linearLayout = findViewById(R.id.linearview);
                    linearLayout.setVisibility(View.INVISIBLE);
                    res.setVisibility(View.VISIBLE);
                    player = MediaPlayer.create(this, R.raw.wrong);
                    player.start();
                    Toast.makeText(Choose_quiz.this, "the correct answer is : " + alpha_en[index] + "", Toast.LENGTH_SHORT).show();

                }
            } else if (answer == 2) {
                if (btn2.getText().toString().equals(alpha_en[index]))
                {
                    linearLayout = findViewById(R.id.linearview);
                    linearLayout.setVisibility(View.INVISIBLE);
                    res.setVisibility(View.VISIBLE);
                    res.setImageResource(R.drawable.corct);
                    player = MediaPlayer.create(Choose_quiz.this,R.raw.corct);
                    player.start();
                    Quiz_Main.grade+=10;
                }
                else
                {
                    res.setImageResource(R.drawable.wrong);
                    linearLayout = findViewById(R.id.linearview);
                    linearLayout.setVisibility(View.INVISIBLE);
                    res.setVisibility(View.VISIBLE);
                    player = MediaPlayer.create(this, R.raw.wrong);
                    player.start();
                    Toast.makeText(Choose_quiz.this, "the correct answer is:" + alpha_en[index] + "", Toast.LENGTH_SHORT).show();

                }
            } else if (answer == 3) {
                if (btn3.getText().toString().equals(alpha_en[index]))
                {
                    linearLayout = findViewById(R.id.linearview);
                    linearLayout.setVisibility(View.INVISIBLE);
                    res.setVisibility(View.VISIBLE);
                    res.setImageResource(R.drawable.corct);
                    player = MediaPlayer.create(Choose_quiz.this,R.raw.corct);
                    player.start();
                    Quiz_Main.grade+=10;
                }
                else
                {
                    res.setImageResource(R.drawable.wrong);
                    linearLayout = findViewById(R.id.linearview);
                    linearLayout.setVisibility(View.INVISIBLE);
                    res.setVisibility(View.VISIBLE);
                    player = MediaPlayer.create(this, R.raw.wrong);
                    player.start();
                    Toast.makeText(Choose_quiz.this, "the correct answer is:" + alpha_en[index] + "", Toast.LENGTH_SHORT).show();

                }
            }
            //**************************Arabic***************************
        } else if (option.equals(Quiz_Main.intent_extra_value_ar)) {
            if (answer == 1) {
                if (btn1.getText().toString().equals(alpha_ar[index])) {
                    linearLayout = findViewById(R.id.linearview);
                    linearLayout.setVisibility(View.INVISIBLE);
                    res.setVisibility(View.VISIBLE);
                    res.setImageResource(R.drawable.corct);
                    player = MediaPlayer.create(Choose_quiz.this,R.raw.corct);
                    player.start();
                    Quiz_Main.grade+=10;
                }
                else {
                    res.setImageResource(R.drawable.wrong);
                    linearLayout = findViewById(R.id.linearview);
                    linearLayout.setVisibility(View.INVISIBLE);
                    res.setVisibility(View.VISIBLE);
                    player = MediaPlayer.create(this, R.raw.wrong);
                    player.start();
                    Toast.makeText(Choose_quiz.this, "the correct answer is:" + alpha_ar[index] + "", Toast.LENGTH_SHORT).show();


                }
            } else if (answer == 2) {
                if (btn2.getText().toString().equals(alpha_ar[index]))
                {
                    linearLayout = findViewById(R.id.linearview);
                    linearLayout.setVisibility(View.INVISIBLE);
                    res.setVisibility(View.VISIBLE);
                    res.setImageResource(R.drawable.corct);
                    player = MediaPlayer.create(Choose_quiz.this,R.raw.corct);
                    player.start();
                    Quiz_Main.grade+=10;
                }
                else
                {
                    res.setImageResource(R.drawable.wrong);
                    linearLayout = findViewById(R.id.linearview);
                    linearLayout.setVisibility(View.INVISIBLE);
                    res.setVisibility(View.VISIBLE);
                    player = MediaPlayer.create(this, R.raw.wrong);
                    player.start();
                    Toast.makeText(Choose_quiz.this, "the correct answer is:" + alpha_ar[index] + "", Toast.LENGTH_SHORT).show();


                }
            } else if (answer == 3) {
                if (btn3.getText().toString().equals(alpha_ar[index])) {
                    linearLayout = findViewById(R.id.linearview);
                    linearLayout.setVisibility(View.INVISIBLE);
                    res.setVisibility(View.VISIBLE);
                    res.setImageResource(R.drawable.corct);
                    player = MediaPlayer.create(Choose_quiz.this,R.raw.corct);
                    player.start();
                    Quiz_Main.grade+=10;
                }
                else
                {
                    res.setImageResource(R.drawable.wrong);
                    linearLayout = findViewById(R.id.linearview);
                    linearLayout.setVisibility(View.INVISIBLE);
                    res.setVisibility(View.VISIBLE);
                    player = MediaPlayer.create(this, R.raw.wrong);
                    player.start();
                    Toast.makeText(Choose_quiz.this, "the correct answer is:" + alpha_ar[index] + "", Toast.LENGTH_SHORT).show();

                }

            }
        }
        //////////////////*****************************Math_en*************************************************
        else if (option.equals(Quiz_Main.intent_extra__value_mth_en)) {
            if (answer == 1) {

                if (Integer.parseInt(btn1.getText().toString()) == num_en[index]) {
                    linearLayout = findViewById(R.id.linearview);
                    linearLayout.setVisibility(View.INVISIBLE);
                    res.setVisibility(View.VISIBLE);
                    res.setImageResource(R.drawable.corct);
                    player = MediaPlayer.create(Choose_quiz.this, R.raw.corct);
                    player.start();
                    Quiz_Main.grade += 10;
                } else {
                    res.setImageResource(R.drawable.wrong);
                    linearLayout = findViewById(R.id.linearview);
                    linearLayout.setVisibility(View.INVISIBLE);
                    res.setVisibility(View.VISIBLE);
                    player = MediaPlayer.create(this, R.raw.wrong);
                    player.start();
                    Toast.makeText(Choose_quiz.this, "the correct answer is:" + num_en[index] + "", Toast.LENGTH_SHORT).show();


                }
            } else if (answer == 2) {
                if (Integer.parseInt(btn2.getText().toString()) == num_en[index]) {
                    linearLayout = findViewById(R.id.linearview);
                    linearLayout.setVisibility(View.INVISIBLE);
                    res.setVisibility(View.VISIBLE);
                    res.setImageResource(R.drawable.corct);
                    player = MediaPlayer.create(Choose_quiz.this, R.raw.corct);
                    player.start();
                    Quiz_Main.grade += 10;
                } else {
                    res.setImageResource(R.drawable.wrong);
                    linearLayout = findViewById(R.id.linearview);
                    linearLayout.setVisibility(View.INVISIBLE);
                    res.setVisibility(View.VISIBLE);
                    player = MediaPlayer.create(this, R.raw.wrong);
                    player.start();
                    Toast.makeText(Choose_quiz.this, "the correct answer is:" + num_en[index] + "", Toast.LENGTH_SHORT).show();


                }
            } else if (answer == 3) {
                if (Integer.parseInt(btn3.getText().toString()) == num_en[index]) {
                    linearLayout = findViewById(R.id.linearview);
                    linearLayout.setVisibility(View.INVISIBLE);
                    res.setVisibility(View.VISIBLE);
                    res.setImageResource(R.drawable.corct);
                    player = MediaPlayer.create(Choose_quiz.this, R.raw.corct);
                    player.start();
                    Quiz_Main.grade += 10;
                } else {
                    res.setImageResource(R.drawable.wrong);
                    linearLayout = findViewById(R.id.linearview);
                    linearLayout.setVisibility(View.INVISIBLE);
                    res.setVisibility(View.VISIBLE);
                    player = MediaPlayer.create(this, R.raw.wrong);
                    player.start();
                    Toast.makeText(Choose_quiz.this, "the correct answer is:" + num_en[index] + "", Toast.LENGTH_SHORT).show();

                }

            }
        }
        //////////////////*****************************Math_ar*************************************************
        else if (option.equals(Quiz_Main.intent_extra__value_mth_ar)) {
            if (answer == 1) {
                if (btn1.getText().toString().equals(num_ar[index])) {
                    linearLayout = findViewById(R.id.linearview);
                    linearLayout.setVisibility(View.INVISIBLE);
                    res.setVisibility(View.VISIBLE);
                    res.setImageResource(R.drawable.corct);
                    player = MediaPlayer.create(Choose_quiz.this,R.raw.corct);
                    player.start();
                    Quiz_Main.grade+=10;
                }
                else {
                    res.setImageResource(R.drawable.wrong);
                    linearLayout = findViewById(R.id.linearview);
                    linearLayout.setVisibility(View.INVISIBLE);
                    res.setVisibility(View.VISIBLE);
                    player = MediaPlayer.create(this, R.raw.wrong);
                    player.start();
                    Toast.makeText(Choose_quiz.this, "the correct answer is:" + num_ar[index] + "", Toast.LENGTH_SHORT).show();


                }
            } else if (answer == 2) {
                if (btn2.getText().toString().equals(num_ar[index].toString())) {
                    linearLayout = findViewById(R.id.linearview);
                    linearLayout.setVisibility(View.INVISIBLE);
                    res.setVisibility(View.VISIBLE);
                    res.setImageResource(R.drawable.corct);
                    player = MediaPlayer.create(Choose_quiz.this,R.raw.corct);
                    player.start();
                    Quiz_Main.grade+=10;
                }
                else {
                    res.setImageResource(R.drawable.wrong);
                    linearLayout = findViewById(R.id.linearview);
                    linearLayout.setVisibility(View.INVISIBLE);
                    res.setVisibility(View.VISIBLE);
                    player = MediaPlayer.create(this, R.raw.wrong);
                    player.start();
                    Toast.makeText(Choose_quiz.this, "the correct answer is:" + num_ar[index]+ "", Toast.LENGTH_SHORT).show();


                }
            } else if (answer == 3) {
                if (btn3.getText().toString().equals(num_ar[index].toString())) {
                    linearLayout = findViewById(R.id.linearview);
                    linearLayout.setVisibility(View.INVISIBLE);
                    res.setVisibility(View.VISIBLE);
                    res.setImageResource(R.drawable.corct);
                    player = MediaPlayer.create(Choose_quiz.this,R.raw.corct);
                    player.start();
                    Quiz_Main.grade+=10;
                }
                else
                {
                    res.setImageResource(R.drawable.wrong);
                    linearLayout = findViewById(R.id.linearview);
                    linearLayout.setVisibility(View.INVISIBLE);
                    res.setVisibility(View.VISIBLE);
                    player = MediaPlayer.create(this, R.raw.wrong);
                    player.start();
                    Toast.makeText(Choose_quiz.this, "the correct answer is:" + num_ar[index] + "", Toast.LENGTH_SHORT).show();

                }

            }
        }


    }

    public void playImage(View view) {
        player.release();
        if (option.equals(Quiz_Main.intent_extra__value_en)) {
            if (arr_number == 0) {
                player = MediaPlayer.create(this, img1audio_en[index]);
            } else {
                player = MediaPlayer.create(this, img2audio_en[index]);
            }
        } else if (option.equals(Quiz_Main.intent_extra_value_ar)) {
            if (arr_number == 0) {
                player = MediaPlayer.create(this, img1audio_ar[index]);
            } else {
                player = MediaPlayer.create(this, img2audio_ar[index]);
            }
        }
        else if (option.equals(Quiz_Main.intent_extra__value_mth_en)) {

            player = MediaPlayer.create(this, numaudio_en[index]);

        }
        else if (option.equals(Quiz_Main.intent_extra__value_mth_ar)) {

            player = MediaPlayer.create(this, numaudio_ar[index]);

        }
        player.start();
    }

    public void intnt_onclick(View view) {
        player.stop();
        player.release();
        Intent intent;
        if (counter < 10) {
            counter++;
            if(option.equals(Quiz_Main.intent_extra__value_mth_ar)||option.equals(Quiz_Main.intent_extra__value_mth_en))
            {
                intent = new Intent(Choose_quiz.this, sound_quiz.class);
            }
            else {
                intent = new Intent(Choose_quiz.this, sound_image_quiz.class);
            }

            intent.putExtra(Quiz_Main.intent_extra_key, option);
            intent.putExtra(Quiz_Main.intent_extra__counter_key,counter);
            startActivity(intent);
            finish();
        }
        else
        {
            Toast.makeText(Choose_quiz.this, "your grade is:"+Quiz_Main.grade , Toast.LENGTH_SHORT).show();
        }
    }
}

