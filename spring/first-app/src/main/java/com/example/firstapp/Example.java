package com.example.firstapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Example {
    private String test;

    @Autowired
    public Example(@Qualifier("someString1") String test) {
        System.out.println("The value of the string is: " + test);
        this.test = test;
    }
}
