package com.example.nordic_motorhome.Controller;

import com.example.nordic_motorhome.Models.Car;
import com.example.nordic_motorhome.Models.Customer;
import com.example.nordic_motorhome.Service.CarService;
import com.example.nordic_motorhome.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
    @Autowired
    CustomerService customerService;

    @Autowired
    CarService carService;



    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("cars", carService.fetchAllItems());
        return "index";
    }

    @GetMapping("/create")
    public String showCreatePage(){
        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Car car){
        carService.addCar(car);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id){
        carService.deleteCar(id);
        return "redirect:/";
    }

    @GetMapping("/update/{id}")
    public String update(@PathVariable("id") int id, Model model){
        model.addAttribute( "car", carService.findById(id));
        return "update";
    }

    @PostMapping("/update")
    public String updateNow(@ModelAttribute Car car){
        carService.updateCar(car);
        return "redirect:/";
    }

    @GetMapping("/customerindex")
    public String customerindex (Model model){
        model.addAttribute("customers", customerService.fetchAllItems());
        return "index";
    }

    @GetMapping("/create")
    public String showCreatePageCustomer(){
        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Customer customer){
        customerService.addCustomer(customer);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id){
        customerService.deleteCustomer(id);
        return "redirect:/";
    }

    @GetMapping("/update/{id}")
    public String update(@PathVariable("id") int id, Model model){
        model.addAttribute( "customer", customerService.findById(id));
        return "update";
    }

    @PostMapping("/update")
    public String updateNow(@ModelAttribute Customer customer){
        customerService.updateCustomer(customer);
        return "redirect:/";
    }
}

