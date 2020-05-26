package com.example.nordic_motorhome.Controller;

import com.example.nordic_motorhome.Models.Car;
import com.example.nordic_motorhome.Service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
    @Autowired
    CarService carService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/create")
    public String create(){
        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Car car){
        carService.addMotorhome(car);
        return "redirect:/";
    }

}
