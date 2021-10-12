package com.example.arrayof;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.Random;

public class complet_quiz extends AppCompatActivity {
    private ImageView image;
    private Button next;
    private ImageView res;
    private EditText txt1;
    private EditText txt2;
    private EditText txt3;
    private EditText txt4;
    private EditText txt5;
    private EditText txt6;
    private EditText txt7;
    private EditText txt8;
    private EditText txt9;
    private EditText txt10;
    String char1;
    String char2;
    public Intent intent;
    String option;
    LinearLayout linearLayout;
    String word;
    public static String quiz_type;
    int index;
    int arr_number;
    int complete1_index;
    int complete2_index;
    int counter;
    Random random = new Random();
    MediaPlayer player;
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
    int[] edittexts = {R.id.complete_quiz_txt1, R.id.complete_quiz_txt2, R.id.complete_quiz_txt3, R.id.complete_quiz_txt4,
            R.id.complete_quiz_txt5, R.id.complete_quiz_txt6, R.id.complete_quiz_txt7, R.id.complete_quiz_txt8,
            R.id.complete_quiz_txt9, R.id.complete_quiz_txt10};


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
    String[] img1text_en = {
            "Apple", "Ballon", "Cat", "Duck", "Egg", "Fish", "Goat", "Hat", "Insect", "Jar", "King", "Lion", "Man", "Nest", "Orange", "Pencil",
            "Queen", "Rabbit", "Sun", "Tiger", "Umbrella", "Violin", "Window", "X-ray", "Yoyo", "Zebra"};


    String[] img2text_en = {
            "Ant", "Ball", "Cup", "Dog", "Elephant", "Frog", "Giraffe", "Horse", "Ice cream", "Jelly", "Kite", "Lamp", "Monkey", "Nut", "Octopus", "Pig",
            "Quiz", "Rocket", "Spider", "Turtle", "Ugly", "Vase", "Watermelon", "Xylophone", "Yacht", "Zoo"};

    String[] img1text_ar = {"أرنب", "بطة", "تاج", "ثعلب", "جمل", "حمار", "خروف", "ديك", "ذئب", "رجل", "زرافة", "سمكة", "شمس", "صقر", "ضفدع", "طائرة",
            "ظبي", "عصفور", "غزال", "فيل", "قطار", "كلب", "ليمون", "موزة", "نمر", "هدهد", "ورقة", "يقطينة"};


    String[] img2text_ar = {
            "أسد", "باب", "تفاح", "ثعبان", "جاموسة", "حصان", "خبز", "دلفين", "ذبابة", "رمان", "زهرة", "ساعة", "شجرة", "صياد", "ضبع", "طاووس",
            "ظرف", "عين", "غراب", "فلاح", "قمر", "كتاب", "لحمة", "ملعب", "نملة", "هدية", "وردة", "يقطينة"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complet_quiz);
        setTitle("Quiz");
        image = findViewById(R.id.complete_image_quiz);
        txt1 = findViewById(R.id.complete_quiz_txt1);
        txt2 = findViewById(R.id.complete_quiz_txt2);
        txt3 = findViewById(R.id.complete_quiz_txt3);
        txt4 = findViewById(R.id.complete_quiz_txt4);
        txt5 = findViewById(R.id.complete_quiz_txt5);
        txt6 = findViewById(R.id.complete_quiz_txt6);
        txt7 = findViewById(R.id.complete_quiz_txt7);
        txt8 = findViewById(R.id.complete_quiz_txt8);
        txt9 = findViewById(R.id.complete_quiz_txt9);
        txt10 = findViewById(R.id.complete_quiz_txt10);
        res = findViewById(R.id.complete_quiz_res);
        next = findViewById(R.id.complete_quiz_next);
        Bundle b = getIntent().getExtras();
        option = b.getString(Quiz_Main.intent_extra_key);
        counter = b.getInt(Quiz_Main.intent_extra__counter_key);
        if (option.equals(Quiz_Main.intent_extra__value_en)) {
            index = random.nextInt(26);
            arr_number = random.nextInt(2);
            if (arr_number == 0) {
                image.setImageResource(image_id1_en[index]);
                player = MediaPlayer.create(this, img1audio_en[index]);
                word = img1text_en[index];
                player.start();

            } else {
                image.setImageResource(image_id2_en[index]);
                player = MediaPlayer.create(this, img2audio_en[index]);
                player.start();
                word = img2text_en[index];

            }


        } else if (option.equals(Quiz_Main.intent_extra_value_ar)) {
            index = random.nextInt(28);
            arr_number = random.nextInt(2);
            if (arr_number == 0) {
                image.setImageResource(image_id1_ar[index]);
                player = MediaPlayer.create(this, img1audio_ar[index]);
                word = img1text_ar[index];
                player.start();

            } else {
                image.setImageResource(image_id2_ar[index]);
                player = MediaPlayer.create(this, img2audio_ar[index]);
                word = img2text_ar[index];
                player.start();

            }
            word = new StringBuffer(word).reverse().toString();
        }
        txt1.setEnabled(false);
        txt2.setEnabled(false);
        txt3.setEnabled(false);
        txt4.setEnabled(false);
        txt5.setEnabled(false);
        txt6.setEnabled(false);
        txt7.setEnabled(false);
        txt8.setEnabled(false);
        txt9.setEnabled(false);
        txt10.setEnabled(false);

