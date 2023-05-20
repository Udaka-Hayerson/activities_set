package com.example.activityexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;

public class InvisibleImageActivity extends Activity {
    private ImageView image;
    private int imageCount = 1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.invisible_image_activity);
        image = (ImageView) findViewById(R.id.imageView);
    }
    public void visibleImage(View view){
        if (imageCount%2 == 0) {
            image.setVisibility(View.VISIBLE);
        } else {
            image.setVisibility(View.INVISIBLE);
        }
        imageCount++;
    }
}
