package com.gildedrose.item;

import com.gildedrose.custom.ItemCustom;

public class ConjuredItem extends ItemCustom {

    public ConjuredItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        this.decreaseQuality();
        this.decreaseQuality();
    }
}
