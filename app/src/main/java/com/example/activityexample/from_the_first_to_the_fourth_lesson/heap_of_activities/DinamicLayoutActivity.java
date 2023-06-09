package com.example.activityexample.from_the_first_to_the_fourth_lesson.heap_of_activities;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.example.activityexample.R;

public class DinamicLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView label = new TextView(this);
        label.setText("hell ouuuu");
        label.setTextSize(40);

        label.setGravity(Gravity.CENTER_HORIZONTAL);

        ImageView pic = new ImageView(this);

        pic.setImageResource(R.drawable.img_0);

        pic.setLayoutParams(new ActionBar.LayoutParams(ActionBar.LayoutParams.WRAP_CONTENT, ActionBar.LayoutParams.WRAP_CONTENT));
        pic.setAdjustViewBounds(true);

        pic.setScaleType(ImageView.ScaleType.FIT_XY);

        pic.setMaxHeight(850);

        pic.setMaxWidth(850);

        LinearLayout ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);

        //@Deprecated
        ll.setLayoutParams(new ActionBar.LayoutParams(ActionBar.LayoutParams.FILL_PARENT, ActionBar.LayoutParams.FILL_PARENT));
        ll.setGravity(Gravity.CENTER);
        ll.addView(label);
        ll.addView(pic);
        setContentView(ll);

    }
}