package com.gildedrose.item;

import com.gildedrose.custom.ItemCustom;
import com.gildedrose.enumeration.GildedRoseEnum;

public class BackstageItem extends ItemCustom {

    public BackstageItem(int sellIn, int quality) {
        super(GildedRoseEnum.BACKSTAGE_PASSES, sellIn, quality);
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
