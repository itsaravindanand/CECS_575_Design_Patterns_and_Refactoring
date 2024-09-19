package com.neighborhoodfresh;

public class AgedBrieItem extends QualityChangingItem {
    /*Aged Brie item operations*/
    public AgedBrieItem(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        incrementQuality();
        decrementSellIn();
        if (item.sellIn < 0) {
            incrementQuality();
        }
    }
}
