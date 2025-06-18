package com.beansoup.magic.config;

import com.beansoup.magic.ingredients.Ingredient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SoupConfig {
    @Bean
    public Ingredient getSecretSauce() {
//        return () -> "Essence of code wizard";
        return new Ingredient() {
            @Override
            public String describe() {
                return "Essence of code wizard";
            }
        };
    }
}
