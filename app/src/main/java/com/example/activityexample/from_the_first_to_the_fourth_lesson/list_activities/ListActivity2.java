package com.example.activityexample.from_the_first_to_the_fourth_lesson.list_activities;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.annotation.Nullable;
import com.example.activityexample.R;
import java.util.ArrayList;
import java.util.List;

public class ListActivity2 extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_layout);

        ListView listView = (ListView) findViewById(R.id.list_view);
        List<String> items = getItems();
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items);
        listView.setAdapter(arrayAdapter);

    }

    public List getItems(){
        List<String> items = new ArrayList<>();
        items.add("Porsche");
        items.add("Maseratti");
        items.add("Ferrari");
        items.add("Lamborghini");
        items.add("Mersedes-Benz");
        items.add("BMW");
        return items;
    }
}
