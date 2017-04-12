package com.example.aharshberger.myapplication_grab_bag;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Spash_Screen extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spash__screen);




        imageView = (ImageView) findViewById(R.id.imageViewSplash);



        imageView.setBackgroundResource(R.drawable.loading_ideo_u);
        AnimationDrawable gyroAnimation = (AnimationDrawable) imageView.getBackground();
        gyroAnimation.start();




        Thread background = new Thread() {
            public void run() {

                try {
                    // Thread will sleep for 5 seconds

                    sleep(4  * 500);


                    // After 5 seconds redirect to another intent
                    Intent i = new Intent(getBaseContext(), MainActivity.class);
                    startActivity(i);

                    //Remove activity
                    finish();

                } catch (Exception e) {

                }
            }
        };

        // start thread
        background.start();


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }





}
