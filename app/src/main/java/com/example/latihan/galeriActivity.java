package com.example.latihan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ViewFlipper;

public class galeriActivity extends AppCompatActivity {
    ViewFlipper viewFlipper;
     Animation fadein,fadeout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeri);

        viewFlipper =(ViewFlipper) findViewById(R.id.viewFlipper);
        fadein = AnimationUtils.loadAnimation(this,R.anim.fade_in);
        fadeout=AnimationUtils.loadAnimation(this,R.anim.fade_out);

        viewFlipper.setInAnimation(fadein);
        viewFlipper.setOutAnimation(fadein);

        viewFlipper.setAutoStart(true);
        viewFlipper.setFlipInterval(5000);
        viewFlipper.startFlipping();
    }


    public void hutri(View view) {
        Intent intent = new Intent(galeriActivity.this, AlbumhutriActivity.class);
        startActivity(intent);
    }

    public void pramuka(View view) {
        Intent intent = new Intent(galeriActivity.this, AlbumpramukaActivity.class);
        startActivity(intent);
    }

    public void pmr(View view) {
        Intent intent = new Intent(galeriActivity.this, AlbumpmrActivity.class);
        startActivity(intent);
    }
}