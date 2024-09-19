package com.csulb.cecs575.observer;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

public class CreateCart extends Observer {
    /*A Concrete Observer Class*/
    private final String description;
    private final Map<UUID, ItemList> itemsList;

    public CreateCart() {
        description = "Cart - Add items";
        itemsList = new HashMap<>();
    }

    public void addItem(ItemDetails itemDetails, int count) {
        Objects.requireNonNull(itemDetails);
        validateCount(count);
        UUID itemId = itemDetails.getId();
        if (!itemsList.containsKey(itemId)) {
            //attaching to the subject
            itemDetails.attach(this, itemDetails.getName());
            itemsList.put(itemId, new ItemList(itemDetails, 0));
        }
        itemsList.get(itemId).incrementQuantity(count);
    }

    public void removeItem(UUID itemId, int count) {
        Objects.requireNonNull(itemId);
        validateCount(count);
        if (!itemsList.containsKey(itemId))
            throw new IllegalArgumentException("Item: " + itemId + " is not present int he cart");
        ItemList itemList = itemsList.get(itemId);
        if (itemList.getQuantity() <= count) itemsList.remove(itemId);
        else itemsList.get(itemId).decrementQuantity(count);
    }

    private void validateCount(int count) {
        if (count <= 0)
            throw new IllegalArgumentException("Item count should be a valid positive integer, not " + count);
    }

    public double calculateTotal() {
        //displayCart();
        double total = 0.0;
        System.out.println("*** Customer Cart ***");
        System.out.println("---------------------");
        for (ItemList itemList : itemsList.values()) {
            total += itemList.subTotal();
            System.out.println("Item Name: " + itemList.getItemDetails().getName() + ", Price: " + itemList.getItemDetails().getDiscountedPrice());
        }
        System.out.println("Current Total: " + total);
        System.out.println("---------------------\n");
        return total;
    }

    public void clearCart() {
        itemsList.clear();
    }

    public void printMessage() {
        System.out.println(description + " from object " + this.hashCode());
    }

    @Override
    public void updateViaObserver() {
        System.out.println("Calling the update method in the Cart observer\n");
        calculateTotal();
    }

    @Override
    public String toString() {
        return "Cart";
    }
}
