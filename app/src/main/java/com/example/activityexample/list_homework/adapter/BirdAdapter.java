package com.example.activityexample.list_homework.adapter;

import android.content.Context;
import android.graphics.Color;
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

    public BirdAdapter(List<Bird> birds, Context context) {
        this.birds = birds;
        this.layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return birds.size();
    }

    @Override
    public Object getItem(int position) {
        return birds.get(position);
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
        TextView birdName = (TextView) view.findViewById(R.id.bird_name);
        TextView birdAge = (TextView) view.findViewById(R.id.bird_age);
        TextView birdHeight = (TextView) view.findViewById(R.id.bird_height);
        birdName.setText("Bird name: " + bird.getName());
        birdName.setBackgroundColor(Color.parseColor("#ECAEFD"));
        birdAge.setText("Bird age: " + bird.getAge());
        birdAge.setBackgroundColor(Color.parseColor("#FFBB86FC"));
        birdHeight.setText("Bird : " + bird.getHeight());
        birdHeight.setBackgroundColor(Color.parseColor("#B44EDF"));
        return view;
    }
}