        if (word.length() == 3) {
            txt1.setVisibility(View.GONE);
            txt2.setVisibility(View.GONE);
            txt3.setVisibility(View.GONE);
            txt7.setVisibility(View.GONE);
            txt8.setVisibility(View.GONE);
            txt9.setVisibility(View.GONE);
            txt10.setVisibility(View.GONE);
            complete1_index = random.nextInt(3);
            while (true) {
                complete2_index = random.nextInt(3);
                if (complete2_index != complete1_index)
                    break;
            }

            if ((complete1_index == 0 && complete2_index == 1) || (complete1_index == 1 && complete2_index == 0))
            {

                txt4.setEnabled(true);
                txt5.setEnabled(true);
                txt6.setText(word.charAt(2) + "");
            }
            if ((complete1_index == 0 && complete2_index == 2) || (complete1_index == 2 && complete2_index == 0)) {

                txt4.setEnabled(true);
                txt6.setEnabled(true);
                txt5.setText(word.charAt(1) + "");
            }
            if ((complete1_index == 2 && complete2_index == 1) || (complete1_index == 1 && complete2_index == 2))
            {
                txt5.setEnabled(true);
                txt6.setEnabled(true);
                txt4.setText(word.charAt(0) + "");
            }

        }
        //***********************************************************************************************************
        if (word.length() == 4) {
            txt1.setVisibility(View.GONE);
            txt2.setVisibility(View.GONE);
            txt3.setVisibility(View.GONE);
            txt8.setVisibility(View.GONE);
            txt9.setVisibility(View.GONE);
            txt10.setVisibility(View.GONE);
            complete1_index = random.nextInt(3);
            while (true) {
                complete2_index = random.nextInt(3);
                if (complete2_index != complete1_index)
                    break;
            }
            txt4.setText(word.charAt(0) + "");
            txt5.setText(word.charAt(1) + "");
            txt6.setText(word.charAt(2) + "");
            txt7.setText(word.charAt(3) + "");
            if (complete2_index == 0) {
                txt4.setText("");
                txt4.setEnabled(true);
            }
            if (complete2_index == 1) {
                txt5.setText("");
                txt5.setEnabled(true);
            }
            if (complete2_index == 2) {
                txt6.setText("");
                txt6.setEnabled(true);
            }
            if (complete2_index == 3) {
                txt7.setEnabled(true);
                txt7.setText("");
            }
            if (complete1_index == 0) {
                txt4.setText("");
                txt4.setEnabled(true);
            }
            if (complete1_index == 1) {
                txt5.setText("");
                txt5.setEnabled(true);
            }
            if (complete1_index == 2) {
                txt6.setText("");
                txt6.setEnabled(true);
            }
            if (complete1_index == 3) {
                txt7.setText("");
                txt7.setEnabled(true);
            }

        }
        //*********************************************************************************
        if (word.length() == 5) {
            txt1.setVisibility(View.GONE);
            txt2.setVisibility(View.GONE);
            txt3.setVisibility(View.GONE);
            txt9.setVisibility(View.GONE);
            txt10.setVisibility(View.GONE);
            complete1_index = random.nextInt(3);
            while (true) {
                complete2_index = random.nextInt(3);
                if (complete2_index != complete1_index)
                    break;
            }
            txt4.setText(word.charAt(0) + "");
            txt5.setText(word.charAt(1) + "");
            txt6.setText(word.charAt(2) + "");
            txt7.setText(word.charAt(3) + "");
            txt8.setText(word.charAt(4) + "");
            if (complete2_index == 0) {
                txt4.setText("");
                txt4.setEnabled(true);
            }
            if (complete2_index == 1) {
                txt5.setText("");
                txt5.setEnabled(true);
            }
            if (complete2_index == 2) {
                txt6.setText("");
                txt6.setEnabled(true);
            }
            if (complete2_index == 3) {
                txt7.setText("");
                txt7.setEnabled(true);
            }
            if (complete2_index == 4) {
                txt8.setText("");
                txt8.setEnabled(true);
            }
            if (complete1_index == 0) {
                txt4.setText("");
                txt4.setEnabled(true);

            }
            if (complete1_index == 1) {
                txt5.setText("");
                txt5.setEnabled(true);
            }
            if (complete1_index == 2) {
                txt6.setText("");
                txt6.setEnabled(true);
            }
            if (complete1_index == 3) {
                txt7.setText("");
                txt7.setEnabled(true);
            }
            if (complete1_index == 4) {
                txt8.setText("");
                txt8.setEnabled(true);
            }

        }
        //****************************************************************************************
        if (word.length() == 6) {
            txt1.setVisibility(View.GONE);
            txt2.setVisibility(View.GONE);
            txt9.setVisibility(View.GONE);
            txt10.setVisibility(View.GONE);
            complete1_index = random.nextInt(3);
            while (true) {
                complete2_index = random.nextInt(3);
                if (complete2_index != complete1_index)
                    break;
            }
            txt3.setText(word.charAt(0) + "");
            txt4.setText(word.charAt(1) + "");
            txt5.setText(word.charAt(2) + "");
            txt6.setText(word.charAt(3) + "");
            txt7.setText(word.charAt(4) + "");
            txt8.setText(word.charAt(5) + "");
            if (complete2_index == 0) {
                txt3.setText("");
                txt3.setEnabled(true);
            }
            if (complete2_index == 1) {
                txt4.setText("");
                txt4.setEnabled(true);
            }
            if (complete2_index == 2) {
                txt5.setText("");
                txt5.setEnabled(true);
            }
            if (complete2_index == 3) {
                txt6.setText("");
                txt6.setEnabled(true);
            }
            if (complete2_index == 4) {
                txt7.setText("");
                txt7.setEnabled(true);
            }
            if (complete2_index == 5) {
                txt8.setText("");
                txt8.setEnabled(true);
            }
            if (complete1_index == 0) {
                txt3.setText("");
                txt3.setEnabled(true);
            }
            if (complete1_index == 1) {
                txt4.setText("");
                txt4.setEnabled(true);
            }
            if (complete1_index == 2) {
                txt5.setText("");
                txt5.setEnabled(true);
            }
            if (complete1_index == 3) {
                txt6.setText("");
                txt6.setEnabled(true);
            }
            if (complete1_index == 4) {
                txt7.setText("");
                txt7.setEnabled(true);
            }
            if (complete1_index == 5) {
                txt8.setText("");
                txt8.setEnabled(true);
            }

        }
        //*****************************************************************************************************************
        if (word.length() == 7) {
            txt1.setVisibility(View.GONE);
            txt2.setVisibility(View.GONE);
            txt10.setVisibility(View.GONE);
            complete1_index = random.nextInt(3);
            while (true) {
                complete2_index = random.nextInt(3);
                if (complete2_index != complete1_index)
                    break;
            }
            txt3.setText(word.charAt(0) + "");
            txt4.setText(word.charAt(1) + "");
            txt5.setText(word.charAt(2) + "");
            txt6.setText(word.charAt(3) + "");
            txt7.setText(word.charAt(4) + "");
            txt8.setText(word.charAt(5) + "");
            txt9.setText(word.charAt(6) + "");
            if (complete2_index == 0) {
                txt3.setText("");
                txt3.setEnabled(true);
            }
            if (complete2_index == 1) {
                txt4.setText("");
                txt4.setEnabled(true);
            }
            if (complete2_index == 2) {
                txt5.setText("");
                txt5.setEnabled(true);
            }
            if (complete2_index == 3) {
                txt6.setText("");
                txt6.setEnabled(true);
            }
            if (complete2_index == 4) {
                txt7.setText("");
                txt7.setEnabled(true);
            }
            if (complete2_index == 5) {
                txt8.setText("");
                txt8.setEnabled(true);
            }
            if (complete2_index == 6) {
                txt9.setText("");
                txt9.setEnabled(true);
            }
            if (complete1_index == 0) {
                txt3.setText("");
                txt3.setEnabled(true);
            }
            if (complete1_index == 1) {
                txt4.setText("");
                txt4.setEnabled(true);
            }
            if (complete1_index == 2) {
                txt5.setText("");
                txt5.setEnabled(true);
            }
            if (complete1_index == 3) {
                txt6.setText("");
                txt6.setEnabled(true);
            }
            if (complete1_index == 4) {
                txt7.setText("");
                txt7.setEnabled(true);
            }
            if (complete1_index == 5) {
                txt8.setText("");
                txt8.setEnabled(true);
            }
            if (complete1_index == 6) {
                txt9.setText("");
                txt9.setEnabled(true);
            }

        }
        //*****************************************************************************************************************
        if (word.length() == 8) {
            txt1.setVisibility(View.GONE);
            txt10.setVisibility(View.GONE);
            complete1_index = random.nextInt(3);
            while (true) {
                complete2_index = random.nextInt(3);
                if (complete2_index != complete1_index)
                    break;
            }
            txt2.setText(word.charAt(0) + "");
            txt3.setText(word.charAt(1) + "");
            txt4.setText(word.charAt(2) + "");
            txt5.setText(word.charAt(3) + "");
            txt6.setText(word.charAt(4) + "");
            txt7.setText(word.charAt(5) + "");
            txt8.setText(word.charAt(6) + "");
            txt9.setText(word.charAt(7) + "");
            if (complete2_index == 0) {
                txt2.setText("");
            }
            if (complete2_index == 1) {
                txt3.setText("");
                txt3.setEnabled(true);
            }
            if (complete2_index == 2) {
                txt4.setText("");
                txt4.setEnabled(true);
            }
            if (complete2_index == 3) {
                txt5.setText("");
                txt5.setEnabled(true);
            }
            if (complete2_index == 4) {
                txt6.setText("");
            }
            if (complete2_index == 5) {
                txt7.setText("");
                txt7.setEnabled(true);
            }
            if (complete2_index == 6) {
                txt8.setText("");
                txt8.setEnabled(true);
            }
            if (complete2_index == 7) {
                txt9.setText("");
                txt9.setEnabled(true);
            }
            if (complete1_index == 0) {
                txt2.setText("");
                txt2.setEnabled(true);
            }
            if (complete1_index == 1) {
                txt3.setText("");
                txt3.setEnabled(true);
            }
            if (complete1_index == 2) {
                txt4.setText("");
                txt4.setEnabled(true);
            }
            if (complete1_index == 3) {
                txt5.setText("");
                txt5.setEnabled(true);
            }
            if (complete1_index == 4) {
                txt6.setText("");
                txt6.setEnabled(true);
            }
            if (complete1_index == 5) {
                txt7.setText("");
                txt7.setEnabled(true);
            }
            if (complete1_index == 6) {
                txt8.setText("");
                txt8.setEnabled(true);
            }
            if (complete1_index == 7) {
                txt9.setText("");
                txt9.setEnabled(true);
            }

        }
        //*****************************************************************************************************************

