package com.neueda.finapp.controller;

import com.neueda.finapp.model.User;
import com.neueda.finapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Controller
public class ViewController {
    private final UserService userService;

    @Autowired
    public ViewController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/allusers")
    public String getAllUsers(Model model) {
        List<User> users = userService.getAllUsers();
        model.addAttribute("users", users);
        return "users";
    }

    @GetMapping("/index")
    public String index() {
        return "index";
    }
    @GetMapping("/login.html")
    public String login() {
        return "login";
    }
    @GetMapping("/signup.html")
    public String signup() {
        return "signup";
    }
    @GetMapping("/dashboard.html")
    public String dashboard() {
        return "dashboard";
    }
    @GetMapping("/transactions.html")
    public String transactions() {
        return "transactions";
    }
    @GetMapping("/goals.html")
    public String goals() {
        return "goals";
    }
    @GetMapping("/users")
    public String users() {
        return "users";
    }
}
