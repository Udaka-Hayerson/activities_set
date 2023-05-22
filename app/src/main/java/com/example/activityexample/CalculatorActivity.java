package com.example.activityexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class CalculatorActivity extends Activity {
    EditText editTextOne;
    EditText editTextTwo;
    TextView result;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        editTextOne = (EditText) findViewById(R.id.editOne);
        editTextTwo = (EditText) findViewById(R.id.editTwo);
        result = (TextView) findViewById(R.id.result);
    }
    public void mul(View view){
        result.setText(String.valueOf(parser(editTextOne) * parser(editTextTwo)));
    }
    public void div(View view){
        result.setText(String.valueOf(parser(editTextOne) / parser(editTextTwo)));
    }
    public void add(View view){
        result.setText(String.valueOf(parser(editTextOne) + parser(editTextTwo)));
    }
    public void sub(View view){
        result.setText(String.valueOf(parser(editTextOne) - parser(editTextTwo)));
    }
    public double parser(EditText edit){
        return Double.parseDouble(String.valueOf(edit.getText()));
    }

//    public boolean checkUp(){
//        if(editTextOne.getText().equals(""))return false;
//        if(editTextTwo.getText().equals(""))return false;
//        return true;
//    }


}
