package com.example.nordic_motorhome.Models;

import java.util.Date;

public class Order {
        private int id;
        private float price;
        private Date startDate;
        private Date endDate;
        private Date reservationDate;
        private Car reservedCar;
        private Customer customer;

    public Order(int id, float price, Date startDate, Date endDate, Date reservationDate, Car car, Customer customer) {
        this.id = id;
        this.price = price;
        this.startDate = startDate;
        this.endDate = endDate;
        this.reservationDate = reservationDate;
        this.reservedCar = car;
        this.customer = customer;
    }

    public Order() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Date getStartDate(){
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getReservationDate(){return this.reservationDate;}

    public java.sql.Date getDateAsSQL(java.util.Date Date) {
        java.sql.Date sqlDate= new java.sql.Date(Date.getTime());
        return sqlDate;
    }

    public void setReservationDate(Date reservationDate){
        this.reservationDate = reservationDate;
    }

    public Car getReservedCar() {
        return reservedCar;
    }

    public void setReservedCar(Car reservedCar) {
        this.reservedCar = reservedCar;
    }

    public Customer getCustomer(){
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
