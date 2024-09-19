package com.csulb.cecs575.template;

public class TemplateDP {
    public static void main(String[] args) {
        /* Objects instantiated for each restaurant to call the respective template method */
        //Object for Flaming Curry Restaurant
        ProcessOrder flamingCurryProcessor = new FlamingCurry();
        flamingCurryProcessor.orderProcessingPhases();

        //Object for Sbarro Pizza Restaurant
        ProcessOrder sbarroPizzaProcessor = new SbarroPizza();
        sbarroPizzaProcessor.orderProcessingPhases();

        //Object for McDonald's Restaurant
        ProcessOrder mcDonaldsProcessor = new McDonalds();
        mcDonaldsProcessor.orderProcessingPhases();
    }
}
