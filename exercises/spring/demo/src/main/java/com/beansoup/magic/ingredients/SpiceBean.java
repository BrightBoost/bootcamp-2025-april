package com.beansoup.magic.ingredients;

import org.springframework.stereotype.Component;

@Component
public class SpiceBean implements Ingredient {
    @Override
    public String describe() {
        return "Very spicy bean";
    }
}
