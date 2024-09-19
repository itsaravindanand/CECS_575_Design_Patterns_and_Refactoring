package com.csulb.cecs575.template;

abstract class ProcessOrder {
    /* Template Method Class */
    public final void orderProcessingPhases() {
        boolean successStateOrderProcessing = startOrderProcessing();
        //Checking if startOrderProcessing was successful
        if (!successStateOrderProcessing) {
            problemProcessing();
            return;
        }
        boolean successPreparedFood = prepareFood();
        //Checking if the food preparation was successful
        if (!successPreparedFood) {
            problemProcessing();
            return;
        }
        boolean successPackFood = packFood();
        //Checking if the food packing was successful
        if (!successPackFood) {
            problemProcessing();
            return;
        }
        boolean successOrderStatus = orderStatus();
        //Checking if the order status was successful
        if (!successOrderStatus) {
            problemProcessing();
            return;
        }
        boolean successCheckDeliveryStandards = checkDeliveryStandards();
        //Checking if Delivery Standards are verified successfully
        if (!successCheckDeliveryStandards) {
            problemProcessing();
        }
    }

    abstract boolean prepareFood();

    abstract boolean packFood();

    abstract boolean orderStatus();

    boolean startOrderProcessing() {
        //Any payment validation procedure can be added, if re-confirming of the payment is required
        System.out.println("Payment Successful. We started to process your order!!!");
        return true;
    }

    boolean checkDeliveryStandards() {
        //General Check on the Delivery Standards
        System.out.println("Check the Delivery Standards. Ensure Safety Measures and Hygiene of Food. Check the Body Temperature of Food Delivery Person.\n");
        return true;
    }

    void problemProcessing() {
        //Implemented when a method in the Template Method is unsuccessful
        System.out.println("Problem with Order Processing. Please Contact the Restaurant or Customer Support!");
    }
}
