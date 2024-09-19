package com.neighborhoodfresh;

public class ItemTypeAccess {
    /*Object instantiation for the respective type of Item using guarded clauses*/
    public static QualityChangingItem createItem(Item item) {
        String name = item.name;
        //Returns AgedBrieItem Object for Item of Type: Aged Brie
        if (name.equals("Aged Brie")) return new AgedBrieItem(item);
        //Returns SulfurasItem Object for Item of Type: Sulfuras, Hand of Ragnaros
        if (name.equals("Sulfuras, Hand of Ragnaros")) return new SulfurasItem(item);
        //Returns BackstagePassesItem Object for Item of Type: Backstage passes to a TAFKAL80ETC concert
        if (name.equals("Backstage passes to a TAFKAL80ETC concert")) return new BackstagePassesItem(item);
        //Returns ConjuredItem Object for Item of Type: Conjured
        if (name.equals("Conjured")) return new ConjuredItem(item);
        //Returns DefaultItem Object for Item of Type: other than the above items
        return new DefaultItem(item);
    }
}