        if (word.length() == 9) {
            txt1.setVisibility(View.GONE);
            complete1_index = random.nextInt(3);
            while (true) {
                complete2_index = random.nextInt(3);
                if (complete2_index != complete1_index)
                    break;
            }
            txt2.setText(word.charAt(0) + "");
            txt3.setText(word.charAt(1) + "");
            txt4.setText(word.charAt(2) + "");
            txt5.setText(word.charAt(3) + "");
            txt6.setText(word.charAt(4) + "");
            txt7.setText(word.charAt(5) + "");
            txt8.setText(word.charAt(6) + "");
            txt9.setText(word.charAt(7) + "");
            txt10.setText(word.charAt(8) + "");
            if (complete2_index == 0) {
                txt2.setText("");
                txt2.setEnabled(true);
            }
            if (complete2_index == 1) {
                txt3.setText("");
                txt3.setEnabled(true);
            }
            if (complete2_index == 2) {
                txt4.setText("");
                txt4.setEnabled(true);
            }
            if (complete2_index == 3) {
                txt5.setText("");
                txt5.setEnabled(true);
            }
            if (complete2_index == 4) {
                txt6.setText("");
                txt6.setEnabled(true);
            }
            if (complete2_index == 5) {
                txt7.setText("");
                txt7.setEnabled(true);
            }
            if (complete2_index == 6) {
                txt8.setText("");
                txt8.setEnabled(true);
            }
            if (complete2_index == 7) {
                txt9.setText("");
                txt9.setEnabled(true);

            }
            if (complete2_index == 8) {
                txt10.setText("");
                txt10.setEnabled(true);
            }
            if (complete1_index == 0) {
                txt2.setText("");
                txt2.setEnabled(true);
            }
            if (complete1_index == 1) {
                txt3.setText("");
                txt3.setEnabled(true);
            }
            if (complete1_index == 2) {
                txt4.setText("");
                txt4.setEnabled(true);
            }
            if (complete1_index == 3) {
                txt5.setText("");
                txt5.setEnabled(true);
            }
            if (complete1_index == 4) {
                txt6.setText("");
                txt6.setEnabled(true);
            }
            if (complete1_index == 5) {
                txt7.setText("");
                txt7.setEnabled(true);
            }
            if (complete1_index == 6) {
                txt8.setText("");
                txt8.setEnabled(true);
            }
            if (complete1_index == 7) {
                txt9.setText("");
                txt9.setEnabled(true);
            }
            if (complete1_index == 8) {
                txt10.setText("");
                txt10.setEnabled(true);
            }

        }
        //*****************************************************************************************************************
        if (word.length() == 10) {

            complete1_index = random.nextInt(3);
            while (true) {
                complete2_index = random.nextInt(3);
                if (complete2_index != complete1_index)
                    break;
            }
            txt1.setText(word.charAt(0) + "");
            txt2.setText(word.charAt(1) + "");
            txt3.setText(word.charAt(2) + "");
            txt4.setText(word.charAt(3) + "");
            txt5.setText(word.charAt(4) + "");
            txt6.setText(word.charAt(5) + "");
            txt7.setText(word.charAt(6) + "");
            txt8.setText(word.charAt(7) + "");
            txt9.setText(word.charAt(8) + "");
            txt10.setText(word.charAt(9) + "");
            if (complete2_index == 0) {
                txt1.setText("");
                txt1.setEnabled(true);
            }
            if (complete2_index == 1) {
                txt2.setText("");
                txt2.setEnabled(true);
            }
            if (complete2_index == 2) {
                txt3.setText("");
                txt3.setEnabled(true);
            }
            if (complete2_index == 3) {
                txt4.setText("");
                txt4.setEnabled(true);
            }
            if (complete2_index == 4) {
                txt5.setText("");
                txt5.setEnabled(true);
            }
            if (complete2_index == 5) {
                txt6.setText("");
                txt6.setEnabled(true);
            }
            if (complete2_index == 6) {
                txt7.setText("");
                txt7.setEnabled(true);
            }
            if (complete2_index == 7) {
                txt8.setText("");
                txt8.setEnabled(true);
            }
            if (complete2_index == 8) {
                txt9.setText("");
                txt9.setEnabled(true);
            }
            if (complete2_index == 9) {
                txt10.setText("");
                txt10.setEnabled(true);
            }
            if (complete1_index == 0) {
                txt1.setText("");
                txt1.setEnabled(true);
            }
            if (complete1_index == 1) {
                txt2.setText("");
                txt2.setEnabled(true);
            }
            if (complete1_index == 2) {
                txt3.setText("");
                txt3.setEnabled(true);
            }
            if (complete1_index == 3) {
                txt4.setText("");
                txt4.setEnabled(true);
            }
            if (complete1_index == 4) {
                txt5.setText("");
                txt5.setEnabled(true);
            }
            if (complete1_index == 5) {
                txt6.setText("");
                txt6.setEnabled(true);
            }
            if (complete1_index == 6) {
                txt7.setText("");
                txt7.setEnabled(true);
            }
            if (complete1_index == 7) {
                txt8.setText("");
                txt8.setEnabled(true);
            }
            if (complete1_index == 8) {
                txt9.setText("");
                txt9.setEnabled(true);
            }
            if (complete1_index == 9) {
                txt10.setText("");
                txt10.setEnabled(true);
            }

        }
        //*****************************************************************************************************************


    }



    public void res_onclick(View view) {


            String word2="";

            for (int i = 0; i < 10; i++) {
                EditText editText = findViewById(edittexts[i]);
                if(!editText.getText().equals(null))
                    word2+=editText.getText().toString();
            }
            String word3 = word;
            word=word.toLowerCase();
            word2=word2.toLowerCase();
            if(word.equals(word2)){
                linearLayout = findViewById(R.id.linearview);
                linearLayout.setVisibility(View.INVISIBLE);
                res.setVisibility(View.VISIBLE);
                res.setImageResource(R.drawable.corct);
                player = MediaPlayer.create(complet_quiz.this, R.raw.corct);
                player.start();
                Quiz_Main.grade += 10;}
            else {
                res.setImageResource(R.drawable.wrong);
                linearLayout = findViewById(R.id.linearview);
                linearLayout.setVisibility(View.INVISIBLE);
                res.setVisibility(View.VISIBLE);
                player = MediaPlayer.create(this, R.raw.wrong);
                player.start();
                if(option.equals(Quiz_Main.intent_extra_value_ar)) {
                    word3 = new StringBuilder(word3).reverse().toString();
                }
                Toast.makeText(complet_quiz.this, "the correct answer is:" + word3+ "", Toast.LENGTH_SHORT).show();
            }
    }

    public void intnt_onclick (View view){
        player.stop();
        player.release();
        if (counter < 10) {
            counter++;
            Intent intent = new Intent(complet_quiz.this, Choose_quiz.class);
            intent.putExtra(Quiz_Main.intent_extra_key, option);
            intent.putExtra(Quiz_Main.intent_extra__counter_key, counter);
            startActivity(intent);
            finish();
        } else {
            Toast.makeText(complet_quiz.this, "your grade is:" + Quiz_Main.grade, Toast.LENGTH_SHORT).show();
        }
    }
}



