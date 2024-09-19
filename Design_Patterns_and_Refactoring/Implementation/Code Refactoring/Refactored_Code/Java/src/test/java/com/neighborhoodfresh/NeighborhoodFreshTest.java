package com.neighborhoodfresh;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NeighborhoodFreshTest {
    @Test
    void oneMonthTest() {
        Item agedBrie = new Item("Aged Brie", 2, 0);
        Item backstagePasses = new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20);
        Item sulfuras = new Item("Sulfuras, Hand of Ragnaros", 0, 80);
        Item conjured = new Item("Conjured", 3, 40);
        Item healingChalice = new Item("Healing Chalice", 5, 7);
        Item wingedBoots = new Item("Winged Boots", 5, 7);
        Item[] items = new Item[]{agedBrie, sulfuras, backstagePasses, conjured, healingChalice, wingedBoots};
        NeighborhoodFresh app = new NeighborhoodFresh(items);
        int days = 30;
        for (int i = 0; i <= days; i++) {
            if (i == 0) {
                //Checking the values on the day it is added.
                //The test case values matches the input values.

                assertEquals(2, agedBrie.sellIn);
                assertEquals(0, agedBrie.quality);
                assertEquals(0, sulfuras.sellIn);
                assertEquals(80, sulfuras.quality);
                assertEquals(15, backstagePasses.sellIn);
                assertEquals(20, backstagePasses.quality);
                assertEquals(3, conjured.sellIn);
                assertEquals(40, conjured.quality);
                assertEquals(5, healingChalice.sellIn);
                assertEquals(7, healingChalice.quality);
                assertEquals(5, wingedBoots.sellIn);
                assertEquals(7, wingedBoots.quality);
            }
            if (i == 10) {
                //Checking the values on the day 11.
                //Test Case Behavior:
                //The Aged Brie item quality value is increasing twice every sellin value crossing 0.
                //The Sulfaras item quality value remain unaltered.
                //The Backstage Passes item quality value will increase thrice from next day, as sellin value goes below 5.
                //The Conjured item quality value drops by 4 every day as the sellin value is below 0
                //The Healing Chalice anda Winged Boots quality value reached 0 and quality value cannot decrement beyond 0.

                assertEquals(-8, agedBrie.sellIn);
                assertEquals(18, agedBrie.quality);
                assertEquals(0, sulfuras.sellIn);
                assertEquals(80, sulfuras.quality);
                assertEquals(5, backstagePasses.sellIn);
                assertEquals(35, backstagePasses.quality);
                assertEquals(-7, conjured.sellIn);
                assertEquals(6, conjured.quality);
                assertEquals(-5, healingChalice.sellIn);
                assertEquals(0, healingChalice.quality);
                assertEquals(-5, wingedBoots.sellIn);
                assertEquals(0, wingedBoots.quality);
            }
            if (i == 20) {
                //Checking the values on the day 21.
                //The Aged Brie item quality value is increasing twice every sellin value crossing zero.
                //The Sulfaras item quality value remain unaltered.
                //The Backstage Passes item quality value is 0, as sellin value goes below 0.
                //The Conjured item quality value reached 0.
                //The Healing Chalice and Winged Boots quality value reached 0 and quality value cannot decrement beyond 0.

                assertEquals(-18, agedBrie.sellIn);
                assertEquals(38, agedBrie.quality);
                assertEquals(0, sulfuras.sellIn);
                assertEquals(80, sulfuras.quality);
                assertEquals(-5, backstagePasses.sellIn);
                assertEquals(0, backstagePasses.quality);
                assertEquals(-17, conjured.sellIn);
                assertEquals(0, conjured.quality);
                assertEquals(-15, healingChalice.sellIn);
                assertEquals(0, healingChalice.quality);
                assertEquals(-15, wingedBoots.sellIn);
                assertEquals(0, wingedBoots.quality);
            }
            if (i == 30) {
                //Checking the values on the day 31.
                //The Aged Brie item quality value reached the maximum of 50.
                //The Sulfaras item quality value remain unaltered.
                //The Backstage Passes item quality value is 0, as sellin value goes below 0.
                //The Conjured item quality reached is 0.
                //The Healing Chalice and Winged Boots quality value reached 0 and quality value cannot decrement beyond 0.

                assertEquals(-28, agedBrie.sellIn);
                assertEquals(50, agedBrie.quality);
                assertEquals(0, sulfuras.sellIn);
                assertEquals(80, sulfuras.quality);
                assertEquals(-15, backstagePasses.sellIn);
                assertEquals(0, backstagePasses.quality);
                assertEquals(-27, conjured.sellIn);
                assertEquals(0, conjured.quality);
                assertEquals(-25, healingChalice.sellIn);
                assertEquals(0, healingChalice.quality);
                assertEquals(-25, wingedBoots.sellIn);
                assertEquals(0, wingedBoots.quality);
            }
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

