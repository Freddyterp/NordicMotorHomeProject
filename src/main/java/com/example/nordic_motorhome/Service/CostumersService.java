package com.example.nordic_motorhome.Service;

import com.example.nordic_motorhome.Models.Costumers;
import com.example.nordic_motorhome.Repository.CostumersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CostumersService
{
    @Autowired
    CostumersRepo costumersRepo;

    public List<Costumers> fetchAllCostumer(){
        return costumersRepo.fetchAllCostumers();

    }
}