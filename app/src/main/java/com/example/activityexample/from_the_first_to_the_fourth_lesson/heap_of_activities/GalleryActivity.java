package com.example.activityexample.from_the_first_to_the_fourth_lesson.heap_of_activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;

import com.example.activityexample.R;

import java.util.ArrayList;

public class GalleryActivity extends Activity {
    ImageView image0;
    ImageView image1;
    ImageView image2;
    ImageView image3;
    ImageView image4;
    ImageView buffer;
    int indicate = 0;
    ArrayList<ImageView> image_list;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery); //◀️ ▶️ ⬅️ ➡️
        image0 = (ImageView) findViewById(R.id.image_0);
        image1 = (ImageView) findViewById(R.id.image_1);
        image2 = (ImageView) findViewById(R.id.image_2);
        image3 = (ImageView) findViewById(R.id.image_3);
        image4 = (ImageView) findViewById(R.id.image_4);
        image0.setVisibility(View.VISIBLE);
        buffer = image0;
        image_list = fill();

    }

    public void visibleImage(View view) {
        if (((Button)view).getId() == R.id.right) {
            if (indicate < image_list.size()-1) {
                for (int i = 0; i < image_list.size()-1; i++) {
                    if(image_list.get(i) == buffer){
                        image_list.get(i).setVisibility(View.INVISIBLE);
                        image_list.get(i+1).setVisibility(View.VISIBLE);
                        indicate = i+1;
                    }
                }
                buffer = image_list.get(indicate);
            } else {
                image_list.get(image_list.size()-1).setVisibility(View.INVISIBLE);
                image_list.get(0).setVisibility(View.VISIBLE);
                indicate = 0;
                buffer = image_list.get(0);
            }
        } else {
            if (indicate > 0) {
                for (int i = image_list.size(); i > 0; i--) {
                    if (image_list.get(i) == buffer) {
                        image_list.get(i).setVisibility(View.INVISIBLE);
                        image_list.get(i-1).setVisibility(View.VISIBLE);
                        indicate = i-1;
                    }
                }
                buffer = image_list.get(indicate);
            } else {
                image_list.get(0).setVisibility(View.INVISIBLE);
                image_list.get(image_list.size()-1).setVisibility(View.VISIBLE);
                indicate = 0;
                buffer = image_list.get(0);
            }
        }
    }

    private ArrayList<ImageView> fill() {
        ArrayList<ImageView> list = new ArrayList<>();
        list.add(image0);
        list.add(image1);
        list.add(image2);
        list.add(image3);
        list.add(image4);
        return list;
    }
}
