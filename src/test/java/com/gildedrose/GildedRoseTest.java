package com.gildedrose;

import com.gildedrose.custom.ItemCustom;
import com.gildedrose.item.AgedBrieItem;
import com.gildedrose.item.BackstageItem;
import com.gildedrose.enumeration.GildedRoseEnum;
import com.gildedrose.item.SulfurasItem;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void updateQualityAsAgedBrie() {
        List<ItemCustom> itemCustoms = new ArrayList<>();
        itemCustoms.add(new AgedBrieItem(0, 0));
        
        GildedRose app = new GildedRose(itemCustoms);
        app.updateQuality();
        app.updateQuality();
        assertEquals(GildedRoseEnum.AGED_BRIE, app.itemCustoms.get(0).name);
        assertEquals(4, app.itemCustoms.get(0).quality);
        assertEquals(-2, app.itemCustoms.get(0).sellIn);
    }

    @Test
    void updateQualityAsAgedBrieWithQuality() {
        List<ItemCustom> itemCustoms = new ArrayList<>();
        itemCustoms.add(new AgedBrieItem(1, 10));
        
        GildedRose app = new GildedRose(itemCustoms);
        app.updateQuality();
        app.updateQuality();
        assertEquals(GildedRoseEnum.AGED_BRIE, app.itemCustoms.get(0).name);
        assertEquals(13, app.itemCustoms.get(0).quality);
        assertEquals(-1, app.itemCustoms.get(0).sellIn);
    }

    @Test
    void updateQualityAsSulfuras() {
        List<ItemCustom> itemCustoms = new ArrayList<>();
        itemCustoms.add(new SulfurasItem(0, 0));
        
        GildedRose app = new GildedRose(itemCustoms);
        app.updateQuality();
        app.updateQuality();
        assertEquals(GildedRoseEnum.SULFURAS, app.itemCustoms.get(0).name);
        assertEquals(0, app.itemCustoms.get(0).quality);
        assertEquals(0, app.itemCustoms.get(0).sellIn);
    }

    @Test
    void updateQualityAsSulfurasWithQuality() {
        List<ItemCustom> itemCustoms = new ArrayList<>();
        itemCustoms.add(new SulfurasItem(2, 11));
        
        GildedRose app = new GildedRose(itemCustoms);
        app.updateQuality();
        app.updateQuality();
        assertEquals(GildedRoseEnum.SULFURAS, app.itemCustoms.get(0).name);
        assertEquals(11, app.itemCustoms.get(0).quality);
        assertEquals(2, app.itemCustoms.get(0).sellIn);
    }

    @Test
    void updateQualityAsBackstage() {
        List<ItemCustom> itemCustoms = new ArrayList<>();
        itemCustoms.add(new BackstageItem(0, 0));
        
        GildedRose app = new GildedRose(itemCustoms);
        app.updateQuality();
        app.updateQuality();
        assertEquals(GildedRoseEnum.BACKSTAGE_PASSES, app.itemCustoms.get(0).name);
        assertEquals(0, app.itemCustoms.get(0).quality);
        assertEquals(-2, app.itemCustoms.get(0).sellIn);
    }

    @Test
    void updateQualityAsBackstageWithQuality() {
        List<ItemCustom> itemCustoms = new ArrayList<>();
        itemCustoms.add(new BackstageItem(3, 20));
        
        GildedRose app = new GildedRose(itemCustoms);
        app.updateQuality();
        app.updateQuality();
        assertEquals(GildedRoseEnum.BACKSTAGE_PASSES, app.itemCustoms.get(0).name);
        assertEquals(26, app.itemCustoms.get(0).quality);
        assertEquals(1, app.itemCustoms.get(0).sellIn);
    }

    @Test
    void updateQualityAsBackstageWithQuality_11() {
        List<ItemCustom> itemCustoms = new ArrayList<>();
        itemCustoms.add(new BackstageItem(2, 11));
        
        GildedRose app = new GildedRose(itemCustoms);
        app.updateQuality();
        app.updateQuality();
        assertEquals(GildedRoseEnum.BACKSTAGE_PASSES, app.itemCustoms.get(0).name);
        assertEquals(17, app.itemCustoms.get(0).quality);
        assertEquals(0, app.itemCustoms.get(0).sellIn);
    }

    @ParameterizedTest
    @EnumSource(value = GildedRoseEnum.class, names = {"GUEST", "JOB", "SYSTEM"})
    void updateQualityAsBackstageWithQuality_AsTryWithMoreThan50Quality() {
        List<ItemCustom> itemCustoms = new ArrayList<>();
        itemCustoms.add(new BackstageItem(5, 49));

        GildedRose app = new GildedRose(itemCustoms);
        app.updateQuality();
        app.updateQuality();
        assertEquals(GildedRoseEnum.BACKSTAGE_PASSES, app.itemCustoms.get(0).name);
        assertEquals(50, app.itemCustoms.get(0).quality); // should remain 50
        assertEquals(3, app.itemCustoms.get(0).sellIn);
    }
}
