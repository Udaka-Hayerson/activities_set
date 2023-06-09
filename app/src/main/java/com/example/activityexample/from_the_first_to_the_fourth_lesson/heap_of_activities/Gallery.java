package com.example.activityexample.from_the_first_to_the_fourth_lesson.heap_of_activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;

import com.example.activityexample.R;

import java.util.ArrayList;

public class Gallery extends Activity {
    ImageView image0;
    ImageView image1;
    ImageView image2;
    ImageView image3;
    ImageView image4;
    ArrayList<ImageView> image_list;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery); //◀️ ▶️ ⬅️ ➡️
        image4 = (ImageView) findViewById(R.id.image_4);
        image3 = (ImageView) findViewById(R.id.image_3);
        image0 = (ImageView) findViewById(R.id.image_0);
        image1 = (ImageView) findViewById(R.id.image_1);
        image2 = (ImageView) findViewById(R.id.image_2);
        image_list = fill();
        indicator();
    }
    public ArrayList<ImageView> fill() {
        ArrayList<ImageView> list = new ArrayList<>();
        list.add(image3); list.add(image4); list.add(image0); list.add(image1); list.add(image2);
        return list;
    }
    public void indicator(){
        for (int i = 0; i < image_list.size()-1; i++) {
            if(i == 2) image_list.get(i).setVisibility(View.VISIBLE);
            else image_list.get(i).setVisibility(View.INVISIBLE);
        }
    }
    public void visibleLeftImageButton(View view){
        image_list.add(0, image_list.get(image_list.size()-1));
        image_list.remove(image_list.size()-1);
        indicator();
    }
    public void visibleRightImageButton(View view){
        image_list.add(image_list.get(0));
        image_list.remove(0);
        indicator();
    }
}

















