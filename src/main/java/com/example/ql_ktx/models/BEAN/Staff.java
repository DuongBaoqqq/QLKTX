package com.example.ql_ktx.models.BEAN;

import java.util.Date;

public class Staff {
    int id;
    String name;
    int sex;
    String phone_number;
    Date date;

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

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Staff(int id, String name, int sex, String phone_number, Date date, String role) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.phone_number = phone_number;
        this.date = date;
        this.role = role;
    }

    String role;
}
