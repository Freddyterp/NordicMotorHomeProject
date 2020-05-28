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
    public String index(Model model) {
        model.addAttribute("cars", carService.fetchAllItems());
        return "index";
    }

    @GetMapping("/create")
    public String create(){
        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Car car){
        carService.addCar(car);
        return "redirect:/";
    }

    @GetMapping("/rental")
    public String rental()
    {
        return "rental";
    }

    @GetMapping("/create_rental")
    public String createRental()
    {
        return "create_rental";
    }
}