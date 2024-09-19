package com.neighborhoodfresh;

public class ConjuredItem extends QualityChangingItem {
    /*Conjured item operations*/
    public ConjuredItem(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        decrementQuality();
        decrementQuality();
        item.sellIn = item.sellIn - 1;
        if (item.sellIn < 0) {
            decrementQuality();
            decrementQuality();
        }
    }
}
