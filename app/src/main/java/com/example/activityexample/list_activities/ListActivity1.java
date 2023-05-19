package com.example.activityexample.list_activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.annotation.Nullable;
import com.example.activityexample.R;

public class ListActivity1 extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_layout);

        ListView listView = (ListView) findViewById(R.id.list_view);
        String []cars = {"Porsche", "Maseratti", "Ferrari", "Lamborghini", "Mersedes-Benz", "BMW"};
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, cars);
        listView.setAdapter(arrayAdapter);

    }

}
