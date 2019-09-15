package com.example.test;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Date;

public class TaskAdapter extends RecyclerView.Adapter<ViewHolderScreen> {

    ArrayList<Task> tasks;

    public TaskAdapter() {
        tasks = new ArrayList<>();

        tasks.add(new Task("new title",
                "new Descrition",
                new Date(),
                new Date(),
                false));

        tasks.add(new Task("new title 2",
                "new Descrition 2",
                new Date(),
                new Date(),
                false));

        tasks.add(new Task("new title 3",
                "new Descrition 3",
                new Date(),
                new Date(),
                false));
    }

    @NonNull
    @Override
    public ViewHolderScreen onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.view_holder_screen, parent, false);
        return new ViewHolderScreen(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderScreen holder, int position) {
        holder.onBind(tasks.get(position));

    }

    @Override
    public int getItemCount() {
        return tasks.size();
    }
}
