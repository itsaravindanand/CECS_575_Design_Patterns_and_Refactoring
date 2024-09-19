package com.neighborhoodfresh;

public class DefaultItem extends QualityChangingItem {
    /*Default item operations*/

    public DefaultItem(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        decrementQuality();
        decrementSellIn();
        if (item.sellIn < 0) {
            decrementQuality();
        }
    }
}
