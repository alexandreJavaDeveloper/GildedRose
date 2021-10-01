package com.gildedrose;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void updateQuality() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("foo", 0, 0));
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.items.get(0).name);
        assertEquals(0, app.items.get(0).quality);
        assertEquals(-1, app.items.get(0).sellIn);
    }

    @Test
    void updateQualityTwice() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("foo", 0, 0));
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        app.updateQuality();
        assertEquals("foo", app.items.get(0).name);
        assertEquals(0, app.items.get(0).quality);
        assertEquals(-2, app.items.get(0).sellIn);
    }

    @Test
    void updateQualityWithThreeItems() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("foo", 0, 0));
        items.add(new Item("foo2", 0, 0));
        items.add(new Item("foo3", 0, 0));
        
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        app.updateQuality();
        assertEquals("foo", app.items.get(0).name);
        assertEquals(0, app.items.get(0).quality);
        assertEquals(-2, app.items.get(0).sellIn);

        assertEquals("foo2", app.items.get(1).name);
        assertEquals(0, app.items.get(1).quality);
        assertEquals(-2, app.items.get(1).sellIn);

        assertEquals("foo3", app.items.get(2).name);
        assertEquals(0, app.items.get(2).quality);
        assertEquals(-2, app.items.get(2).sellIn);
    }

    @Test
    void updateQualityAsAgedBrie() {
        List<Item> items = new ArrayList<>();
        items.add(new Item(GildedRose.AGED_BRIE, 0, 0));
        
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        app.updateQuality();
        assertEquals(GildedRose.AGED_BRIE, app.items.get(0).name);
        assertEquals(4, app.items.get(0).quality);
        assertEquals(-2, app.items.get(0).sellIn);
    }

    @Test
    void updateQualityAsAgedBrieWithQuality() {
        List<Item> items = new ArrayList<>();
        items.add(new Item(GildedRose.AGED_BRIE, 1, 10));
        
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        app.updateQuality();
        assertEquals(GildedRose.AGED_BRIE, app.items.get(0).name);
        assertEquals(13, app.items.get(0).quality);
        assertEquals(-1, app.items.get(0).sellIn);
    }

    @Test
    void updateQualityAsSulfuras() {
        List<Item> items = new ArrayList<>();
        items.add(new Item(GildedRose.SULFURAS_HAND_OF_RAGNAROS, 0, 0));
        
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        app.updateQuality();
        assertEquals(GildedRose.SULFURAS_HAND_OF_RAGNAROS, app.items.get(0).name);
        assertEquals(0, app.items.get(0).quality);
        assertEquals(0, app.items.get(0).sellIn);
    }

    @Test
    void updateQualityAsSulfurasWithQuality() {
        List<Item> items = new ArrayList<>();
        items.add(new Item(GildedRose.SULFURAS_HAND_OF_RAGNAROS, 2, 11));
        
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        app.updateQuality();
        assertEquals(GildedRose.SULFURAS_HAND_OF_RAGNAROS, app.items.get(0).name);
        assertEquals(11, app.items.get(0).quality);
        assertEquals(2, app.items.get(0).sellIn);
    }

    @Test
    void updateQualityAsBackstage() {
        List<Item> items = new ArrayList<>();
        items.add(new Item(GildedRose.BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT, 0, 0));
        
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        app.updateQuality();
        assertEquals(GildedRose.BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT, app.items.get(0).name);
        assertEquals(0, app.items.get(0).quality);
        assertEquals(-2, app.items.get(0).sellIn);
    }

    @Test
    void updateQualityAsBackstageWithQuality() {
        List<Item> items = new ArrayList<>();
        items.add(new Item(GildedRose.BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT, 3, 20));
        
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        app.updateQuality();
        assertEquals(GildedRose.BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT, app.items.get(0).name);
        assertEquals(26, app.items.get(0).quality);
        assertEquals(1, app.items.get(0).sellIn);
    }

    @Test
    void updateQualityAsBackstageWithQuality_11() {
        List<Item> items = new ArrayList<>();
        items.add(new Item(GildedRose.BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT, 2, 11));
        
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        app.updateQuality();
        assertEquals(GildedRose.BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT, app.items.get(0).name);
        assertEquals(17, app.items.get(0).quality);
        assertEquals(0, app.items.get(0).sellIn);
    }
}
