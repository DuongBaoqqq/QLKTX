package com.example.ql_ktx.models.BEAN;

public class Room {
    int id;
    String name;

    public Room(int id, String name, String building_name, int quantity) {
        this.id = id;
        this.name = name;
        this.building_name = building_name;
        this.quantity = quantity;
    }

    String building_name;
    int quantity;

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

    public String getBuilding_name() {
        return building_name;
    }

    public void setBuilding_name(String building_name) {
        this.building_name = building_name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
