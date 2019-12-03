package com.buzzle.springboot.controller;

import com.buzzle.springboot.entity.User;
import com.buzzle.springboot.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @GetMapping("/showUsers")
    public String findUsers(Model model){
        var users = (List<User>) userService.findAll();

            model.addAttribute("users", users);

            return "showUsers";

    }

}
