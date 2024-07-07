package com.finapplogin.FinApp.Controller;

import com.finapplogin.FinApp.model.User;
import com.finapplogin.FinApp.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    private UserServices userServices;

    @GetMapping("/")
    public String index() {
        return "This is home page";
    }

    @GetMapping("/save-user")
    public String saveUser(@RequestParam String name, @RequestParam email, @RequestParam username, @RequestParam String password){
        User user = new User(name,email,username,password);
        UserServices.saveMyuser(user);

        return "User Saved";
    }
}
