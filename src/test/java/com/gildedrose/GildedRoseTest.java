package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void updateQuality() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
        assertEquals(0, app.items[0].quality);
        assertEquals(-1, app.items[0].sellIn);
    }

    @Test
    void updateQualityTwice() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
        assertEquals(0, app.items[0].quality);
        assertEquals(-2, app.items[0].sellIn);
    }

    @Test
    void updateQualityWithThreeItems() {
        Item[] items = new Item[] { new Item("foo", 0, 0),
                new Item("foo2", 0, 0),
                new Item("foo3", 15, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
        assertEquals(0, app.items[0].quality);
        assertEquals(-2, app.items[0].sellIn);

        assertEquals("foo2", app.items[1].name);
        assertEquals(0, app.items[1].quality);
        assertEquals(-2, app.items[1].sellIn);

        assertEquals("foo3", app.items[2].name);
        assertEquals(8, app.items[2].quality);
        assertEquals(13, app.items[2].sellIn);
    }

    @Test
    void updateQualityAsAgedBrie() {
        Item[] items = new Item[] { new Item(GildedRose.AGED_BRIE, 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        app.updateQuality();
        assertEquals(GildedRose.AGED_BRIE, app.items[0].name);
        assertEquals(4, app.items[0].quality);
        assertEquals(-2, app.items[0].sellIn);
    }

    @Test
    void updateQualityAsAgedBrieWithQuality() {
        Item[] items = new Item[] { new Item(GildedRose.AGED_BRIE, 1, 10) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        app.updateQuality();
        assertEquals(GildedRose.AGED_BRIE, app.items[0].name);
        assertEquals(13, app.items[0].quality);
        assertEquals(-1, app.items[0].sellIn);
    }

    @Test
    void updateQualityAsSulfuras() {
        Item[] items = new Item[] { new Item(GildedRose.SULFURAS_HAND_OF_RAGNAROS, 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        app.updateQuality();
        assertEquals(GildedRose.SULFURAS_HAND_OF_RAGNAROS, app.items[0].name);
        assertEquals(0, app.items[0].quality);
        assertEquals(0, app.items[0].sellIn);
    }

    @Test
    void updateQualityAsSulfurasWithQuality() {
        Item[] items = new Item[] { new Item(GildedRose.SULFURAS_HAND_OF_RAGNAROS, 2, 11) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        app.updateQuality();
        assertEquals(GildedRose.SULFURAS_HAND_OF_RAGNAROS, app.items[0].name);
        assertEquals(11, app.items[0].quality);
        assertEquals(2, app.items[0].sellIn);
    }

    @Test
    void updateQualityAsBackstage() {
        Item[] items = new Item[] { new Item(GildedRose.BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT, 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        app.updateQuality();
        assertEquals(GildedRose.BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT, app.items[0].name);
        assertEquals(0, app.items[0].quality);
        assertEquals(-2, app.items[0].sellIn);
    }

    @Test
    void updateQualityAsBackstageWithQuality() {
        Item[] items = new Item[] { new Item(GildedRose.BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT, 3, 20) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        app.updateQuality();
        assertEquals(GildedRose.BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT, app.items[0].name);
        assertEquals(26, app.items[0].quality);
        assertEquals(1, app.items[0].sellIn);
    }
}
