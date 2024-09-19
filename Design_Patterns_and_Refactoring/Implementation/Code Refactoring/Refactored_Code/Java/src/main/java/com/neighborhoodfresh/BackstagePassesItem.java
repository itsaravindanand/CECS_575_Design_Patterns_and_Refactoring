package com.neighborhoodfresh;

public class BackstagePassesItem extends QualityChangingItem {
    /*Backstage passes to a TAFKAL80ETC concert item operations*/
    public BackstagePassesItem(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        decrementSellIn();
        if (item.sellIn < 0) {
            item.quality = 0;
        } else {
            incrementQuality();
            if (item.sellIn < 10) {
                incrementQuality();
            }
            if (item.sellIn < 5) {
                incrementQuality();
            }
        }
    }
}
