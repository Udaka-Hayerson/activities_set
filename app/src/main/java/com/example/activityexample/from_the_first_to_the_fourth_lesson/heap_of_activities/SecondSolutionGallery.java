package com.example.activityexample.from_the_first_to_the_fourth_lesson.heap_of_activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;

import com.example.activityexample.R;

import java.util.ArrayList;

public class SecondSolutionGallery extends Activity {
    ImageView image0;
    ImageView image1;
    ImageView image2;
    ImageView image3;
    ImageView image4;
    ImageView buffer;
    ArrayList<ImageView> image_list_r;
    ArrayList<ImageView> image_list_l;
    int r_click_count = 0;
    int l_click_count = 0;

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
        image_list_r = fill(true);
        image_list_l = fill(false);

    }
    public void visibleRightImage(View view){
        if(!(r_click_count < image_list_r.size()-1)){
            image_list_r = fill(true);
            r_click_count = 0;
        }
        universelRightVis();
    }

    public void visibleLeftImage(View view){
        if(!(l_click_count < image_list_l.size()-1)) {
            image_list_l = fill(false);
            l_click_count = 0;
        }

        universelLeftVis();
    }

    public void universelRightVis() {
        image_list_r.get(r_click_count).setVisibility(View.INVISIBLE);
        image_list_r.get(r_click_count + 1).setVisibility(View.VISIBLE);

        buffer = image_list_l.get(r_click_count);
        image_list_l.set(r_click_count, image_list_l.get(image_list_l.size()-1));
        image_list_l.set(image_list_l.size()-1, buffer);

        r_click_count++;
        l_click_count = 0;
    }

    public void universelLeftVis() {
        image_list_l.get(l_click_count).setVisibility(View.INVISIBLE);
        image_list_l.get(l_click_count + 1).setVisibility(View.VISIBLE);

        buffer = image_list_r.get(l_click_count);
        image_list_r.set(l_click_count, image_list_r.get(image_list_r.size()-1));
        image_list_r.set(image_list_r.size()-1, buffer);

        l_click_count++;
        r_click_count = 0;
    }
    private ArrayList<ImageView> fill(boolean b) {
        ArrayList<ImageView> list = new ArrayList<>();
        if (b) {
            for (int i = 0; i < list.size(); i++) {
            }
            list.add(image0);
            list.add(image1);
            list.add(image2);
            list.add(image3);
            list.add(image4);
        } else {
            list.add(image0);
            list.add(image4);
            list.add(image3);
            list.add(image2);
            list.add(image1);
        }
        return list;
    }
}
