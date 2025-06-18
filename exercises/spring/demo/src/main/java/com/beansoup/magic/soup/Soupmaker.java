package com.beansoup.magic.soup;

import com.beansoup.magic.ingredients.Ingredient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Soupmaker {
    private List<Ingredient> ingredients;

    @Autowired
    public Soupmaker(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public void makeSoup() {
        for(Ingredient ingredient : ingredients) {
            System.out.println(ingredient.describe());
        }
        System.out.println("Soup made with " + ingredients.size() + " magical ingredients!");
    }
}
