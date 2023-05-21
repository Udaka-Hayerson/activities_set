package com.example.activityexample.list_homework.activity;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.activityexample.R;
import com.example.activityexample.list_homework.adapter.BirdAdapter;
import com.example.activityexample.list_homework.pojo.Bird;
import java.util.ArrayList;
import java.util.List;

public class ListBirdActivity extends Activity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_layout);
        ListView listView = (ListView) findViewById(R.id.list_view);
        List<Bird> items = getItems();
        BirdAdapter adapter = new BirdAdapter(items, this);
        listView.setAdapter(adapter);

    }
    private List<Bird> getItems(){
        List<Bird> items = new ArrayList<>();
        items.add(new Bird("B", 5, 33.3));
        items.add(new Bird("I", 6, 34.4));
        items.add(new Bird("R", 7, 35.5));
        items.add(new Bird("D", 8, 36.6));
        items.add(new Bird("D", 9, 37.7));
        items.add(new Bird("I", 10, 38.8));
        items.add(new Bird("R", 11, 39.9));
        items.add(new Bird("T", 12, 40.0));
        return items;
    }
}
