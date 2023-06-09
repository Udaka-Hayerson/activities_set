package com.example.activityexample.from_the_first_to_the_fourth_lesson.heap_of_activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.example.activityexample.R;

public class MainActivity extends Activity {
    private TextView text;
    private TextView text_2;
    private Button btn;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        text = (TextView) findViewById(R.id.textView);
        text_2 = (TextView) findViewById(R.id.textView5);
        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String its_works = getResources().getString(R.string.its_works);
                text_2.setText(its_works);
                text_2.setTextColor(getResources().getColor(R.color.purple_200));
                text_2.setBackgroundColor(getResources().getColor(R.color.black));
            }
        });

    }

    public void click(View view){
        String hi_bro = getResources().getString(R.string.hi_bro);
        text.setText(hi_bro);
        text.setTextColor(getResources().getColor(R.color.purple_200));
        text.setBackgroundColor(getResources().getColor(R.color.black));

    }
}
