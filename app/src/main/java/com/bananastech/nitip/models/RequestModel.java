package com.bananastech.nitip.models;

/**
 * Created by Haydar Ali Ismail on 11-Nov-15.
 */
public class RequestModel {
    private String name;
    private String description;
    private double lowPrice;
    private double highPrice;
    private int quantity;

    public RequestModel(String name, String description, double lowPrice, double highPrice, int quantity) {
        this.quantity = quantity;
        this.name = name;
        this.description = description;
        this.lowPrice = lowPrice;
        this.highPrice = highPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getLowPrice() {
        return lowPrice;
    }

    public void setLowPrice(double lowPrice) {
        this.lowPrice = lowPrice;
    }

    public double getHighPrice() {
        return highPrice;
    }

    public void setHighPrice(double highPrice) {
        this.highPrice = highPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
