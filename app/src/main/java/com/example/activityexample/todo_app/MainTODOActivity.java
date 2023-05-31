package com.example.activityexample.todo_app;


import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.activityexample.R;

import java.util.ArrayList;
import java.util.List;

public class MainTODOActivity extends AppCompatActivity {
    static int todo_count = 0;
    static int sub_todo_count = 0;
    RecyclerView TODORecycler;
    TODOAdapter todoAdapter;
    static List<ClassTODO> TODOList = new ArrayList<>();
    static List<SubTODO> subTODOList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_todo);
        TODORecycler = findViewById(R.id.recycler_todo);
        LinearLayoutManager manager = new LinearLayoutManager(MainTODOActivity.this);
        todoAdapter = new TODOAdapter(listBuilder());
        TODORecycler.setAdapter(todoAdapter);
        TODORecycler.setLayoutManager(manager);
        TODORecycler.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(@NonNull RecyclerView recyclerVertical, int newState) {
                super.onScrollStateChanged(recyclerVertical, newState);
                Toast.makeText(MainTODOActivity.this, "TODO Scroll", Toast.LENGTH_SHORT).show();
            }
        });

    }
//    private static List<ClassTODO> addNewTODO(int id, String title, String description ){
//        List<ClassTODO> todo_list = MainTODOActivity.TODOList;
//        List<SubTODO> sub_todo_list = addNewSubTODO();
//        todo_list.set(todo_count, new ClassTODO(id, title, description,sub_todo_list ));
//        return todo_list;
//    }
//    private static List<SubTODO> addNewSubTODO(){
//        List<SubTODO> sub_todo_list = new ArrayList<>();//int id, String title, String description
//        return sub_todo_list;
//    }

    private static List<ClassTODO> listBuilder() {
        SubTODO sub_0 = new SubTODO(0, "SubTODO_0", "do TODO - be HAPPY");
        SubTODO sub_1 = new SubTODO(1, "SubTODO_1", "do TODO - be HAPPY");
        SubTODO sub_2 = new SubTODO(2, "SubTODO_2", "do TODO - be HAPPY");
        SubTODO sub_3 = new SubTODO(3, "SubTODO_3", "do TODO - be HAPPY");
        SubTODO sub_4 = new SubTODO(4, "SubTODO_4", "do TODO - be HAPPY");
        SubTODO sub_5 = new SubTODO(5, "SubTODO_5", "do TODO - be HAPPY");
        SubTODO sub_6 = new SubTODO(6, "SubTODO_6", "do TODO - be HAPPY");
        SubTODO sub_7 = new SubTODO(7, "SubTODO_7", "do TODO - be HAPPY");
        SubTODO sub_8 = new SubTODO(8, "SubTODO_8", "do TODO - be HAPPY");
        SubTODO sub_9 = new SubTODO(9, "SubTODO_9", "do TODO - be HAPPY");
        subTODOList.add(sub_0);
        subTODOList.add(sub_1);
        subTODOList.add(sub_2);
        subTODOList.add(sub_3);
        subTODOList.add(sub_4);
        subTODOList.add(sub_5);
        subTODOList.add(sub_6);
        subTODOList.add(sub_7);
        subTODOList.add(sub_8);
        subTODOList.add(sub_9);
        ClassTODO todo_0 = new ClassTODO(0, "TODO_0", "do TODO - be HAPPY", subTODOList);
        ClassTODO todo_1 = new ClassTODO(1, "TODO_1", "do TODO - be HAPPY", subTODOList);
        ClassTODO todo_2 = new ClassTODO(2, "TODO_2", "do TODO - be HAPPY", subTODOList);
        ClassTODO todo_3 = new ClassTODO(3, "TODO_3", "do TODO - be HAPPY", subTODOList);
        ClassTODO todo_4 = new ClassTODO(4, "TODO_4", "do TODO - be HAPPY", subTODOList);
        ClassTODO todo_5 = new ClassTODO(5, "TODO_5", "do TODO - be HAPPY", subTODOList);
        ClassTODO todo_6 = new ClassTODO(6, "TODO_6", "do TODO - be HAPPY", subTODOList);
        ClassTODO todo_7 = new ClassTODO(7, "TODO_7", "do TODO - be HAPPY", subTODOList);
        ClassTODO todo_8 = new ClassTODO(8, "TODO_8", "do TODO - be HAPPY", subTODOList);
        ClassTODO todo_9 = new ClassTODO(9, "TODO_9", "do TODO - be HAPPY", subTODOList);
        TODOList.add(todo_0);
        TODOList.add(todo_1);
        TODOList.add(todo_2);
        TODOList.add(todo_3);
        TODOList.add(todo_4);
        TODOList.add(todo_5);
        TODOList.add(todo_6);
        TODOList.add(todo_7);
        TODOList.add(todo_8);
        TODOList.add(todo_9);
        return TODOList;
    }
}








