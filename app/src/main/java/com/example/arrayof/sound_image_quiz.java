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

public class sound_image_quiz extends AppCompatActivity {
    ImageView image;
    ImageView next;
    ImageView res;
    LinearLayout linearLayout;
    EditText txt1;
    String option;
    MediaPlayer player;
    int counter;
    int index;
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

    char[] alpha_ar = {'أ', 'ب', 'ت', 'ث', 'ج', 'ح', 'خ', 'د', 'ذ', 'ر', 'ز', 'س', 'ش', 'ص', 'ض', 'ط', 'ظ', 'ع', 'غ', 'ف', 'ق', 'ك', 'ل', 'م', 'ن', 'ه', 'و', 'ي'};

    String[] img1text_ar = {
            "أرنب", "بطة", "تاج", "ثعلب", "جمل", "حمار", "خروف", "ديك", "ذئب", "رجل", "زرافة", "سمكة", "شمس", "صقر", "ضفدع", "طائرة",
            "ظبي", "عصفور", "غزال", "فيل", "قطار", "كلب", "ليمون", "موزة", "نمر", "هدهد", "ورقة", "يد"};


    String[] img2text_ar = {
            "أسد", "باب", "تفاح", "ثعبان", "جاموسة", "حصان", "خبز", "دلفين", "ذبابة", "رمان", "زهرة", "ساعة", "شجرة", "صياد", "ضبع", "طاووس",
            "ظرف", "عين", "غراب", "فلاح", "قمر", "كتاب", "لحمة", "ملعب", "نملة", "هدية", "وردة", "يقطينة"};

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

    char[] alpha_en = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'و', 'ي'};

    String[] img1text_en = {
            "apple", "ballon", "cat", "duck", "egg", "fish", "goat", "hat", "insect", "jar", "king", "lion", "man", "nest", "orange", "pencil",
            "queen", "rabbit", "sun", "tiger", "umbrella", "violin", "window", "x-ray", "yoyo", "zebra"};


    String[] img2text_en = {
            "ant", "ball", "cup", "dog", "elephant", "frog", "giraffe", "horse", "ice cream", "jelly", "kite", "lamp", "monkey", "nut", "octopus", "pig",
            "quiz", "rocket", "spider", "turtle", "ugly", "vase", "watermelon", "xylophone", "yacht", "zoo"};

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
    Random random = new Random();
    int arr_number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sound_image_quiz);
        setTitle("Quiz");
        image = findViewById(R.id.sound_image_quiz_imag);
        next = findViewById(R.id.sound_image_quiz_next);
        res = findViewById(R.id.sound_quiz_imag_res);

        txt1 = findViewById(R.id.sound_image_quiz_txt);
        Bundle b = getIntent().getExtras();
        option = b.getString(Quiz_Main.intent_extra_key);
        counter = b.getInt(Quiz_Main.intent_extra__counter_key);
        if (option.equals("En")) {
            index = random.nextInt(26);
            arr_number = random.nextInt(2);
            if (arr_number == 0) {
                image.setImageResource(image_id1_en[index]);
                player = MediaPlayer.create(this, img1audio_en[index]);
            } else {
                image.setImageResource(image_id2_en[index]);
                player = MediaPlayer.create(this, img2audio_en[index]);
            }
            player.start();
        } else if (option.equals(Quiz_Main.intent_extra_value_ar)) {
            index = random.nextInt(28);
            arr_number = random.nextInt(2);
            if (arr_number == 0) {
                image.setImageResource(image_id1_ar[index]);
                player = MediaPlayer.create(this, img1audio_ar[index]);
            } else {
                image.setImageResource(image_id2_ar[index]);
                player = MediaPlayer.create(this, img2audio_ar[index]);
            }
            player.start();
        } else {

        }
    }

    public void sound_play(View view) {
        if (option.equals("En")) {
            if (arr_number == 0) {
                player.release();
                player = MediaPlayer.create(this, img1audio_en[index]);
            } else {
                player.release();
                player = MediaPlayer.create(this, img2audio_en[index]);
            }
            player.start();
        } else if (option.equals(Quiz_Main.intent_extra_value_ar)) {
            if (arr_number == 0) {
                player.release();
                player = MediaPlayer.create(this, img1audio_ar[index]);
            } else {
                player.release();
                player = MediaPlayer.create(this, img2audio_ar[index]);
            }
            player.start();

        } else {

        }
    }

    public void nextPress(View view) {
        //*******************************English*****************************
        if (option.equals(Quiz_Main.intent_extra__value_en)) {
            if (arr_number == 0) {
                String input = txt1.getText().toString();
                input = input.toLowerCase();
                if (input.equals(img1text_en[index])) {
                    //   Toast.makeText(this, "yes", Toast.LENGTH_SHORT).show();
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
                    Toast.makeText(sound_image_quiz.this, "the correct answer is:" + img1text_en[index] + "", Toast.LENGTH_SHORT).show();
                }
            } else {
                String input = txt1.getText().toString();
                if (input.equals(img2text_en[index])) {
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
                    Toast.makeText(sound_image_quiz.this, "the correct answer is:" + img2text_en[index] + "", Toast.LENGTH_SHORT).show();
                }

            }
        }
        // **************************Arabic*****************************************
        else if (option.equals(Quiz_Main.intent_extra_value_ar)) {
            if (arr_number == 0) {
                String input = txt1.getText().toString();
                if (input.equals(img1text_ar[index])) {
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
                    Toast.makeText(sound_image_quiz.this, "the correct answer is:" + img1text_ar[index] + "", Toast.LENGTH_SHORT).show();
                }
            } else {
                String input = txt1.getText().toString();
                input = input.toLowerCase();
                if (input.equals(img2text_ar[index].toLowerCase())) {
                    linearLayout = findViewById(R.id.linearview);
                    linearLayout.setVisibility(View.INVISIBLE);
                    res.setVisibility(View.VISIBLE);
                    res.setImageResource(R.drawable.corct);
                    player = MediaPlayer.create(this, R.raw.corct);
                    player.start();
                    Quiz_Main.grade += 10;
                } else {
                    linearLayout = findViewById(R.id.linearview);
                    linearLayout.setVisibility(View.INVISIBLE);
                    res.setImageResource(R.drawable.wrong);
                    res.setVisibility(View.VISIBLE);
                    player = MediaPlayer.create(this, R.raw.wrong);
                    player.start();
                    Toast.makeText(sound_image_quiz.this, "the correct answer is:" + img2text_ar[index] + "", Toast.LENGTH_SHORT).show();
                }

            }
        }

        // *************************************Math**********************************************
        else {

        }


    }

    public void intnt_onclick(View view) {
        player.release();
        if (counter < 9) {
            counter++;
            Intent intent = new Intent(sound_image_quiz.this, sound_quiz.class);
            intent.putExtra(Quiz_Main.intent_extra_key, option);
            intent.putExtra(Quiz_Main.intent_extra__counter_key,counter);
            startActivity(intent);
            finish();
        }
        else
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

