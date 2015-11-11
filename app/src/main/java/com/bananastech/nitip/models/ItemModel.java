package com.bananastech.nitip.models;

/**
 * Created by Haydar Ali Ismail on 10-Nov-15.
 */
public class ItemModel {

    private String name;
    private double price;
    private String location;
    private int picture;

    public ItemModel(String name, double price, String location, int picture) {
        this.name = name;
        this.price = price;
        this.location = location;
        this.picture = picture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }
}
