package com.gildedrose.item;

import com.gildedrose.custom.ItemCustom;

public class SulfurasItem extends ItemCustom {

    private static final String SULFURAS = "Sulfuras, Hand of Ragnaros";

    public SulfurasItem(int sellIn, int quality) {
        super(SULFURAS, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        // Sulfuras, being a legendary item, never has to be sold or decreases in Quality
    }
}
