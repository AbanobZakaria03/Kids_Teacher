package com.example.arrayof;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class Main2Activity extends AppCompatActivity {
    TextView textView , textView1,textView2;
    Button previous,play,next;
    String htmlText;
    MediaPlayer player,player1;
    ImageView image1, image2;
    int currentArAlphabetical = -1;

    int[] image_id1 = {
            R.drawable.e1_image1, R.drawable.e2_image1, R.drawable.e3_image1, R.drawable.e4_image1, R.drawable.e5_image1,
            R.drawable.e6_image1, R.drawable.e7_image1, R.drawable.e8_image1, R.drawable.e9_image1, R.drawable.e10_image1,
            R.drawable.e11_image1, R.drawable.e12_image1, R.drawable.e13_image1, R.drawable.e14_image1, R.drawable.e15_image1,
            R.drawable.e16_image1, R.drawable.e17_image1, R.drawable.e18_image1, R.drawable.e19_image1, R.drawable.e20_image1,
            R.drawable.e21_image1, R.drawable.e22_image1, R.drawable.e23_image1, R.drawable.e24_image1, R.drawable.e25_image1,
            R.drawable.e26_image1};


    int[] image_id2 = {
            R.drawable.e1_image2, R.drawable.e2_image2, R.drawable.e3_image2, R.drawable.e4_image2, R.drawable.e5_image2,
            R.drawable.e6_image2, R.drawable.e7_image2, R.drawable.e8_image2, R.drawable.e9_image2, R.drawable.e10_image2,
            R.drawable.e11_image2, R.drawable.e12_image2, R.drawable.e13_image2, R.drawable.e14_image2, R.drawable.e15_image2,
            R.drawable.e16_image2, R.drawable.e17_image2, R.drawable.e18_image2, R.drawable.e19_image2, R.drawable.e20_image2,
            R.drawable.e21_image2, R.drawable.e22_image2, R.drawable.e23_image2, R.drawable.e24_image2, R.drawable.e25_image2,
            R.drawable.e26_image2};

    char[] alpha = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'و', 'ي'};

    String[] img1text ={
            "Apple","Ballon","Cat","Duck","Egg","Fish","Goat","Hat","Insect","Jar","King","Lion","Man","Nest","Orange","Pencil",
            "Queen","Rabbit","Sun","Tiger","Umbrella","Violin","Window","X-ray","Yoyo","Zebra"};


    String[] img2text ={
            "Ant","Ball","Cup","Dog","Elephant","Frog","Giraffe","Horse","Ice cream","Jelly","Kite","Lamp","Monkey","Nut","Octopus","Pig",
            "Quiz","Rocket","Spider","Turtle","Ugly","Vase","Watermelon","Xylophone","Yacht","Zoo"};

    int[] arAlphabetical = {
            R.raw.en1, R.raw.en2, R.raw.en3,
            R.raw.en4, R.raw.en5, R.raw.en6,
            R.raw.en7, R.raw.en8, R.raw.en9,
            R.raw.en10, R.raw.en11, R.raw.en12,
            R.raw.en13, R.raw.en14, R.raw.en15,
            R.raw.en16, R.raw.en17, R.raw.en18,
            R.raw.en19, R.raw.en20, R.raw.en21,
            R.raw.en22, R.raw.en23, R.raw.en24,
            R.raw.en25, R.raw.en26};

    int[] img1audio = {
            R.raw.e1audio1,R.raw.e2audio1,R.raw.e3audio1,R.raw.e4audio1,R.raw.e5audio1,
            R.raw.e6audio1,R.raw.e7audio1,R.raw.e8audio1,R.raw.e9audio1,R.raw.e10audio1,
            R.raw.e11audio1,R.raw.e12audio1,R.raw.e13audio1,R.raw.e14audio1,R.raw.e15audio1,
            R.raw.e16audio1,R.raw.e17audio1,R.raw.e18audio1,R.raw.e19audio1,R.raw.e20audio1,
            R.raw.e21audio1,R.raw.e22audio1,R.raw.e23audio1,R.raw.e24audio1,R.raw.e25audio1,
            R.raw.e26audio1};

    int[] img2audio = {
            R.raw.e1audio2,R.raw.e2audio2,R.raw.e3audio2,R.raw.e4audio2,R.raw.e5audio2,
            R.raw.e6audio2,R.raw.e7audio2,R.raw.e8audio2,R.raw.e9audio2,R.raw.e10audio2,
            R.raw.e11audio2,R.raw.e12audio2,R.raw.e13audio2,R.raw.e14audio2,R.raw.e15audio2,
            R.raw.e16audio2,R.raw.e17audio2,R.raw.e18audio2,R.raw.e19audio2,R.raw.e20audio2,
            R.raw.e21audio2,R.raw.e22audio2,R.raw.e23audio2,R.raw.e24audio2,R.raw.e25audio2,
            R.raw.e26audio2};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

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
        if (currentArAlphabetical >= 25)
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

        if (currentArAlphabetical <= 25)
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
