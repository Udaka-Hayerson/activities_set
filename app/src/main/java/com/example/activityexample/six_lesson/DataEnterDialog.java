package com.example.activityexample.six_lesson;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialogFragment;

public class DataEnterDialog extends AppCompatDialogFragment {
    private EditText edit_First_Name;
    private EditText edit_Last_Name;
    private EditText edit_Phone_Number;
    DataEnterDialogListener dialoglistener ;
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder dialog_builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.layout_dialog, null);
        edit_First_Name = view.findViewById(R.id.editFirstName);
        edit_Last_Name = view.findViewById(R.id.editLastName);
        edit_Phone_Number = view.findViewById(R.id.editPhoneNumber);
        dialog_builder.setView(view)
                .setTitle("add new contact")
                .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        return;
                    }
                })
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String first_name = edit_First_Name.getText().toString();
                        String last_name = edit_First_Name.getText().toString();
                        String phone_number = edit_Phone_Number.getText().toString();

                        dialoglistener.applyTexts(first_name, last_name, phone_number);
                    }
                });
        return dialog_builder.create();
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        try {
            dialoglistener = (DataEnterDialogListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString() +
                    "must implement DataEnterDialogListener");
        }
    }

    public  interface DataEnterDialogListener{
        void applyTexts(String first_name, String last_name, String phone_number);
    }
}
