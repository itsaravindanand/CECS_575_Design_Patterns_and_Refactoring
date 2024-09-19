package com.neighborhoodfresh;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NeighborhoodFreshTest {

    @Test
    void foo() {
        Item agedBrie = new Item("Aged Brie", 2, 0);
        Item backstagePasses = new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20);
        Item sulfuras = new Item("Sulfuras, Hand of Ragnaros", 0, 80);
        //Item conjured = new Item("Conjured", 3, 40);
        Item healingChalice = new Item("Healing Chalice", 5, 7);
        Item wingedBoots = new Item("Winged Boots", 5, 7);

        Item[] items = new Item[]{
            agedBrie,
            sulfuras,
            backstagePasses,
            //conjured,
            healingChalice,
            wingedBoots
        };
        //new Item("Backstage passes", 10, 49),
        //new Item("Backstage passes", 5, 49),
        // this conjured item does not work properly yet
        NeighborhoodFresh app = new NeighborhoodFresh(items);
        int days = 30;
        for (int i = 0; i <= days; i++) {
            System.out.println("-------- day " + i + " --------");
            System.out.println("Name, SellIn, Quality");
            for (Item item : items) {
                System.out.println(item);
            }
            System.out.println();
            app.updateQuality();
        }
    }
}
