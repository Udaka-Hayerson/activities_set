package com.example.activityexample.from_the_first_to_the_fourth_lesson.todo_app;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.activityexample.R;

import java.util.List;

public class SubTODOAdapter extends RecyclerView.Adapter<SubTODOAdapter.SubTODOViewHolder>{
    List<SubTODO> sub_todos;
    public SubTODOAdapter(List<SubTODO> sub_todos) {
        this.sub_todos = sub_todos;
    }
    @NonNull
    @Override
    public SubTODOViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View subTODOItems = LayoutInflater.from(parent.getContext()).inflate(R.layout.sub_todo_item, parent, false);
        return new SubTODOViewHolder(subTODOItems);
    }

    @Override
    public void onBindViewHolder(@NonNull SubTODOViewHolder holder, int position) {
        SubTODO subTODO = sub_todos.get(position);
        holder.subTodoTitle.setText(subTODO.getSub_title());
        holder.descriptionTodo.setText(subTODO.getSub_description());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(holder.itemView.getContext(),"SubTODOAdapter - \n А А МОГЛА БИ БУТИ ВАША РЕКЛАМА", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return sub_todos.size();
    }

    public static final class SubTODOViewHolder extends RecyclerView.ViewHolder{
        TextView subTodoTitle, descriptionTodo;
        public SubTODOViewHolder(@NonNull View itemView) {
            super(itemView);
            subTodoTitle = itemView.findViewById(R.id.sub_todo_title);
            descriptionTodo = itemView.findViewById(R.id.description_sub_todo);
        }
    }
}
