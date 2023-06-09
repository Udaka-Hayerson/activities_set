package com.example.activityexample.from_the_first_to_the_fourth_lesson.heap_of_activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;

import com.example.activityexample.R;

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
        if (image.getVisibility() == View.INVISIBLE) {
            image.setVisibility(View.VISIBLE);
        } else {
            image.setVisibility(View.INVISIBLE);
        }
        imageCount++;
    }
}
