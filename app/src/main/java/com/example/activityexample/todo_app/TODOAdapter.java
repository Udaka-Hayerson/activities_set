package com.example.activityexample.todo_app;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.activityexample.R;

import java.util.List;

public class TODOAdapter extends RecyclerView.Adapter<TODOAdapter.TODOViewHolder> {

    RecyclerView.RecycledViewPool viewPool = new RecyclerView.RecycledViewPool();
    List<ClassTODO> todos;

    public TODOAdapter(List<ClassTODO> todos) {
        this.todos = todos;
    }

    @NonNull
    @Override
    public TODOViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View TODOItems = LayoutInflater.from(parent.getContext()).inflate(R.layout.todo_item, parent, false);
        return new TODOViewHolder(TODOItems);
    }

    @SuppressLint("RecyclerView")
    @Override
    public void onBindViewHolder(@NonNull TODOViewHolder holder, int i) {
        ClassTODO item = todos.get(i);
        holder.todoTitle.setText(todos.get(i).getTitle());
        LinearLayoutManager layoutManager = new LinearLayoutManager(
                holder.recycleerSubTodo.getContext(), LinearLayoutManager.HORIZONTAL, false);

        layoutManager.setInitialPrefetchItemCount(item.getSubTODOlist().size());//edit
        SubTODOAdapter subTODOAdapter = new SubTODOAdapter(item.getSubTODOlist());
        holder.recycleerSubTodo.setLayoutManager(layoutManager);
        holder.recycleerSubTodo.setAdapter(subTODOAdapter);
        holder.recycleerSubTodo.setRecycledViewPool(viewPool);
        holder.recycleerSubTodo.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(@NonNull RecyclerView recyclerHorizontal, int newState) {
                super.onScrollStateChanged(recyclerHorizontal, newState);
                Toast.makeText(holder.itemView.getContext(), "SubTODO Scroll", Toast.LENGTH_SHORT).show();
            }
        });
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(holder.itemView.getContext(),"TODOAdapter - \n А МОГЛА БИ БУТИ ВАША РЕКЛАМА", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return todos.size();
    }

    class TODOViewHolder extends RecyclerView.ViewHolder {
        private TextView todoTitle;
        private RecyclerView recycleerSubTodo;

        TODOViewHolder(View itemView) {
            super(itemView);
            todoTitle = itemView.findViewById(R.id.todo_title);
            recycleerSubTodo = itemView.findViewById(R.id.recycleer_sub_todo);
        }
    }
}
