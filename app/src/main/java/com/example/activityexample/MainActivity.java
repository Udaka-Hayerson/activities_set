package com.example.activityexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class MainActivity extends Activity {
    private TextView text;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        text = (TextView) findViewById(R.id.textView);

    }

    public void click(View view){
        text.setText("HELLO BRO");
        text.setTextColor(getResources().getColor(R.color.purple_200));
        text.setBackgroundColor(getResources().getColor(R.color.black));

    }
}
