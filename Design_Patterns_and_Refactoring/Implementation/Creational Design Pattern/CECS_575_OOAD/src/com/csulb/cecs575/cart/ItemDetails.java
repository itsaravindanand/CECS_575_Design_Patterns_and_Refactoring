package com.csulb.cecs575.cart;

import java.util.Objects;
import java.util.UUID;

public class ItemDetails {
    private final UUID id;
    private String name;
    private double price;

    public ItemDetails(UUID id, String name, double price) {
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.price = price;
    }
    public UUID getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}
