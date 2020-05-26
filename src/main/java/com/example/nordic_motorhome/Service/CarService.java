package com.example.nordic_motorhome.Service;


import com.example.nordic_motorhome.Models.Car;
import com.example.nordic_motorhome.Repository.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    @Autowired
    CarRepo carRepo;

    public List<Car> fetchAllItems(){
        return carRepo.fetchAllItems();
    }

    public void addMotorhome(Car c){

        carRepo.addMotorhome(c);
    }
    public void deleteCar(int id){
        carRepo.deleteMotorhome(id);
    }






}
