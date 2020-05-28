package com.example.nordic_motorhome.Repository;

import com.example.nordic_motorhome.Models.Order;

import java.util.List;

public interface IOrderRepo {

    public void create(Order order);

    public List<Order>  readAll();

    public Order read(int id);

    public void update(Order updatedOrder);

    public void delete(int id);
}
