package com.example.test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.task_list);

        TaskAdapter adapter = new TaskAdapter();
        recyclerView.setAdapter(adapter);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);



    }

    private void openDetails (Task task) {

        Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
        intent.putExtra(DetailsActivity.DETAILS_KEY, task);
        startActivity(intent);
    }
}
