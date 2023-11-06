package com.example.activityexample.six_lesson;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class ContactAdapter extends BaseAdapter {
    private List<Contact> contacts;
    private LayoutInflater layoutInflater;

    public ContactAdapter(List<Contact> contacts, LayoutInflater layoutInflater) {
        this.contacts = contacts;
        this.layoutInflater = layoutInflater;
    }

    @Override
    public int getCount() {
        return contacts.size();
    }

    @Override
    public Object getItem(int position) {
        return contacts.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if(view == null) {
            view = layoutInflater.inflate(R.layout.contact_item, parent, false);
        }
        Contact contact = (Contact) getItem(position);

        TextView contactFirstName = (TextView) view.findViewById(R.id.firstName);
        TextView contactLastName = (TextView) view.findViewById(R.id.lastName);
        TextView contactNumber = (TextView) view.findViewById(R.id.phoneNumber);

        contactFirstName.setText("First name: " + contact.getFirst_name());
        contactLastName.setText("Last name: " + contact.getLast_name());
        contactNumber.setText("Phone Number: " + contact.getPhoneNumber());

        return view;
    }
}
