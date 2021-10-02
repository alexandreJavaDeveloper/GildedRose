package com.gildedrose.item;

import com.gildedrose.custom.ItemCustom;

public class BackstageItem extends ItemCustom {

    private static final String BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";

    public BackstageItem(int sellIn, int quality) {
        super(BACKSTAGE_PASSES, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        this.decreaseDaysRemaining();

        this.increaseQuality();

        if (this.sellIn < 11) {
            this.increaseQuality();
        }

        if (this.sellIn < 6) {
            this.increaseQuality();
        }

        if (this.sellIn < 0) {
            this.quality = 0;
        }
    }
}
