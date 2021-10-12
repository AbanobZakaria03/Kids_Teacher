package com.example.arrayof;

import androidx.appcompat.app.AppCompatActivity;
import androidx.interpolator.view.animation.FastOutLinearInInterpolator;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class MainActivity extends AppCompatActivity {
    TextView textView , textView1,textView2;
    Button previous,play,next;
    String htmlText;
    MediaPlayer player,player1;
    ImageView image1, image2;
    int currentArAlphabetical = -1;

    int[] image_id1 = {
            R.drawable.a1_image1, R.drawable.a2_image1, R.drawable.a3_image1, R.drawable.a4_image1, R.drawable.a5_image1,
            R.drawable.a6_image1, R.drawable.a7_image1, R.drawable.a8_image1, R.drawable.a9_image1, R.drawable.a10_image1,
            R.drawable.a11_image1, R.drawable.a12_image1, R.drawable.a13_image1, R.drawable.a14_image1, R.drawable.a15_image1,
            R.drawable.a16_image1, R.drawable.a17_image1, R.drawable.a18_image1, R.drawable.a19_image1, R.drawable.a20_image1,
            R.drawable.a21_image1, R.drawable.a22_image1, R.drawable.a23_image1, R.drawable.a24_image1, R.drawable.a25_image1,
            R.drawable.a26_image1, R.drawable.a27_image1, R.drawable.a28_image1};


    int[] image_id2 = {
            R.drawable.a1_image2, R.drawable.a2_image2, R.drawable.a3_image2, R.drawable.a4_image2, R.drawable.a5_image2,
            R.drawable.a6_image2, R.drawable.a7_image2, R.drawable.a8_image2, R.drawable.a9_image2, R.drawable.a10_image2,
            R.drawable.a11_image2, R.drawable.a12_image2, R.drawable.a13_image2, R.drawable.a14_image2, R.drawable.a15_image2,
            R.drawable.a16_image2, R.drawable.a17_image2, R.drawable.a18_image2, R.drawable.a19_image2, R.drawable.a20_image2,
            R.drawable.a21_image2, R.drawable.a22_image2, R.drawable.a23_image2, R.drawable.a24_image2, R.drawable.a25_image2,
            R.drawable.a26_image2, R.drawable.a27_image2, R.drawable.a28_image2};

    char[] alpha = {'أ', 'ب', 'ت', 'ث', 'ج', 'ح', 'خ', 'د', 'ذ', 'ر', 'ز', 'س', 'ش', 'ص', 'ض', 'ط', 'ظ', 'ع', 'غ', 'ف', 'ق', 'ك', 'ل', 'م', 'ن', 'ه', 'و', 'ي'};

    String[] img1text ={
            "أرنب","بطة","تاج","ثعلب","جمل","حمار","خروف","ديك","ذئب","رجل","زرافة","سمكة","شمس","صقر","ضفدع","طائرة",
            "ظبي","عصفور","غزال","فيل","قطار","كلب","ليمون","موزة","نمر","هدهد","ورقة","يد"};


    String[] img2text ={
            "أسد","باب","تفاح","ثعبان","جاموسة","حصان","خبز","دلفين","ذبابة","رمان","زهرة","ساعة","شجرة","صياد","ضبع","طاووس",
            "ظرف","عين","غراب","فلاح","قمر","كتاب","لحمة","ملعب","نملة","هدية","وردة","يقطينة"};

    int[] arAlphabetical = {
            R.raw.ar1, R.raw.ar2, R.raw.ar3,
            R.raw.ar4, R.raw.ar5, R.raw.ar6,
            R.raw.ar7, R.raw.ar8, R.raw.ar9,
            R.raw.ar10, R.raw.ar11, R.raw.ar12,
            R.raw.ar13, R.raw.ar14, R.raw.ar15,
            R.raw.ar16, R.raw.ar17, R.raw.ar18,
            R.raw.ar19, R.raw.ar20, R.raw.ar21,
            R.raw.ar22, R.raw.ar23, R.raw.ar24,
            R.raw.ar25, R.raw.ar26, R.raw.ar27, R.raw.ar28};

    int[] img1audio = {
            R.raw.a1audio1,R.raw.a2audio1,R.raw.a3audio1,R.raw.a4audio1,R.raw.a5audio1,
            R.raw.a6audio1,R.raw.a7audio1,R.raw.a8audio1,R.raw.a9audio1,R.raw.a10audio1,
            R.raw.a11audio1,R.raw.a12audio1,R.raw.a13audio1,R.raw.a14audio1,R.raw.a15audio1,
            R.raw.a16audio1,R.raw.a17audio1,R.raw.a18audio1,R.raw.a19audio1,R.raw.a20audio1,
            R.raw.a21audio1,R.raw.a22audio1,R.raw.a23audio1,R.raw.a24audio1,R.raw.a25audio1,
            R.raw.a26audio1,R.raw.a27audio1,R.raw.a28audio1};

    int[] img2audio = {
            R.raw.a1audio2,R.raw.a2audio2,R.raw.a3audio2,R.raw.a4audio2,R.raw.a5audio2,
            R.raw.a6audio2,R.raw.a7audio2,R.raw.a8audio2,R.raw.a9audio2,R.raw.a10audio2,
            R.raw.a11audio2,R.raw.a12audio2,R.raw.a13audio2,R.raw.a14audio2,R.raw.a15audio2,
            R.raw.a16audio2,R.raw.a17audio2,R.raw.a18audio2,R.raw.a19audio2,R.raw.a20audio2,
            R.raw.a21audio2,R.raw.a22audio2,R.raw.a23audio2,R.raw.a24audio2,R.raw.a25audio2,
            R.raw.a26audio2,R.raw.a27audio2,R.raw.a28audio2};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        image1 = findViewById(R.id.image1);
        image2 = findViewById(R.id.image2);

        textView = findViewById(R.id.alpha);
        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);

        previous=findViewById(R.id.previous);
        play=findViewById(R.id.play);
        next=findViewById(R.id.next);







        first();
    }

    public void next(View view) {
        YoYo.with(Techniques.Pulse).duration(200).playOn(next);
        if (currentArAlphabetical >= 27)
            return;

        if (currentArAlphabetical >= 0)
            player.release();


        textView.setText("" + alpha[++currentArAlphabetical]);
        /*textView1.setText(img1text[currentArAlphabetical]);
        textView2.setText(img2text[currentArAlphabetical]);
        */

        htmlText = img1text[currentArAlphabetical].replace(""+alpha[currentArAlphabetical],"<font color='#FF0000'>"+""+alpha[currentArAlphabetical] +"</font>");
        textView1.setText(Html.fromHtml(htmlText));
        htmlText = img2text[currentArAlphabetical].replace(""+alpha[currentArAlphabetical],"<font color='#FF0000'>"+""+alpha[currentArAlphabetical] +"</font>");
        textView2.setText(Html.fromHtml(htmlText));
        textView1.setAlpha(0);
        textView2.setAlpha(0);
        image1.setImageResource(image_id1[currentArAlphabetical]);
        image2.setImageResource(image_id2[currentArAlphabetical]);
        player = MediaPlayer.create(this, arAlphabetical[currentArAlphabetical]);
        player.start();
    }


    public void previus(View view) {
        YoYo.with(Techniques.Pulse).duration(200).playOn(previous);
        //currentArAlphabetical-=2;
        if (currentArAlphabetical <= 0)
            return;

        if (currentArAlphabetical <= 27)
            player.release();

        textView.setText("" + alpha[--currentArAlphabetical]);
        htmlText = img1text[currentArAlphabetical].replace(""+alpha[currentArAlphabetical],"<font color='#FF0000'>"+""+alpha[currentArAlphabetical] +"</font>");
        textView1.setText(Html.fromHtml(htmlText));
        htmlText = img2text[currentArAlphabetical].replace(""+alpha[currentArAlphabetical],"<font color='#FF0000'>"+""+alpha[currentArAlphabetical] +"</font>");
        textView2.setText(Html.fromHtml(htmlText));
        image1.setImageResource(image_id1[currentArAlphabetical]);
        image2.setImageResource(image_id2[currentArAlphabetical]);
        player = MediaPlayer.create(this, arAlphabetical[currentArAlphabetical]);
        player.start();


    }

    public void play(View view){


        YoYo.with(Techniques.Pulse).duration(200).playOn(play);


        if (currentArAlphabetical >= 0)
            player.release();

        player = MediaPlayer.create(this, arAlphabetical[currentArAlphabetical]);
        player.start();
    }


    public void playImage1(View view) {
        player.release();
        player = MediaPlayer.create(this, img1audio[currentArAlphabetical]);
        player.start();

        YoYo.with(Techniques.Pulse).duration(620).playOn(image1);
        YoYo.with(Techniques.SlideInRight).duration(620).playOn(textView1);

    }

    public void playImage2(View view) {
        player.release();
        player = MediaPlayer.create(this, img2audio[currentArAlphabetical]);
        player.start();

        YoYo.with(Techniques.Pulse).duration(620).playOn(image2);
        YoYo.with(Techniques.SlideInRight).duration(620).playOn(textView2);

    }

    private void first(){

        textView.setText("" + alpha[++currentArAlphabetical]);
        htmlText = img1text[currentArAlphabetical].replace(""+alpha[currentArAlphabetical],"<font color='#FF0000'>"+""+alpha[currentArAlphabetical] +"</font>");
        textView1.setText(Html.fromHtml(htmlText));
        htmlText = img2text[currentArAlphabetical].replace(""+alpha[currentArAlphabetical],"<font color='#FF0000'>"+""+alpha[currentArAlphabetical] +"</font>");
        textView2.setText(Html.fromHtml(htmlText));
        textView1.setAlpha(0);
        textView2.setAlpha(0);
        player = MediaPlayer.create(this, arAlphabetical[currentArAlphabetical]);
        player.start();
    }

}

