package com.minhah.shahid.minhah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Splash extends AppCompatActivity {

    ImageView splashImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashImage = (ImageView) findViewById(R.id.splash_image);
        Animation anim = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.scale_anim);
        splashImage.setAnimation(anim);
        new Thread() {
            @Override
            public void run() {
                super.run();
                try {
                    sleep(3000);

                    Intent intent = new Intent(Splash.this,
                            MainActivity.class);
                    startActivity(intent);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
