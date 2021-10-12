package com.example.arrayof;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class Number_en extends AppCompatActivity {

    ImageView imageView;
    MediaPlayer player;
    Button previous,play,next;


    int currentNumber = -1;
    int [] img_number ={
            R.drawable.en1,R.drawable.en2,R.drawable.en3,R.drawable.en4,R.drawable.en5,
            R.drawable.en6,R.drawable.en7,R.drawable.en8,R.drawable.en9,R.drawable.en10};

    int[] numaudio = {
            R.raw.ne1,R.raw.ne2,R.raw.ne3,R.raw.ne4,R.raw.ne5,
            R.raw.ne6,R.raw.ne7,R.raw.ne8,R.raw.ne9,R.raw.ne10};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_en);

        imageView = findViewById(R.id.number);
        previous=findViewById(R.id.previous);
        play=findViewById(R.id.play);
        next=findViewById(R.id.next);

        first();



    }
    public void next(View view) {
        YoYo.with(Techniques.Pulse).duration(200).playOn(next);
        if (currentNumber >= 9)
            return;

        if (currentNumber >= 0)
            player.release();




        imageView.setImageResource(img_number[++currentNumber]);
        player = MediaPlayer.create(this, numaudio[currentNumber]);
        player.start();
    }


    public void previus(View view) {
        YoYo.with(Techniques.Pulse).duration(200).playOn(previous);
        if (currentNumber <= 0)
            return;

        if (currentNumber <= 9)
            player.release();

        imageView.setImageResource(img_number[--currentNumber]);
        player = MediaPlayer.create(this, numaudio[currentNumber]);
        player.start();


    }

    public void play(View view){


        YoYo.with(Techniques.Pulse).duration(200).playOn(play);


        if (currentNumber >= 0)
            player.release();

        player = MediaPlayer.create(this, numaudio[currentNumber]);
        player.start();
    }
    private void first(){
        currentNumber++;
        imageView.setImageResource(img_number[currentNumber]);
        player = MediaPlayer.create(this, numaudio[currentNumber]);
        player.start();
    }

    public void playImagenum(View view) {
        player.release();
        player = MediaPlayer.create(this, numaudio[currentNumber]);
        player.start();
        YoYo.with(Techniques.Pulse).duration(450).playOn(imageView);

    }
}
