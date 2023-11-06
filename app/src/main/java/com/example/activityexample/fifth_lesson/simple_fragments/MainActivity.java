package com.example.activityexample.fifth_lesson.simple_fragments;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

import com.example.activityexample.R;

public class MainActivity extends Activity implements View.OnClickListener {

    android.app.Fragment fragment0;
    android.app.Fragment fragment1;
    TextView textViewV;
    EditText login;
    EditText password;
    String realLogin;
    String realPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex_001_main_layout);
        realLogin = "log";
        realPassword = "pass48";
        fragment0 =  getFragmentManager().findFragmentById(R.id.form_fragment);
        fragment1 =  getFragmentManager().findFragmentById(R.id.answer_fragment);
        login = (EditText)fragment0.getView().findViewById(R.id.login);
        password = (EditText)fragment0.getView().findViewById(R.id.password);
        textViewV = (TextView)fragment1.getView().findViewById(R.id.textViewVW);
        Button btn = (Button) fragment1.getView().findViewById(R.id.btn_answer);
        btn.setOnClickListener(this);
    }
    @Override
    protected void onResume() {
        super.onResume();
//        fragment0 =  getFragmentManager().findFragmentById(R.id.form_fragment);
//        fragment1 =  getFragmentManager().findFragmentById(R.id.answer_fragment);
//        login = (EditText)fragment0.getView().findViewById(R.id.login);
//        password = (EditText)fragment0.getView().findViewById(R.id.password);
//        textViewV = (TextView)fragment1.getView().findViewById(R.id.textViewVW);
//        Button btn = (Button) fragment1.getView().findViewById(R.id.btn_answer);
//        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String loginTxt = login.getText().toString();
        String passwordTxt = password.getText().toString();
        String text = (loginTxt.equals(realLogin) && passwordTxt.equals(realPassword)) ? loginTxt + " you entred succsessful" : "incorrect password";
        textViewV.setText(text);
    }


}