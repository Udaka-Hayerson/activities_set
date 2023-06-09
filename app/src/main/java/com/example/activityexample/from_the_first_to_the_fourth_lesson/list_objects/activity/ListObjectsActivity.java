package com.example.activityexample.from_the_first_to_the_fourth_lesson.list_objects.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import androidx.annotation.Nullable;
import com.example.activityexample.R;
import com.example.activityexample.from_the_first_to_the_fourth_lesson.list_objects.adapter.Adapter;
import com.example.activityexample.from_the_first_to_the_fourth_lesson.list_objects.pojo.Car;

import java.util.ArrayList;
import java.util.List;

public class ListObjectsActivity extends Activity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_layout);
        ListView listView = (ListView) findViewById(R.id.list_view);
        List<Car> items = items();
        Adapter adapter = new Adapter(items, this);
        listView.setAdapter(adapter);
    }

    private List<Car> items(){
        List<Car> items = new ArrayList<>();
        //{"Porsche", "Maseratti", "Ferrari", "Lamborghini", "Mersedes-Benz", "BMW"};
        items.add(new Car("Porsche", 310, 3.6));
        items.add(new Car("Maseratti", 285, 4.6));
        items.add(new Car("Ferrari", 325, 4.5));
        items.add(new Car("Lamborghini", 325, 5.2));
        items.add(new Car("Mersedes-Benz", 300, 6.3));
        items.add(new Car("BMW", 280, 4.2));
        items.add(new Car("Audi", 250, 3.2));
        return items;
    }
}
