package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    static final String DETAILS_KEY = "details_key";
    TextView title, description, startDate, endDate;
    CheckBox isDone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        setupView();
        Task task = getTask();
        showTask(task);

    }

    private void setupView() {
        title = findViewById(R.id.details_title);
        description = findViewById(R.id.details_description);
        startDate = findViewById(R.id.details_startDate);
        endDate = findViewById(R.id.details_endDate);

    }

    private Task getTask() {
        Intent intent = getIntent();
        Task task = (Task ) intent.getSerializableExtra(DETAILS_KEY);
        return task;
    }

    private void showTask(Task task) {
        title.setText(task.title);
        description.setText(task.description);
        startDate.setText(task.startDatestr());
        endDate.setText(task.endDatestr());
        isDone.setChecked(task.isDone);

    }
}
