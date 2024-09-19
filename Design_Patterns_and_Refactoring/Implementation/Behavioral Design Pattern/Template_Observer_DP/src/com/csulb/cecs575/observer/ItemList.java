package com.csulb.cecs575.observer;

import java.util.Objects;

public class ItemList {
    private final ItemDetails itemDetails;
    private int quantity;

    public ItemList(ItemDetails itemDetails, int quantity) {
        this.itemDetails = Objects.requireNonNull(itemDetails);
        this.quantity = quantity;
    }

    public double subTotal() {
        return itemDetails.getDiscountedPrice() * quantity;
    }

    public void incrementQuantity(int count) {
        quantity += count;
    }

    public void decrementQuantity(int count) {
        quantity -= count;
    }

    public ItemDetails getItemDetails() {
        return itemDetails;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


}
