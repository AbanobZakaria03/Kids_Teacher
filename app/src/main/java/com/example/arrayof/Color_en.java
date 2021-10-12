package com.example.arrayof;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class Color_en extends AppCompatActivity {
    int[] colors = {R.color.red, R.color.blue,R.color.green, R.color.yellow,R.color.orange, R.color.purple,R.color.white, R.color.black, R.color.brown};
    int[] colaudio = {
            R.raw.encl1,R.raw.encl2,R.raw.encl3,R.raw.encl4,R.raw.encl5,
            R.raw.encl6,R.raw.encl7,R.raw.encl8,R.raw.encl9};
    String[] textColors = {"Red","Blue","Green","Yellow","Orange","Purple","White","Black","Brown"};
    Button previous, play, next;
    Drawable background;
    MediaPlayer player;
    TextView textView;
    GradientDrawable gradientDrawable;
    int currentColor = -1;
    View view1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color_en);
        previous = findViewById(R.id.previous);
        play = findViewById(R.id.play);
        next = findViewById(R.id.next);
        view1 = findViewById(R.id.view);
        textView=findViewById(R.id.color);
        background = view1.getBackground();
        gradientDrawable = (GradientDrawable) background;

        first();

    }

    public void next(View view) {
        YoYo.with(Techniques.Pulse).duration(200).playOn(next);

        if (currentColor >= 8)
            return;
        if (currentColor >= 0)
            player.release();



        gradientDrawable.setColor(ContextCompat.getColor(this,colors[++currentColor]));
        if(currentColor==6)
            textView.setTextColor(ContextCompat.getColor(this,R.color.black));
        else
            textView.setTextColor(ContextCompat.getColor(this,colors[currentColor]));
        textView.setText(textColors[currentColor]);
        player = MediaPlayer.create(this, colaudio[currentColor]);
        player.start();
    }
    public void previus(View view) {
        YoYo.with(Techniques.Pulse).duration(200).playOn(previous);

        if (currentColor <= 0)
            return;

        if (currentColor <= 9)
            player.release();



        gradientDrawable.setColor(ContextCompat.getColor(this,colors[--currentColor]));
        textView.setTextColor(ContextCompat.getColor(this,colors[currentColor]));
        textView.setText(textColors[currentColor]);
        player = MediaPlayer.create(this, colaudio[currentColor]);
        player.start();

    }
    public void play(View view){


        YoYo.with(Techniques.Pulse).duration(200).playOn(play);


        if (currentColor >= 0)
            player.release();

        player = MediaPlayer.create(this, colaudio[currentColor]);
        player.start();
    }

    private void first(){
        currentColor++;
        player = MediaPlayer.create(this, colaudio[currentColor]);
        player.start();
    }

}
