package com.example.firstapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Example {
    private List<String> test;

    @Autowired
    public Example(List<String> test) {
        System.out.println("The value of the string is: " + test);
        this.test = test;
    }

    public List<String> getTest() {
        return test;
    }

    public void setTest(List<String> test) {
        this.test = test;
    }
}
