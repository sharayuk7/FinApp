package com.finapplogin.FinApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/welcome")
    public String Welcome() {
        return "index";
    }

}
