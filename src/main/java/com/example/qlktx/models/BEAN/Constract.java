package com.example.qlktx.models.BEAN;

public class Constract {
    int id;
    int std_id;
    String date_from;
    String date_to;

    public Constract(int id, int std_id, String date_from, String date_to) {
        this.id = id;
        this.std_id = std_id;
        this.date_from = date_from;
        this.date_to = date_to;
    }

    public Constract(int std_id, String date_from, String date_to) {
        this.std_id = std_id;
        this.date_from = date_from;
        this.date_to = date_to;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStd_id() {
        return std_id;
    }

    public void setStd_id(int std_id) {
        this.std_id = std_id;
    }

    public String getDate_from() {
        return date_from;
    }

    public void setDate_from(String date_from) {
        this.date_from = date_from;
    }

    public String getDate_to() {
        return date_to;
    }

    public void setDate_to(String date_to) {
        this.date_to = date_to;
    }
}
