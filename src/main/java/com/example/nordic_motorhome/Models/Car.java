package com.example.nordic_motorhome.Models;


public class Car {


    private int idCar;
    private String model;
    private String brand;
    private int yearOfManufacture;
    private int yearOfPurchase;
    private int sleepingSpot;

    public Car() {
    }

    public Car(int idCar, String model, String brand, int yearOfManufacture, int yearOfPurchase, int sleepingSpot) {
        this.idCar = idCar;
        this.model = model;
        this.brand = brand;
        this.yearOfManufacture = yearOfManufacture;
        this.yearOfPurchase = yearOfPurchase;
        this.sleepingSpot = sleepingSpot;
    }

    public int getIdCar() {
        return idCar;
    }

    public void setIdCar(int idCar) {
        this.idCar = idCar;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
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

    public int getSleepingSpot() {
        return sleepingSpot;
    }

    public void setSleepingSpot(int sleepinSspot) {
        this.sleepingSpot = sleepinSspot;
    }
}

