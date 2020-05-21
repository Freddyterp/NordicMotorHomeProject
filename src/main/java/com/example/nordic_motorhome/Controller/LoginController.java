package com.example.nordic_motorhome.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    // Login form
    @RequestMapping("/showMyLoginPage")
    public String login() {
        return "login";
    }



}
