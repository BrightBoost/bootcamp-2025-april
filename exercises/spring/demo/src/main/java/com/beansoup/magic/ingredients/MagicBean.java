package com.beansoup.magic.ingredients;

import org.springframework.stereotype.Component;

@Component
public class MagicBean implements Ingredient {
    @Override
    public String describe() {
        return "Glowing green beans";
    }
}
