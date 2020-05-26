package com.example.nordic_motorhome.Repository;

import com.example.nordic_motorhome.Models.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CarRepo {

    @Autowired
    JdbcTemplate template;

    public List<Car> fetchAllItems(){
        String sql = "SELECT * FROM motorhomes";
        RowMapper<Car> rowMapper = new BeanPropertyRowMapper<>(Car.class);
        return template.query(sql,rowMapper);
    }

    public void addMotorhome(Car c){
        String sql = "INSERT INTO motorhomes (idMotorhomes, model, brand, Year_of_manufacture, year_of_purchase, sleeping_spots) VALUES (?, ?, ?, ?, ?, ?)";
        template.update(sql, c.getIdCar(), c.getModel(), c.getBrand(), c.getYearOfManufacture(), c.getYearOfPurchase(), c.getSleepingSpot() );
    }
    public void deleteMotorhome(int id){
        //tilføj parameter som kan teste om det lykkedes at slette
        String sql = "DELETE FROM motorhomes WHERE idMotorhome=?";
        template.update(sql,id);
    }

    public Car findMotorhomeById(int id){
        String sql = "SELECT * FROM motorhomes WHERE idMotorhome=?";
        RowMapper<Car> rowMapper = new BeanPropertyRowMapper<>(Car.class);
        return template.queryForObject(sql, rowMapper, id);
    }
/*
    public void updateMotorhome(Car c){
        String sql = "UPDATE motorhome SET b";
    }
*/
}
