package com.example.nordic_motorhome.Controller;

import com.example.nordic_motorhome.Service.CostumersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @Autowired
    CostumersService costumersService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("Costumer", costumersService.fetchAllCostumer());
        return "index";
    }

}
