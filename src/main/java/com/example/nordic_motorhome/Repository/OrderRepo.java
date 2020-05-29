package com.example.nordic_motorhome.Repository;

<<<<<<< Updated upstream
import com.example.nordic_motorhome.Models.Order;
=======
import com.example.nordic_motorhome.Models.Car;
import com.example.nordic_motorhome.Models.Order;
import com.example.nordic_motorhome.OrderMapper;
>>>>>>> Stashed changes
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

<<<<<<< Updated upstream
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


@Repository
public class OrderRepo {

=======
import java.util.List;

@Repository
public class OrderRepo{
>>>>>>> Stashed changes

    @Autowired
    JdbcTemplate template;

<<<<<<< Updated upstream

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

=======
    public List<Order> fetchAllItems(){
        String sql = "SELECT * FROM Orders";
        List<Order> orders = template.query(sql,new OrderMapper());
        System.out.println("ID: " + orders.get(0).getId());
        return orders;
    }

    public void addOrder(Order newOrder){
        String sql = "INSERT INTO orders (idOrders, price, reservationDate, startDate, endDate, Cars_idCars, Customers_idCustomers) VALUES (?, ?, ?, ?, ?, ?, ?)";
        template.update(sql, newOrder.getId(), newOrder.getPrice(), newOrder.getReservationDate(), newOrder.getStartDate(), newOrder.getEndDate(),
                        newOrder.getReservedCar(), newOrder.getCustomer());
    }
    public void deleteOrder(int id){
        //tilføj parameter som kan teste om det lykkedes at slette
        String sql = "DELETE FROM orders WHERE idOrders=?";
        template.update(sql,id);
    }

    public Order findOrderById(int id){
        String sql = "SELECT * FROM orders WHERE idOrders=?";
        Order order = template.queryForObject(sql, new OrderMapper(), id);
        return order;
    }

    public void updateOrder(Order updatedOrder){
        String sql = "UPDATE orders SET price=?, reservationDate=?, startDate=?, EndDate=?, Cars_idCars=?, Customers_idCustomers=? WHERE idOrders=?";
        template.update(sql, updatedOrder.getPrice(), updatedOrder.getReservationDate(), updatedOrder.getStartDate(), updatedOrder.getEndDate(),
                        updatedOrder.getReservedCar(), updatedOrder.getCustomer(), updatedOrder.getId());
>>>>>>> Stashed changes
    }

}
