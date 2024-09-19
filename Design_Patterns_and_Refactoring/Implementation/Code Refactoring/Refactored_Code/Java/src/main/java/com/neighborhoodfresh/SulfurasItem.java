package com.neighborhoodfresh;

public class SulfurasItem extends QualityChangingItem {
    /*Sulfuras, Hand of Ragnaros item operations*/
    public SulfurasItem(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        //Sulfuras being a legendary item, never has to be sold or decrease in quality value.
    }
}
