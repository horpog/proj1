package com.example.examle.proj1.Domain;

import java.sql.Time;
import java.util.Date;

public class Event {
    private int id;
    private int userID;
    private String title;
    private String description;
    private enum state {close, open}
    private Time reminderTime;
    private Date reminderDate;
    private Time reminderTimeRepeat;
    private Date reminderDateRepeat;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Time getReminderTime() {
        return reminderTime;
    }

    public void setReminderTime(Time reminderTime) {
        this.reminderTime = reminderTime;
    }

    public Date getReminderDate() {
        return reminderDate;
    }

    public void setReminderDate(Date reminderDate) {
        this.reminderDate = reminderDate;
    }

    public Time getReminderTimeRepeat() {
        return reminderTimeRepeat;
    }

    public void setReminderTimeRepeat(Time reminderTimeRepeat) {
        this.reminderTimeRepeat = reminderTimeRepeat;
    }

    public Date getReminderDateRepeat() {
        return reminderDateRepeat;
    }

    public void setReminderDateRepeat(Date reminderDateRepeat) {
        this.reminderDateRepeat = reminderDateRepeat;
    }
}
