package com.gildedrose.item;

import com.gildedrose.custom.ItemCustom;
import com.gildedrose.enumeration.GildedRoseEnum;

public class SulfurasItem extends ItemCustom {

    public SulfurasItem(int sellIn, int quality) {
        super(GildedRoseEnum.SULFURAS, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        // Sulfuras, being a legendary item, never has to be sold or decreases in Quality
    }
}
