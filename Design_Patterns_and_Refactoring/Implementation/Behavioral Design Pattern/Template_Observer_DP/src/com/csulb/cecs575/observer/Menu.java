package com.csulb.cecs575.observer;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

public class Menu extends Observer {
    /*A Concrete Observer Class*/
    private final Map<UUID, ItemDetails> menuList;

    public Menu() {
        menuList = new HashMap<>();
    }

    public boolean addItem(ItemDetails itemDetails) {
        Objects.requireNonNull(itemDetails);
        UUID itemId = itemDetails.getId();
        if (!menuList.containsKey(itemId)) {
            menuList.put(itemId, itemDetails);
            //attaching to the subject
            itemDetails.attach(this, itemDetails.getName());
            return true;
        }
        return false;
    }

    public boolean deleteItem(UUID itemId) {
        Objects.requireNonNull(itemId);
        if (!menuList.containsKey(itemId)) {
            return false;
        }
        menuList.remove(itemId);
        return true;
    }

    public void displayMenu() {
        System.out.println("*** Restaurant Menu ***");
        System.out.println("-----------------------");
        for (ItemDetails itemDetails : menuList.values()) {
            System.out.println("Item Name: " + itemDetails.getName() + ",  Price: " + itemDetails.getDiscountedPrice());
        }
        System.out.println("-----------------------\n");
    }

    @Override
    void updateViaObserver() {
        System.out.println("Calling the update method in the Menu observer\n");
        displayMenu();
    }

    @Override
    public String toString() {
        return "Menu";
    }
}
