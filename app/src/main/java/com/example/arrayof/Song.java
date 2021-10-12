package com.example.arrayof;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.MediaController;
import android.widget.VideoView;

public class Song extends AppCompatActivity {
    String option;

    int currentsong =-1;
    int[] song_id = {R.raw.ar_song,R.raw.en_song,R.raw.armth_song,R.raw.enmth_song,R.raw.arcol_song,R.raw.encol_song};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);

        Bundle b = getIntent().getExtras();
        option = b.getString(Quiz_Main.intent_extra_key);
        switch (option){
            case Quiz_Main.intent_extra_value_ar:
                currentsong = 0;
                break;
            case Quiz_Main.intent_extra__value_en:
                currentsong = 1;
                break;
            case Quiz_Main.intent_extra__value_mth_ar:
                currentsong = 2;
                break;
            case Quiz_Main.intent_extra__value_mth_en:
                currentsong=3;
                break;
            case Quiz_Main.intent_extra__value_col_ar:
                currentsong=4;
                break;
            case Quiz_Main.intent_extra__value_col_en:
                currentsong=5;
                break;
        }

        start(currentsong);
    }

    private void start(int c){
        VideoView videoView = findViewById(R.id.video);
        String videopath = "android.resource://"+getPackageName()+"/"+song_id[c];
        Uri uri = Uri.parse(videopath);
        videoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);
        videoView.start();
    }
}
