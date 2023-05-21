package com.example.activityexample.list_objects.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.activityexample.R;
import com.example.activityexample.list_objects.pojo.Car;
import java.util.List;

public class Adapter extends BaseAdapter {
    private List<Car> cars;
    private LayoutInflater layoutInflater;

    public Adapter(List<Car> cars, Context context) {
        this.cars = cars;
        this.layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return cars.size();
    }

    @Override
    public Object getItem(int position) {
        return cars.get(position);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if(view == null){
            view = layoutInflater.inflate(R.layout.car_item_layout, parent, false);
        }
        Car car = (Car) getItem(position);
        TextView carName = (TextView) view.findViewById(R.id.car_name);
        TextView carSpeed = (TextView) view.findViewById(R.id.car_speed);
        TextView carEngine = (TextView) view.findViewById(R.id.car_engine);
        carName.setText("Car Model: " + car.getModel());
        carSpeed.setText("Car Speed: " + car.getMaxSpeed());
        carEngine.setText("Car Engine: " + car.getEngineValue());
        return view;
    }
}
