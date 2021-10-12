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

public class Number_ar extends AppCompatActivity {

    ImageView imageView;
    MediaPlayer player;
    Button previous,play,next;


    int currentNumber = -1;
    int [] img_number ={
            R.drawable.ar1,R.drawable.ar2,R.drawable.ar3,R.drawable.ar4,R.drawable.ar5,
            R.drawable.ar6,R.drawable.ar7,R.drawable.ar8,R.drawable.ar9,R.drawable.ar10};

    int[] numaudio = {
            R.raw.na1,R.raw.na2,R.raw.na3,R.raw.na4,R.raw.na5,
            R.raw.na6,R.raw.na7,R.raw.na8,R.raw.na9,R.raw.na10};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_ar);

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
