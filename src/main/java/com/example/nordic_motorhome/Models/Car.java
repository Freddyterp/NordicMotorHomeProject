package com.example.nordic_motorhome.Models;

public class Car {
    private int id;
    private String Model;
    private String Brand;
    private int yearOfManufacture;
    private int yearOfPurchase;
    private int sleepingSpots;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public int getYearOfPurchase() {
        return yearOfPurchase;
    }

    public void setYearOfPurchase(int yearOfPurchase) {
        this.yearOfPurchase = yearOfPurchase;
    }

    public int getSleepingSpots() {
        return sleepingSpots;
    }

    public void setSleepingSpots(int sleepingSpots) {
        this.sleepingSpots = sleepingSpots;
    }
}
