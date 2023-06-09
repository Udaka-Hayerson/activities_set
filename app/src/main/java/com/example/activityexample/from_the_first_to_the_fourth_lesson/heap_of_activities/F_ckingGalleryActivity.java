package com.example.activityexample.from_the_first_to_the_fourth_lesson.heap_of_activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.Nullable;

import com.example.activityexample.R;

import java.util.ArrayList;

public class F_ckingGalleryActivity extends Activity {
    ImageView image0;
    ImageView image1;
    ImageView image2;
    ImageView image3;
    ImageView image4;
    ArrayList<ImageView> image_list;
    int click_count = 0;
    int click_left = 0;
    int click_right = 0;
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
        image_list = fill();

    }

    public ArrayList<ImageView> fill() {
        ArrayList<ImageView> list = new ArrayList<>();
        list.add(image1);
        list.add(image2);
        list.add(image3);
        list.add(image4);
        list.add(image0); // start
        list.add(image1);
        list.add(image2);
        list.add(image3);
        list.add(image4);
        return list;
    }

    public void visibleRightImage(View view){
        click_right++;
        if(click_count >= 4){
            lastRightClick();
        } else if(click_left==0){
            usualRightClick();
        } else {
            click_count+=click_left;
            usualRightClick();
        }
    }

    public void visibleLeftImage(View view){
        click_left++;
        if(click_count >= 4) {
            lastLeftClick();
        } else if(click_right==0){
            usualLeftClick();
        } else{
            click_count+=click_right;
            usualLeftClick();
        }
    }

    public void usualRightClick() {
        image_list.get(4+click_count).setVisibility(View.INVISIBLE);
        image_list.get(4+click_count + 1).setVisibility(View.VISIBLE);
        click_count++;

    }

    public void usualLeftClick() {
        image_list.get(4-click_count).setVisibility(View.INVISIBLE);
        image_list.get(4-click_count-1).setVisibility(View.VISIBLE);
        click_count++;

    }

    public void lastRightClick() {
        image_list.get(image_list.size()-1).setVisibility(View.INVISIBLE);
        image_list.get(4).setVisibility(View.VISIBLE);
        zeroing();
    }
    public void lastLeftClick() {
        image_list.get(0).setVisibility(View.INVISIBLE);
        image_list.get(4).setVisibility(View.VISIBLE);
        zeroing();
    }

    public void zeroing() {
        click_count = 0;
        click_right = 0;
        click_left = 0;
    }
}