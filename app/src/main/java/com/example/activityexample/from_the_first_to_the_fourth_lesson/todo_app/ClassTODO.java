package com.example.activityexample.from_the_first_to_the_fourth_lesson.todo_app;

import java.util.List;

public class ClassTODO {
    private int id;
    private String title;
    private String description;
    private List<SubTODO> subTODOlist;

    public ClassTODO(int id, String title, String description, List<SubTODO> subTODOlist) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.subTODOlist = subTODOlist;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public List<SubTODO> getSubTODOlist() {
        return subTODOlist;
    }

    public void setSubTODOlist(List<SubTODO> subTODOlist) {
        this.subTODOlist = subTODOlist;
    }
}

