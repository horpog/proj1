package com.example.examle.proj1;

import com.example.examle.proj1.Domain.Event;

import java.util.ArrayList;
import java.util.List;

public class FakeData {
    public static List<Event> events = new ArrayList<>();
    public static List getEvents(){
        for (int i = 0; i<20 ; i++){
            Event event = new Event();
            event.setId(1);
            event.setTitle("عنوان شماره"+i);
            event.setDescription("توضیات شماره "+i);
            events.add(event);
        }
        return events;
    }
}
