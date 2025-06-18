package com.example.firstapp.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ExampleConfiguration {

    @Bean
    public String someString1() {
        return "Blabla";
    }

    @Bean
    @Primary
    public String someString2() {
        return "lala";
    }
}
