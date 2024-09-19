package com.csulb.cecs575.singleton;

import com.csulb.cecs575.cart.CartRepository;
import com.csulb.cecs575.cart.ItemDetails;
import com.csulb.cecs575.cart.ItemList;

import java.util.*;

public class CartSingleton {
    private static final CartSingleton SINGLE_INSTANCE = new CartSingleton(new CartRepository());
    private final String description;
    private final Map<UUID, ItemList> itemsList;
    private final CartRepository cartRepository;

    private CartSingleton(CartRepository cartRepository) {
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
            throw new IllegalArgumentException("Item: " + itemId + " is not present in the cart");
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
    public static CartSingleton getInstance() {
        return SINGLE_INSTANCE;
    }
    public static void main(String[] args) {
        CartSingleton cart1 = CartSingleton.getInstance();
        CartSingleton cart2 = CartSingleton.getInstance();
        if (cart1 == cart2) {
            System.out.println("Singleton Implementation");
            System.out.println("Both the objects are same");
            cart1.printMessage();
            cart2.printMessage();
        }
    }
}
