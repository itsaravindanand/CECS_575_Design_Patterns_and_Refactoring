package com.csulb.cecs575.template;

public class McDonalds extends ProcessOrder {
    /* Abstract Template Methods definitions for McDonald's Restaurant */
    @Override
    boolean prepareFood() {
        //Restaurant Specific Preparation Implementation can be provided here.
        System.out.println("Preparing Your McDonald's Order. Average Preparation Time: 10 Minutes...");
        return true;
    }

    @Override
    boolean packFood() {
        //Restaurant Specific Packing Standard Implementation can be provided here.
        System.out.println("Packing Food and Ensuring Items in the McDonald's order.");
        //Adding a scenario if there was a problem during Packing the food.
        //Example: Running out of Items or any other issues that leads to a problem with processing the order
        //Add any reasons of the issue related to processing the order
        return false;
    }

    @Override
    boolean orderStatus() {
        //Restaurant Specific Order Statuses Implementation can be provided here.
        System.out.println("Order Ready!!! It is out for Delivery!!! Enjoy McDonald's Food.");
        return true;
    }
}
