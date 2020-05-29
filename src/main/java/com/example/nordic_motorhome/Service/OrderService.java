package com.example.nordic_motorhome.Service;

<<<<<<< Updated upstream
import com.example.nordic_motorhome.Models.Order;
=======
import com.example.nordic_motorhome.Models.Car;
import com.example.nordic_motorhome.Models.Order;
import com.example.nordic_motorhome.Repository.CarRepo;
>>>>>>> Stashed changes
import com.example.nordic_motorhome.Repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    OrderRepo Repo;

<<<<<<< Updated upstream
    public List<Order> fetchAll() {return Repo.readAll(); }

    public void addOrder(Order newOrder) {Repo.create(newOrder);}

    public void deleteOrder(int id) {Repo.delete(id);}

    public void updateOrder(Order updatedOrder) {Repo.update(updatedOrder);}
=======
    public List<Order> fecthAllItems() {return Repo.fetchAllItems();}

    public void addOrder(Order newOrder)
    {
        Repo.addOrder(newOrder);
    }

    public void deleteOrder(int id) {Repo.deleteOrder(id);}

    public void updateOrder(Order updatedOrder) {Repo.updateOrder(updatedOrder);}

    public Order findByID(int id) {return Repo.findOrderById(id); }

>>>>>>> Stashed changes
}
