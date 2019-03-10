package com.rifkiadam.gryus.greatingapps;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Toast;

public class SplashActivity extends AppCompatActivity {

    protected Animation fadeIn;

    private static int splashTimeOut=5000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        new Handler().postDelayed(new Runnable() {
            public void run() {
                Intent mainIntent = new Intent(SplashActivity.this, MainActivity.class)
                        .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
                        .addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                SplashActivity.this.startActivity(mainIntent);

                SplashActivity.this.finish();
            }
        }, splashTimeOut);

//        Intent intent = new Intent(this,MainActivity.class);
//        startActivity(intent);
//        finish();
    }
}
