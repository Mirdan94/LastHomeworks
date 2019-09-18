package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class FillDetailsActivity extends AppCompatActivity {

    TextView tv_startDate, tv_endDate;
    Button bt_start, bt_end, create;
    Calendar c, b;
    DatePickerDialog dpd, dpd2;
    EditText editText;

    static final String NAME_KEY = "name_key";


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fill_details);

        tv_startDate = findViewById(R.id.tv_start);
        bt_start = findViewById(R.id.bn_startDate);
        create = findViewById(R.id.create_button2);
        tv_endDate = findViewById(R.id.tv_endDate);
        bt_end = findViewById(R.id.bn_endDate);
        editText = findViewById(R.id.edit_fillIn);

        bt_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                c = Calendar.getInstance();
                int day = c.get(Calendar.DAY_OF_MONTH);
                int month = c.get(Calendar.MONTH);
                int year = c.get(Calendar.YEAR);

                dpd = new DatePickerDialog(FillDetailsActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int Year, int Month, int Day) {

                        tv_startDate.setText(Day + "/" + Month + "/" + Year);
                    }
                }, day, month, year);
                dpd.show();
            }
        });

        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });

        bt_end.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                b = Calendar.getInstance();
                int day = b.get(Calendar.DAY_OF_MONTH);
                int month = b.get(Calendar.MONTH);
                int year = b.get(Calendar.YEAR);

                dpd2 = new DatePickerDialog(FillDetailsActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int Year, int Month, int Day) {

                        tv_endDate.setText(Day + "/" + Month + "/" + Year);
                    }
                }, day, month, year);
                dpd2.show();
            }
        });

        Intent intent = new Intent(FillDetailsActivity.this, TaskAdapter.class);
        intent.putExtra(NAME_KEY, editText.toString());
        startActivityForResult(intent, 1);
    }
}
