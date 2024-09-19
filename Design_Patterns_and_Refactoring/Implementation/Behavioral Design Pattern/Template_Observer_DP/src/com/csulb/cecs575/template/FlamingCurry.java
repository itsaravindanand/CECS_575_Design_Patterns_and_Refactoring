package com.csulb.cecs575.template;

public class FlamingCurry extends ProcessOrder {
    /* Abstract Template Methods definitions for Flaming Curry Restaurant */
    @Override
    boolean prepareFood() {
        //Restaurant Specific Preparation Implementation can be provided here.
        System.out.println("Preparing Your FlamingCurry Order. Average Preparation Time: 20 Minutes...");
        return true;
    }

    @Override
    boolean packFood() {
        //Restaurant Specific Packing Standard Implementation can be provided here.
        System.out.println("Packing Food and Ensuring Items in the FlamingCurry order.");
        return true;
    }

    @Override
    boolean orderStatus() {
        //Restaurant Specific Order Statuses Implementation can be provided here.
        System.out.println("Order Ready!!! It is out for Delivery!!! Enjoy FlamingCurry's Food.");
        return true;
    }
}
