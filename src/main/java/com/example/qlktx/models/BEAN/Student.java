package com.example.qlktx.models.BEAN;

import java.util.Date;

public class Student {
    int id;
    String room_name;
    String name;
    Date date;
    int sex;
    String cccd;
    String phone_number;
    String uni;
    String faculty;
    String _class;
    Date date_from;
    Date date_to;

    public Date getDate_from() {
        return date_from;
    }

    public void setDate_from(Date date_from) {
        this.date_from = date_from;
    }

    public Date getDate_to() {
        return date_to;
    }

    public void setDate_to(Date date_to) {
        this.date_to = date_to;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoom_name() {
        return room_name;
    }

    public void setRoom_name(String room_name) {
        this.room_name = room_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getUni() {
        return uni;
    }

    public void setUni(String uni) {
        this.uni = uni;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String get_class() {
        return _class;
    }

    public void set_class(String _class) {
        this._class = _class;
    }

    public Student(int id, String room_name, String name, Date date, int sex, String cccd, String phone_number, String uni, String faculty, String _class, Date date_from, Date date_to) {
        this.id = id;
        this.room_name = room_name;
        this.name = name;
        this.date = date;
        this.sex = sex;
        this.cccd = cccd;
        this.phone_number = phone_number;
        this.uni = uni;
        this.faculty = faculty;
        this._class = _class;
        this.date_from = date_from;
        this.date_to = date_to;
    }

}
