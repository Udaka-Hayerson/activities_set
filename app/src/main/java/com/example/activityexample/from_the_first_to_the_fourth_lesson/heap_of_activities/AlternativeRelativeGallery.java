package com.example.activityexample.from_the_first_to_the_fourth_lesson.heap_of_activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;

import com.example.activityexample.R;

import java.util.ArrayList;

public class AlternativeRelativeGallery  extends Activity {
    ImageView image00;
    ImageView image11;
    ImageView image22;
    ImageView image33;
    ImageView image44;
    ImageView buffer;
    ArrayList<ImageView> relative_list;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alternative_relative_gallery);
        image44 = (ImageView) findViewById(R.id.image_44);
        image33 = (ImageView) findViewById(R.id.image_33);
        image00 = (ImageView) findViewById(R.id.image_00);
        image11 = (ImageView) findViewById(R.id.image_11);
        image22 = (ImageView) findViewById(R.id.image_22);
        buffer = image00;

    }
}
