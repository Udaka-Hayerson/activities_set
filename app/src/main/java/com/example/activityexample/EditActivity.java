package com.example.activityexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class EditActivity extends Activity {
    public int count = 0;
    TextView textView;
    EditText editText;
    Button btn;
    Button clear;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_activity);
        editText = (EditText) findViewById(R.id.editTextTextPersonName);
        textView = (TextView) findViewById(R.id.textView3);
        btn = (Button) findViewById(R.id.hello);
        clear = (Button) findViewById(R.id.clear);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(new StringBuilder().append("Hello ").append(editText.getText()).toString());
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("");
                if(count%2 > 0){
                    textView.setText(new StringBuilder().append("Hello ").append(editText.getText()).toString());
                    textView.setTextColor(getResources().getColor(R.color.purple_200));
                    textView.setBackgroundColor(getResources().getColor(R.color.black));
                }
                count++;
            }
        });
    }
}
