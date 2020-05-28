package com.example.nordic_motorhome.Service;

import com.example.nordic_motorhome.Models.Order;
import com.example.nordic_motorhome.Repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    OrderRepo Repo;

    public List<Order> fetchAll() {return Repo.readAll(); }

    public void addOrder(Order newOrder) {Repo.create(newOrder);}

    public void deleteOrder(int id) {Repo.delete(id);}

    public void updateOrder(Order updatedOrder) {Repo.update(updatedOrder);}
}
