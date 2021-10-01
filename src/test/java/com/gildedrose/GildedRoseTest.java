package com.gildedrose;

import com.gildedrose.custom.ItemCustom;
import com.gildedrose.item.AgedBrie;
import com.gildedrose.item.BackstagePasses;
import com.gildedrose.item.Sulfuras;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void updateQualityAsAgedBrie() {
        List<ItemCustom> itemCustoms = new ArrayList<>();
        itemCustoms.add(new AgedBrie(0, 0));
        
        GildedRose app = new GildedRose(itemCustoms);
        app.updateQuality();
        app.updateQuality();
        assertEquals(GildedRose.AGED_BRIE, app.itemCustoms.get(0).name);
        assertEquals(4, app.itemCustoms.get(0).quality);
        assertEquals(-2, app.itemCustoms.get(0).sellIn);
    }

    @Test
    void updateQualityAsAgedBrieWithQuality() {
        List<ItemCustom> itemCustoms = new ArrayList<>();
        itemCustoms.add(new AgedBrie(1, 10));
        
        GildedRose app = new GildedRose(itemCustoms);
        app.updateQuality();
        app.updateQuality();
        assertEquals(GildedRose.AGED_BRIE, app.itemCustoms.get(0).name);
        assertEquals(13, app.itemCustoms.get(0).quality);
        assertEquals(-1, app.itemCustoms.get(0).sellIn);
    }

    @Test
    void updateQualityAsSulfuras() {
        List<ItemCustom> itemCustoms = new ArrayList<>();
        itemCustoms.add(new Sulfuras(0, 0));
        
        GildedRose app = new GildedRose(itemCustoms);
        app.updateQuality();
        app.updateQuality();
        assertEquals(GildedRose.SULFURAS_HAND_OF_RAGNAROS, app.itemCustoms.get(0).name);
        assertEquals(0, app.itemCustoms.get(0).quality);
        assertEquals(0, app.itemCustoms.get(0).sellIn);
    }

    @Test
    void updateQualityAsSulfurasWithQuality() {
        List<ItemCustom> itemCustoms = new ArrayList<>();
        itemCustoms.add(new Sulfuras(2, 11));
        
        GildedRose app = new GildedRose(itemCustoms);
        app.updateQuality();
        app.updateQuality();
        assertEquals(GildedRose.SULFURAS_HAND_OF_RAGNAROS, app.itemCustoms.get(0).name);
        assertEquals(11, app.itemCustoms.get(0).quality);
        assertEquals(2, app.itemCustoms.get(0).sellIn);
    }

    @Test
    void updateQualityAsBackstage() {
        List<ItemCustom> itemCustoms = new ArrayList<>();
        itemCustoms.add(new BackstagePasses(0, 0));
        
        GildedRose app = new GildedRose(itemCustoms);
        app.updateQuality();
        app.updateQuality();
        assertEquals(GildedRose.BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT, app.itemCustoms.get(0).name);
        assertEquals(0, app.itemCustoms.get(0).quality);
        assertEquals(-2, app.itemCustoms.get(0).sellIn);
    }

    @Test
    void updateQualityAsBackstageWithQuality() {
        List<ItemCustom> itemCustoms = new ArrayList<>();
        itemCustoms.add(new BackstagePasses(3, 20));
        
        GildedRose app = new GildedRose(itemCustoms);
        app.updateQuality();
        app.updateQuality();
        assertEquals(GildedRose.BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT, app.itemCustoms.get(0).name);
        assertEquals(26, app.itemCustoms.get(0).quality);
        assertEquals(1, app.itemCustoms.get(0).sellIn);
    }

    @Test
    void updateQualityAsBackstageWithQuality_11() {
        List<ItemCustom> itemCustoms = new ArrayList<>();
        itemCustoms.add(new BackstagePasses(2, 11));
        
        GildedRose app = new GildedRose(itemCustoms);
        app.updateQuality();
        app.updateQuality();
        assertEquals(GildedRose.BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT, app.itemCustoms.get(0).name);
        assertEquals(17, app.itemCustoms.get(0).quality);
        assertEquals(0, app.itemCustoms.get(0).sellIn);
    }
}
