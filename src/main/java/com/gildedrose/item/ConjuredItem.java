package com.gildedrose.item;

import com.gildedrose.custom.ItemCustom;
import com.gildedrose.enumeration.GildedRoseEnum;

public class ConjuredItem extends ItemCustom {

    public ConjuredItem(GildedRoseEnum gildedRoseEnum, int sellIn, int quality) {
        super(gildedRoseEnum, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        this.decreaseQuality();
        this.decreaseQuality();
    }
}
