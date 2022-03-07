package com.dhaval.kishanseva.ui;

public class ColdModel {

    String capacity;
    String location;
    String name;

    public ColdModel(String capacity, String location, String name) {
        this.capacity = capacity;
        this.location = location;
        this.name = name;
    }

    public ColdModel() {
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
