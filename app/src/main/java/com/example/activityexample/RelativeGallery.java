package com.example.activityexample;

import android.app.Activity;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;

import java.util.ArrayList;

public class RelativeGallery extends Activity {
    RelativeLayout relativeLayout;
    ImageView image_view;
    Image image;
    int img0 = R.drawable.img_0;
    int img1 = R.drawable.img_1;
    int img2 = R.drawable.img_2;
    int img3 = R.drawable.img_3;
    int img4 = R.drawable.img_4;
    int r_click_count = 0;
    int l_click_count = 0;
    ArrayList<Image> relative_list;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative_gallery);
        RelativeLayout relativeLayout =(RelativeLayout) findViewById(R.id.father);
        image_view = new ImageView(this);
        image_view.setImageResource(img0);
        image_view.setLayoutParams(new ActionBar.LayoutParams(ActionBar.LayoutParams.MATCH_PARENT, ActionBar.LayoutParams.WRAP_CONTENT));
        image_view.setAdjustViewBounds(true);
        image_view.setScaleType(ImageView.ScaleType.FIT_XY);
        relativeLayout.addView(image_view);
    }

    public void visibleNext(View view) {
        if(r_click_count == 0){
            image_view.setImageResource(img1);
            l_click_count = 4;
        } else if(r_click_count == 1){
            image_view.setImageResource(img2);
            l_click_count = 3;
        } else if(r_click_count == 2){
            image_view.setImageResource(img3);
            l_click_count = 2;
        } else if(r_click_count == 3){
            image_view.setImageResource(img4);
            l_click_count = 1;
        }
        if(r_click_count == 4){
            image_view.setImageResource(img0);
            r_click_count = 0;
            l_click_count = 0;
            return;
        }
        r_click_count++;
    }
    public void visiblePrevios(View view) {
        if(l_click_count == 0){
            image_view.setImageResource(img4);
            r_click_count = 4;
        } else if(l_click_count == 1){
            image_view.setImageResource(img3);
            r_click_count = 3;
        } else if(l_click_count == 2){
            image_view.setImageResource(img2);
            r_click_count = 2;
        } else if(l_click_count == 3){
            image_view.setImageResource(img1);
            r_click_count = 1;
        }
        if(l_click_count == 4){
            image_view.setImageResource(img0);
            l_click_count = 0;
            r_click_count = 0;
            return;
        }
        l_click_count++;
    }
}
