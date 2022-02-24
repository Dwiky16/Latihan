package com.example.latihan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class perpusActivity extends AppCompatActivity {
    SliderView sliderView;
    int[] images = {R.drawable.ekstra,
            R.drawable.ekstra2,
            R.drawable.ekstrakulikuler,
            R.drawable.header,
            R.drawable.header1};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perpus);
        sliderView = findViewById(R.id.image_slider);

        SliderAdapter sliderAdapter = new SliderAdapter(images);

        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView.startAutoCycle();
    }


    public void buku7(View view) {
        Intent intent = new Intent(perpusActivity.this, Buku7Activity.class);
        startActivity(intent);
    }

    public void buku8(View view) {
        Intent intent = new Intent(perpusActivity.this, Buku8Activity.class);
        startActivity(intent);
    }

    public void buku9(View view) {
        Intent intent = new Intent(perpusActivity.this, Buku9Activity.class);
        startActivity(intent);
    }
}