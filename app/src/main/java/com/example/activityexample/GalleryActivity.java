package com.example.activityexample;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;

public class GalleryActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
    }
}