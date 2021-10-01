package com.gildedrose.item;

import com.gildedrose.custom.ItemCustom;

public class Sulfuras extends ItemCustom {

    private static final String SULFURAS = "Sulfuras, Hand of Ragnaros";

    public Sulfuras(int sellIn, int quality) {
        super(SULFURAS, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        if (quality >= 50) {
            return;
        }

    }
}
