package com.example.examle.proj1;

import com.example.examle.proj1.Domain.Event;
import com.example.examle.proj1.Domain.User;

import java.util.ArrayList;
import java.util.List;

public class FakeData {
    public static List<Event> events = new ArrayList<>();
    public static List<User> users = new ArrayList<>();
    public static List getEvents(){
        for (int i = 0; i<20 ; i++){
            Event event = new Event();
            event.setId(i);
            event.setTitle("عنوان شماره"+i);
            event.setDescription("توضیات شماره "+i);
            events.add(event);
        }
        return events;
    }
    public static List getUsers(){
        for (int i = 0; i<20 ; i++){
            User user = new User();
            user.setId(i);
            user.setFirstName("نام");
            user.setLastName("نام خانوادگی");
            users.add(user);
        }
        return users;
    }
}
