package com.example.activityexample;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;

public class HomeworkEditActivity extends Activity {
    public int count = 0;
    private ConstraintLayout layout_out;
    private TextView textView;
    private EditText name, login, password;
    private Button btn;
    private ImageView real_image;
    private ImageView virtual_image;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homework_edit_activity);
        layout_out = (ConstraintLayout) findViewById(R.id.layout_out);
        name = (EditText) findViewById(R.id.editName);
        login = (EditText) findViewById(R.id.editLogin);
        password = (EditText) findViewById(R.id.editPassword);
        textView = (TextView) findViewById(R.id.result);
        btn = (Button) findViewById(R.id.enter);
        real_image = (ImageView) findViewById(R.id.real_image);
        virtual_image = (ImageView) findViewById(R.id.virtual_image);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("");
                textView.setBackgroundColor(getResources().getColor(R.color.teal_700));
                if(count%2 == 0){
                    textView.setText(new StringBuilder()
                            .append("Your name/login/password ").append(name.getText().toString())
                            .append("/").append(login.getText().toString()).append("/")
                            .append(password.getText().toString()).toString());
                    textView.setTextColor(getResources().getColor(R.color.purple_200));
                    textView.setBackgroundColor(getResources().getColor(R.color.black));
                }
                count++;
            }
        });
    }

    public void changeBackgroun(View view){
        Drawable background = layout_out.getBackground();
        int color = getResources().getColor(R.color.white);
        if(background.getClass() == ColorDrawable.class)
            color = ((ColorDrawable) background).getColor();
        if(color != getResources().getColor(R.color.purple_300)){
            layout_out.setBackgroundColor(getResources().getColor(R.color.purple_300));
        } else {
            layout_out.setBackgroundColor(getResources().getColor(R.color.white));
        }
    }

    public void changeImage(View view){
        textView.setText("");
        Drawable drawable_r = real_image.getDrawable();
        Drawable drawable_v = virtual_image.getDrawable();
        String r_tag = (String) real_image.getTag();
        String v_tag = (String) virtual_image.getTag();
        virtual_image.setTag(r_tag);
        virtual_image.setImageDrawable(drawable_r);
        real_image.setTag(v_tag);
        real_image.setImageDrawable(drawable_v);
    }

    public void imageClick(View view){
        String current_tag = (String) real_image.getTag();
        textView.setText(current_tag);
    }

}




