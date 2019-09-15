package com.example.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Task {

    public String title;
    public String description;
    public Date startDate;
    public Date endDate;
    public boolean isDone;

    public Task(String title, String description, Date startDate, Date endDate, boolean isDone) {
        this.title = title;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.isDone = isDone;
    }

    public String dates () {

        DateFormat format = new SimpleDateFormat();

        String startDateStr = format.format(startDate);
        String endDateStr = format.format(endDate);

        return startDateStr + " - " + endDateStr;
    }

}
