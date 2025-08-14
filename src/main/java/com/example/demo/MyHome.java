package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyHome {

    @GetMapping("/")
    public String home(){
        return "77777777777777777777~~~!!!";
    }
}
