package com.example.noteapp.Models;

public class Note {

    private int Id;
    private String name;
    private String desc;
    private boolean isExpanded;
    private int alarm;

    public Note(int id, String name, String desc){
        this.Id = id;
        this.name = name;
        this.desc = desc;
        this.alarm = 0;
        isExpanded = false;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getAlarm() {
        return alarm;
    }

    public void setAlarm(int alarm) {
        this.alarm = alarm;
    }

    public boolean isExpanded() {
        return isExpanded;
    }

    public void setExpanded(boolean expanded) {
        isExpanded = expanded;
    }

}
