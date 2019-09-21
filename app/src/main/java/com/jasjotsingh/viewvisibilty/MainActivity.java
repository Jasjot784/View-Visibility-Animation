package com.jasjotsingh.viewvisibilty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView imageView = (ImageView) findViewById(R.id.image);
        imageView.setVisibility(View.GONE);
        Button button = findViewById(R.id.button);
        // slide-up animation
        final Animation slideUp = AnimationUtils.loadAnimation(this, R.anim.slide_up);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setVisibility(View.VISIBLE);
                imageView.startAnimation(slideUp);
            }
        });


        if (imageView.getVisibility() == View.INVISIBLE) {
            imageView.setVisibility(View.VISIBLE);
            imageView.startAnimation(slideUp);
        }
    }
}
