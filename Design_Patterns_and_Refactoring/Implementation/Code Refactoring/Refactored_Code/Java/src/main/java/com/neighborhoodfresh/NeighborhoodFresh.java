package com.neighborhoodfresh;

class NeighborhoodFresh {
    //The class with updateQuality() method which had the refactoring code.
    Item[] items;

    public NeighborhoodFresh(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        //Enhancing for loop with for each
        for (Item item : items) {
            // Assigning current item to a variable to perform the respective item type operation
            QualityChangingItem qualityChangingItem = ItemTypeAccess.createItem(item);
            qualityChangingItem.updateQuality();
        }
    }
}
