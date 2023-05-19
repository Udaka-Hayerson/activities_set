package com.example.activityexample;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;

public class InvisibleImageActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.invisible_image_activity);
    }
}
