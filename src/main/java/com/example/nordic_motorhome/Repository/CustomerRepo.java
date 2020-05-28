package com.example.nordic_motorhome.Repository;


import com.example.nordic_motorhome.Models.Car;
import com.example.nordic_motorhome.Models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class CustomerRepo {

    @Autowired
    JdbcTemplate template;


    public List<Customer> fetchAllItems(){
        String sql = "SELECT * FROM Customer";
        RowMapper<Customer> rowMapper = new BeanPropertyRowMapper<>(Customer.class);
        return template.query(sql,rowMapper);
    }

    public void addCustomer(Customer c){
        String sql = "INSERT INTO Customer (idCustomer, fName, lName, Adresse, phone_Number, email, driverlicense) VALUES (?, ?, ?, ?, ?, ?, ?)";
        template.update(sql, c.getIdCustomers(), c.getfName(), c.getlName(), c.getAdress(), c.getPhone_number(), c.getEmail(), c.getDriverLicense() );
    }
    public void deleteCustomer(int id){
        //tilføj parameter som kan teste om det lykkedes at slette
        String sql = "DELETE FROM customers WHERE idCustomers=?";
        template.update(sql,id);
    }

    public Customer findCustomerById(int id){
        String sql = "SELECT * FROM Customers WHERE idCustomers=?";
        RowMapper<Customer> rowMapper = new BeanPropertyRowMapper<>(Customer.class);
        return template.queryForObject(sql, rowMapper, id);
    }

    public void updateCustomer(Customer c){
        String sql = "UPDATE Customers SET idCustomers=?, fName=?, lName=?, Adresse=?, phone_number=?, email=?, driverlicense=? WHERE idCustomers=?";
        template.update(sql, c.getIdCustomers(), c.getfName(), c.getlName(), c.getAdress(), c.getPhone_number(), c.getEmail(), c.getDriverLicense());
    }




}
