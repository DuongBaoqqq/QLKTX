package com.example.qlktx.models.BEAN;

public class Room {
    int id ;
    int building_id;
    String name ;
    int quantity ;

    String buildingName = "";

    int numStudent = 0 ;

    public Room(int id , int building_id , String name , int quantity   ) {
        this.id = id ;
        this.building_id = building_id;
        this.name = name ;
        this.quantity = quantity;

    }

    public Room(int id , int building_id , String name , int quantity , String buildingName , int numStudent   ) {
        this.id = id ;
        this.building_id = building_id;
        this.name = name ;
        this.quantity = quantity;
        this.buildingName = buildingName;
        this.numStudent = numStudent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBuilding_id() {
        return building_id;
    }

    public void setBuilding_id(int building_id) {
        this.building_id = building_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public int getNumStudent() {
        return numStudent;
    }

    public void setNumStudent(int numStudent) {
        this.numStudent = numStudent;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
