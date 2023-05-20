package com.example.activityexample.list_homework.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.activityexample.R;
import com.example.activityexample.list_homework.pojo.Bird;
import java.util.List;

public class BirdAdapter extends BaseAdapter {
    private List<Bird> birds;
    private LayoutInflater layoutInflater;

    public BirdAdapter(List<Bird> bird, Context context) {
        this.birds = birds;
        this.layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return birds.size();
    }

    @Override
    public Object getItem(int i) {
        return birds.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null){
            view = layoutInflater.inflate(R.layout.bird_item_layout, parent, false);
        }
        Bird bird = (Bird) getItem(i);
        TextView bird_name = (TextView) view.findViewById(R.id.bird_name);
        TextView bird_age = (TextView) view.findViewById(R.id.bird_age);
        TextView bird_height = (TextView) view.findViewById(R.id.bird_height);
        bird_name.setText("Bird name: " + bird.getName());
        bird_age.setText("Bird age: " + bird.getAge());
        bird_height.setText("Bird : " + bird.getHeight());
        return view;
    }
}
























