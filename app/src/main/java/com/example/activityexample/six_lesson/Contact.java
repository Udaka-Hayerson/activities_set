package com.example.activityexample.six_lesson;

public class Contact {

    private String first_name;
    private String last_name;
    private String  phone_number;

    public Contact(String first_name, String last_name, String phone_number) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.phone_number = phone_number;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getPhoneNumber() {
        return phone_number;
    }
}
