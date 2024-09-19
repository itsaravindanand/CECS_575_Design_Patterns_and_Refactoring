package com.csulb.cecs575.blochbuilder;

import com.csulb.cecs575.cart.ItemDetails;

import java.util.List;
import java.util.UUID;

public class FoodItemUsingBlochBuilder extends ItemDetails {
    private final String description;
    private final int calories;
    private final List<String> toppings;
    private final boolean isVegan;

    private FoodItemUsingBlochBuilder(Builder builder) {
        super(builder.id, builder.name, builder.price);
        this.description = builder.description;
        this.calories = builder.calories;
        this.toppings = builder.toppings;
        this.isVegan = builder.isVegan;
    }

    public String getDescription() {
        return description;
    }

    public int getCalories() {
        return calories;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public boolean isVegan() {
        return isVegan;
    }

    public static class Builder {
        private final UUID id;
        private final String name;
        private String description;
        private double price;
        private int calories;
        private List<String> toppings;
        private boolean isVegan;

        public Builder(UUID id, String name) {
            this.id = id;
            this.name = name;
        }
        public Builder description(String description) {
            this.description = description;
            return this;
        }
        public Builder price(double price) {
            this.price = price;
            return this;
        }
        public Builder calories(int calories) {
            this.calories = calories;
            return this;
        }
        public Builder toppings(List<String> toppings) {
            this.toppings = toppings;
            return this;
        }
        public Builder isVegan(boolean isVegan) {
            this.isVegan = isVegan;
            return this;
        }
        public FoodItemUsingBlochBuilder build() {
            return new FoodItemUsingBlochBuilder(this);
        }
    }
    @Override
    public String toString() {
        return "FoodItemUsingBlochBuilder{" +
                "description='" + description + '\'' +
                ", calories=" + calories +
                ", toppings=" + toppings +
                ", isVegan=" + isVegan +
                '}';
    }
}
