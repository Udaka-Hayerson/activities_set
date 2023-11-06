package com.example.activityexample.six_lesson;

import android.os.Bundle;
import android.view.ActionMode;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class PhoneBookActivity extends AppCompatActivity implements DataEnterDialog.DataEnterDialogListener {

    List<Contact> contacts;
    ContactAdapter contactAdapter;
    LayoutInflater layoutInflater;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_book);

        ListView listView = (ListView) findViewById(R.id.list);
        contacts = new ArrayList<>();
        contacts.add(new Contact("Mykola", "Pikula", "666666"));
        contacts.add(new Contact("Andrew", "Slabous", "7777777"));
        contacts.add(new Contact("Oleg", "Mikhalenko", "55555"));
        layoutInflater = getLayoutInflater();
        contactAdapter = new ContactAdapter(contacts, layoutInflater);
        listView.setAdapter(contactAdapter);
        listView.setChoiceMode(listView.CHOICE_MODE_MULTIPLE_MODAL);
        listView.setMultiChoiceModeListener(new AbsListView.MultiChoiceModeListener() {
            private List<Contact> current_data = new ArrayList<>(); //list <string>
            @Override
            public void onItemCheckedStateChanged(ActionMode mode, int position, long id, boolean checked) {
                Contact contact = (Contact) contactAdapter.getItem(position);
                if(checked)
                    current_data.add(contact);
                else
                    current_data.remove(contact);
            }

            @Override
            public boolean onCreateActionMode(ActionMode mode, Menu menu) {
                mode.getMenuInflater().inflate(R.menu.menu, menu);
                return true;
            }

            @Override
            public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
                return false;
            }

            @Override
            public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
                for(Contact value : current_data){
                    contacts.remove(value);
                    contactAdapter.notifyDataSetChanged();
                }
                current_data.clear();
                mode.finish();
                return false;
            }

            @Override
            public void onDestroyActionMode(ActionMode mode) {

            }
        });

    }
    public void openCreateDialog(View v) {
        DataEnterDialog dialog = new DataEnterDialog();
        dialog.show(getSupportFragmentManager(), "Data Enter Dialog");
    }

    @Override
    public void applyTexts(String first_name, String last_name, String phone_number) {
        contacts.add(new Contact(first_name, last_name, phone_number));
        contactAdapter.notifyDataSetChanged();

    }
}