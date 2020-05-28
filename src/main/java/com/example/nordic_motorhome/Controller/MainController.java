package com.example.nordic_motorhome.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

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
