package com.assignment.controller;


import com.assignment.model.Users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetingController {
    @GetMapping("/home")
    public String index()
    {
        return "index";
    }
    @PostMapping("/login")
    public ModelAndView login(Model model, @RequestParam("username") String username, @RequestParam("password") String password) {
        Users users = new Users(username, password);
        model.addAttribute("message", "Dang nhap thanh cong");
        ModelAndView modelAndView = new ModelAndView("home", "users", users);
        return modelAndView;
    }

}

