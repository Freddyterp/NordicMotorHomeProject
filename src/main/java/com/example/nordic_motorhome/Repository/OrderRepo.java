package com.example.nordic_motorhome.Repository;

import com.example.nordic_motorhome.Models.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


@Repository
public class OrderRepo {


    @Autowired
    JdbcTemplate template;


    public void create(Order newOrder){

        String sql = "INSERT INTO orders(idOrders, price, reservationDate, startDate, endDate, Cars_idCars, Customers_idCustomers) VALUES (?, ?, ?, ?, ?, ?, ?)";
        template.update(sql, newOrder.getId(), newOrder.getPrice(), newOrder.getReservationDate(), newOrder.getStartDate(),
                            newOrder.getEndDate(), newOrder.getReservedCar(), newOrder.getCustomer());
    }


    public List<Order> readAll() {
        String sql = "SELECT *  FROM orders";
        RowMapper<Order> rowMapper = new BeanPropertyRowMapper<>(Order.class);
        return template.query(sql, rowMapper);
    }

    public Order read(int id){
       String sql = "SELECT * FROM orders WHERE idOrders=?";
       RowMapper<Order> rowMapper = new BeanPropertyRowMapper<>(Order.class);
       return template.queryForObject(sql, rowMapper, id);
    }

    public void update(Order updatedOrder){
        String sql = "UPDATE order SET (price, reservationDate, startDate, endDate, Cars_idCars, Customers_idCustomers) VALUES (?, ?, ?, ?, ?, ?, ?)";
        template.update(sql, updatedOrder.getId(), updatedOrder.getPrice(), updatedOrder.getReservationDate(), updatedOrder.getStartDate(),
                updatedOrder.getEndDate(), updatedOrder.getReservedCar(), updatedOrder.getCustomer());

    }

    public void delete(int id){
        String sql = "DELETE FROM orders WHERE idOrders=?";
        template.update(sql, id);

    }

}
