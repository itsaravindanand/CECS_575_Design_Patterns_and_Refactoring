package com.neighborhoodfresh;

public abstract class QualityChangingItem {
    /*Common operation such as increment quality, decrement quality, decrement sellin*/
    /*Abstract method updateQuality() which has to be defined by the extending class of individual item types*/
    final Item item;
    //The Quality value range is defined using QUALITY_MIN and QUALITY_MAX and it provides ease to update the range in future.
    public static final int QUALITY_MIN = 0;
    public static final int QUALITY_MAX = 50;

    public QualityChangingItem(Item item) {
        this.item = item;
    }

    void incrementQuality() {
        if (item.quality < QUALITY_MAX) {
            item.quality = item.quality + 1;
        }
    }

    void decrementQuality() {
        if (item.quality > QUALITY_MIN) {
            item.quality = item.quality - 1;
        }
    }

    void decrementSellIn() {
        item.sellIn = item.sellIn - 1;
    }

    abstract void updateQuality();
}
