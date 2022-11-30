package com.example.qlktx.models.BEAN;

import java.util.Date;

public class Staff {
    int id;
    String name;
    boolean sex;
    String phonenumber;
    String date;
    String role;

    public Staff(String name, boolean sex, String phonenumber, String date, String role) {
        this.name = name;
        this.sex = sex;
        this.phonenumber = phonenumber;
        this.date = date;
        this.role = role;
    }

    public Staff(int id, String name, boolean sex, String phonenumber, String date, String role) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.phonenumber = phonenumber;
        this.date = date;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
