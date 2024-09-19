package com.csulb.cecs575.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class ItemDetails {
    /*The Subject Class*/
    private final UUID id;
    private String name;
    private double price, discount;
    private List<Observer> observers;

    public ItemDetails(UUID id, String name, double price) {
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.price = price;
        this.discount = 0.0;
        this.observers = new ArrayList<>();
    }

    public void setDiscount(double discount) {
        this.discount = discount;
        System.out.println("Setting in discount value: " + discount * 100.0 + "% for " + name + ", and broadcast the update to observers\n");
        //Broadcasting the update to the Observers
        observers.forEach(Observer::updateViaObserver);
    }

    public double getDiscountedPrice() {
        double discountValue = 1.0 - discount;
        return (Math.round((price * discountValue) * 100.0) / 100.0);
    }

    public void attach(Observer observer, String name) {
        System.out.println("Attaching " + observer + " observer for " + name + "\n");
        //adding the observers to the list
        this.observers.add(observer);
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

    public double getDiscount() {
        return discount;
    }
}
