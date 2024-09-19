package com.csulb.cecs575.blochbuilder;

import java.util.Arrays;
import java.util.UUID;

public class JBBuilder {
    public static void main(String[] args) {
        FoodItemUsingBlochBuilder foodItem1 = new FoodItemUsingBlochBuilder
                .Builder(UUID.randomUUID(), "Margherita Pizza")
                .description("Tomato sauce, mozzarella cheese, and basil")
                .price(10.99)
                .calories(600)
                .toppings(Arrays.asList("Tomato sauce", "Mozzarella cheese", "Basil"))
                .isVegan(false)
                .build();
        System.out.println("Food item 1: " + foodItem1);

        FoodItemUsingBlochBuilder foodItem2 = new FoodItemUsingBlochBuilder
                .Builder(UUID.randomUUID(), "Plain Margherita Pizza")
                .price(8.99)
                .calories(400)
                .build();
        System.out.println("Food item 2: " + foodItem2);
    }
}
