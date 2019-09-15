package com.example.test;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolderScreen extends RecyclerView.ViewHolder {

    TextView title, dates;
    CheckBox isDone;

    public ViewHolderScreen (@NonNull View itemView) {
        super(itemView);

        title = itemView.findViewById(R.id.task_title);
        isDone = itemView.findViewById(R.id.task_isDone);
        dates = itemView.findViewById(R.id.start_date);
    }

    public void onBind(Task task) {
         title.setText(task.title);
         isDone.setChecked(task.isDone);
         dates.setText(task.dates());

    }
}
