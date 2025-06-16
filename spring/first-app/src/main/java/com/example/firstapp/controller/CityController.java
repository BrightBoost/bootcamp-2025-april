package com.example.firstapp.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityController {

    // get endpoint - url/hi
    @GetMapping("hi")
    public String quickExample() {
        while(true) {
            System.out.println("hiiii");
            if(Math.random() > 0.8) {
                break;
            }
        }
        return "Helllloooo!!!!";
    }
}
