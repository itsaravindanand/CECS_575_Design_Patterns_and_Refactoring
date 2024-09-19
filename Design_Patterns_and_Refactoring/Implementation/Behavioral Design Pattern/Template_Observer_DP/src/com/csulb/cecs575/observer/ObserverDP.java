package com.csulb.cecs575.observer;

import java.util.UUID;

public class ObserverDP {
    public static void main(String[] args) {
        /* Two items are added to the Menu and Cart.
        When the discount is applied, it will automatically update the Menu and Cart */
        //Item: Pizza
        UUID id1 = UUID.randomUUID();
        ItemDetails itemDetails1 = new ItemDetails(id1, "Pizza", 10);
        //Item: Pasta
        UUID id2 = UUID.randomUUID();
        ItemDetails itemDetails2 = new ItemDetails(id2, "Pasta", 12);
        System.out.println("Adding Items to Menu:\n");
        Menu menu = new Menu();
        System.out.println("Adding Pizza to Menu");
        menu.addItem(itemDetails1);
        System.out.println("Adding Pasta to Menu");
        menu.addItem(itemDetails2);
        menu.displayMenu();
        System.out.println("Adding Items to Cart:\n");
        CreateCart cart = new CreateCart();
        System.out.println("Adding Pizza to Cart");
        cart.addItem(itemDetails1, 1);
        cart.calculateTotal();
        System.out.println("Adding Pasta to Cart");
        cart.addItem(itemDetails2, 1);
        cart.calculateTotal();
        System.out.println("Setting Discount for Pizza");
        //10% Discount for Pizza
        itemDetails1.setDiscount(0.1);
        System.out.println("Setting Discount for Pasta");
        //50% Discount for Pizza
        itemDetails2.setDiscount(0.5);
    }
}
