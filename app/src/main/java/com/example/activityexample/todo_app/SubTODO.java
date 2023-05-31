package com.example.activityexample.todo_app;

public class SubTODO {
    private int sub_id;
    private String sub_title;
    private String sub_description;

    public SubTODO(int sub_id, String sub_title, String sub_description) {
        this.sub_id = sub_id;
        this.sub_title = sub_title;
        this.sub_description = sub_description;
    }

    public int getSub_id() {
        return sub_id;
    }

    public void setSub_id(int sub_id) {
        this.sub_id = sub_id;
    }

    public String getSub_title() {
        return sub_title;
    }

    public void setSub_title(String sub_title) {
        this.sub_title = sub_title;
    }

    public String getSub_description() {
        return sub_description;
    }

    public void setSub_description(String sub_description) {
        this.sub_description = sub_description;
    }
}