package com.example.nordic_motorhome.Repository;

import com.example.nordic_motorhome.Models.Costumers;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CostumersRepo {

    public List<Costumers> fetchAllCostumers() {
        List<Costumers> costumers = new ArrayList<>();
        costumers.add(new Costumers(1,"mudi", "Hej", 12345678, "mudi@hotmail.com", "123456"));
        costumers.add(new Costumers(2,"peter", "Hej", 12345678, "mudi@hotmail.com", "123456"));
        costumers.add(new Costumers(3,"hans", "Hej", 12345678, "mudi@hotmail.com", "123456"));
        costumers.add(new Costumers(4,"tim", "Hej", 12345678, "mudi@hotmail.com", "123456"));
        costumers.add(new Costumers(5,"dinmor", "Hej", 12345678, "mudi@hotmail.com", "123456"));
        return costumers;
    }
}
