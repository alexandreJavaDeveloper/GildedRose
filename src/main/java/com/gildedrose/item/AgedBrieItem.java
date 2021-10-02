package com.gildedrose.item;

import com.gildedrose.custom.ItemCustom;

public class AgedBrieItem extends ItemCustom {

    private static final String AGED_BRIE = "Aged Brie";

    public AgedBrieItem(int sellIn, int quality) {
        super(AGED_BRIE, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        this.decreaseDaysRemaining();

        this.increaseQuality();

        if (this.sellIn < 0) {
            this.increaseQuality();
        }
    }
}
