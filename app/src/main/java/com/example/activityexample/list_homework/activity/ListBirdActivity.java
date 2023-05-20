package com.example.activityexample.list_homework.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;

import com.example.activityexample.R;
import com.example.activityexample.list_homework.adapter.BirdAdapter;
import com.example.activityexample.list_homework.pojo.Bird;
import java.util.ArrayList;
import java.util.List;

public class ListBirdActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_layout);
        ListView listView = (ListView) findViewById(R.id.list_view);
        List<Bird> items = items();
        BirdAdapter adapter = new BirdAdapter(items, this);
        listView.setAdapter(adapter);

    }
    private List<Bird> items(){
        List<Bird> items = new ArrayList<>();
        items.add(new Bird("B", 5, 33));
        items.add(new Bird("I", 6, 34));
        items.add(new Bird("R", 7, 35));
        items.add(new Bird("D", 8, 36));
        return items;
    }
}
