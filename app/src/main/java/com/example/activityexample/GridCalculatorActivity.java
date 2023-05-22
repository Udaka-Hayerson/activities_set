package com.example.activityexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;

import java.util.Arrays;

public class GridCalculatorActivity extends Activity {
    private TextView text;
    public String first_operand = "";
    public String second_operand = "";
    public int operation = 0;
    public String buffer = "";
    int result = 0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_calculator_activity);
        text = (TextView) findViewById(R.id.enter_field);
        buffer = text.getText().toString();

    }

    public void equalS(View v){
        second_operand = buffer.substring((first_operand).length()+1);
        switch (operation){
            case 0: {
                result = Integer.parseInt(first_operand) * Integer.parseInt(second_operand);
                text.setText(String.valueOf(result));
                break;
            }
            case 1: {
                result = Integer.parseInt(first_operand) / Integer.parseInt(second_operand);
                text.setText(String.valueOf(result));
                break;

            }
            case 2: {
                result = Integer.parseInt(first_operand) + Integer.parseInt(second_operand);
                text.setText(String.valueOf(result));
                break;
            }
            case 3: {
                result = Integer.parseInt(first_operand) - Integer.parseInt(second_operand);
                text.setText(String.valueOf(result));
                break;
            }

        }
        buffering();

    }

    public void buffering(){
        this.buffer = text.getText().toString();
    }

    private void extractedO(String str, int operand) {
        this.operation = operand;
        first_operand = text.getText().toString();
//        f_oper_length = text.getText().toString().length();
        text.setText(buffer + str);
        buffering();
    }

    private void extractedN(String str){
        text.setText(buffer + str);
        buffering();
    }

    public void deletE(View v){
        if(buffer.equals("")){
            text.setText("wrong");
        } else {
            text.setText(text.getText().toString().substring(0, buffer.length()-1));
        }
        buffering();
    }
    public void mul(View v){
        extractedO("*", 0);
    }
    public void div(View v){
        extractedO("/", 1);
    }
    public void add(View v){
        extractedO("+", 2);
    }
    public void sub(View v){
        extractedO("-", 3);
    }


    public void zero(View v){
        extractedN("0");
    }
    public void one(View v){
        extractedN("1");
    }
    public void two(View v){
        extractedN("2");
    }
    public void three(View v){
        extractedN("3");
    }
    public void four(View v){
        extractedN("4");
    }
    public void five(View v){
        extractedN("5");
    }
    public void six(View v){
        extractedN("6");
    }
    public void seven(View v){
        extractedN("7");
    }
    public void eight(View v){
        extractedN("8");
    }
    public void nine(View v){
        extractedN("9");
    }

}
//lambda String result =
// (EditText.equals(login) && EditText.equals(password))
// ? login +" and "+ password + " correct"
// : login +" and "+ password + "not correct"