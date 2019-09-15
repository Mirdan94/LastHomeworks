package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class FillDetailsActivity extends AppCompatActivity {

    TextView tv_startDate;
    Button bt_start;
    Calendar c;
    DatePickerDialog dpd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fill_details);

        tv_startDate = (TextView) findViewById(R.id.tv_start);
        bt_start = (Button) findViewById(R.id.bn_startDate);

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
    }
}
