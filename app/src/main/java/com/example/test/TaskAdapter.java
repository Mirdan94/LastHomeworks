package com.example.test;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TaskAdapter extends RecyclerView.Adapter<ViewHolderScreen> {

    ArrayList<Task> tasks;

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
