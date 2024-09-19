package com.csulb.cecs575.template;

public class SbarroPizza extends ProcessOrder {
    /* Abstract Template Methods definitions for Sbarro Pizza Restaurant */
    @Override
    boolean prepareFood() {
        //Restaurant Specific Preparation Implementation can be provided here.
        System.out.println("Preparing Your SBarro Order. Average Preparation Time: 15 Minutes...");
        return true;
    }

    @Override
    boolean packFood() {
        //Restaurant Specific Packing Standard Implementation can be provided here.
        System.out.println("Packing Food and Ensuring Items in the SBarro order.");
        return true;
    }

    boolean orderStatus() {
        //Restaurant Specific Order Statuses Implementation can be provided here.
        System.out.println("Order Ready!!! It is out for Delivery!!! Enjoy SBarro's Food.");
        return true;
    }
}
