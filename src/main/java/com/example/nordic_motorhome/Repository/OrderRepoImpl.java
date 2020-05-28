package com.example.nordic_motorhome.Repository;

import com.example.nordic_motorhome.Models.Order;
import com.example.nordic_motorhome.Util.DatabaseConnectionManager;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OrderRepoImpl implements IOrderRepo {


    private Connection conn;

    public OrderRepoImpl()
    {
        this.conn = DatabaseConnectionManager.getDatabaseConnection();
    }

    @Override
    public void create(Order newOrder){
        try{
            Statement st = conn.createStatement();
            st.executeUpdate("Insert INTO orders(," + newOrder.getId() + "," + newOrder.getPrice() + ","
                            + newOrder.getReservationDate() + "," + newOrder.getStartDate() + "," + newOrder.getEndDate()+")");

        }catch (SQLException e){
            e.printStackTrace();
        }
    }


    @Override
    public List<Order> readAll() {
        List<Order> orders = new ArrayList<Order>();
        try{
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM orders");
            ResultSet rs =ps.executeQuery();
         //   Order tempOrder = OrderRepoImpl.getData(rs);
         //   orders.add(tempOrder);
        } catch (SQLException e){
            e.printStackTrace();
        }

        return orders;
    }

    public Order read(int id){
        Order tempOrder = new Order();
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM order WHERE id=?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
         //   tempOrder = OrderRepoImpl.getData(rs);
        } catch (SQLException e){
            e.printStackTrace();
        }

        return tempOrder;
    }


    public void update(Order updatedOrder){
        try{
            PreparedStatement ps = conn.prepareStatement("update orders SET price=?, reservationDate=?, startDate=?, endDate=?, " +
                                                        " Motorhomes_idMotorhomes=?, Customer_idCustomer=?");
            ps.setFloat(1, updatedOrder.getPrice());
            ps.setDate(2, updatedOrder.getDateAsSQL(updatedOrder.getReservationDate()));
            ps.setDate(3,updatedOrder.getDateAsSQL(updatedOrder.getStartDate()));
            ps.setDate(4,updatedOrder.getDateAsSQL(updatedOrder.getEndDate()));
         //   ps.setInt(5, updatedOrder.getReservedCar());
           // ps.setInt(6, updatedOrder.getCustomer());
        }catch (SQLException e){
            e.printStackTrace();
        }

    }


    public void delete(int id){
        try
        {
            PreparedStatement ps = conn.prepareStatement("DELETE FROM orders WHERE id=?");
            ps.setInt(1, id);
            ps.execute();
        } catch (SQLException e){
            e.printStackTrace();
        }

    }


    private static Order getData(ResultSet rs)
    {
        Order tempOrder = new Order();
        try {
            while(rs.next()) {
                tempOrder.setId(rs.getInt(1));
                tempOrder.setPrice(rs.getFloat(2));
                tempOrder.setReservationDate(rs.getDate(3));
                tempOrder.setStartDate(rs.getDate(4));
                tempOrder.setEndDate(rs.getDate(5));
             //   tempOrder.setReservedCar();
               // tempOrder.setCustomer();
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return tempOrder;
    }


}
