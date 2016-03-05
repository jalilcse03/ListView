package com.example.murtuza.customlistview;

/**
 * Created by Murtuza on 3/5/2016.
 */
public class PersonModel {
    private String name;
    private String address;

    public PersonModel(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public PersonModel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
