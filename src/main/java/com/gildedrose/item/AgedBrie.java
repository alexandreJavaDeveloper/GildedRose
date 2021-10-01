package com.gildedrose.item;

import com.gildedrose.custom.ItemCustom;

public class AgedBrie extends ItemCustom {

    private static final String AGED_BRIE = "Aged Brie";

    public AgedBrie(int sellIn, int quality) {
        super(AGED_BRIE, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        sellIn--;

        if (quality >= 50) {
            return;
        }

        quality++;

        if (sellIn < 0 && quality < 50) {
            quality++;
        }
    }
}
