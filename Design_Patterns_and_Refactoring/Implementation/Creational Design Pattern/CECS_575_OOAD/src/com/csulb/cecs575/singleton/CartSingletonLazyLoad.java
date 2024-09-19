package com.csulb.cecs575.singleton;

import com.csulb.cecs575.cart.CartRepository;
import com.csulb.cecs575.cart.ItemDetails;
import com.csulb.cecs575.cart.ItemList;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

//Lazy Initialization
public class CartSingletonLazyLoad {
    private static CartSingletonLazyLoad singleInstance = null;
    private final String description;
    private final Map<UUID, ItemList> itemsList;
    private final CartRepository cartRepository;

    private CartSingletonLazyLoad(CartRepository cartRepository) {
        description = "Cart - Add items";
        itemsList = new HashMap<>();
        this.cartRepository = Objects.requireNonNull(cartRepository);
    }
    public void addItem(UUID itemId, int count) {
        Objects.requireNonNull(itemId);
        validateCount(count);
        if (!itemsList.containsKey(itemId)) {
            ItemDetails itemDetails = cartRepository.getItemDetails(itemId);
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
        if (itemList.getQuantity() <= count)
            itemsList.remove(itemId);
        else
            itemsList.get(itemId).decrementQuantity(count);
    }
    private void validateCount(int count) {
        if (count <= 0)
            throw new IllegalArgumentException("Item count should be a valid positive integer, not " + count);
    }
    public double calculateTotal() {
        double total = 0;
        for (ItemList itemList : itemsList.values())
            total += itemList.subTotal();
        return total;
    }
    public void clearCart() {
        itemsList.clear();
    }
    public void printMessage() {
        System.out.println(description + " in object " + this.hashCode());
    }
    public static CartSingletonLazyLoad getInstance() {
        if (singleInstance == null) {
            singleInstance = new CartSingletonLazyLoad(new CartRepository());
            System.out.println("Lazy loading the singleton object for the first time");
        }
        return singleInstance;
    }
    public static void main(String[] args) {
        CartSingletonLazyLoad cart1 = CartSingletonLazyLoad.getInstance();
        CartSingletonLazyLoad cart2 = CartSingletonLazyLoad.getInstance();
        if (cart1 == cart2) {
            System.out.println("Both the objects are same");
            cart1.printMessage();
            cart2.printMessage();
        }
    }
}