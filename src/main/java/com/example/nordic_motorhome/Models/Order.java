package com.example.nordic_motorhome.Models;

import java.util.Date;

public class Order {
        private int id;
        private int price;
        private Date startDate;
        private Date endDate;
        private Date reservationDate;

    public Order(int id, int price, Date startDate, Date endDate, Date reservationDate) {
        this.id = id;
        this.price = price;
        this.startDate = startDate;
        this.endDate = endDate;
        this.reservationDate = reservationDate;
    }

    public Order() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getStartDate() {
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

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate){
        this.reservationDate = reservationDate;
    }
}
