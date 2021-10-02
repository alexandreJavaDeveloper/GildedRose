package com.gildedrose.item;

import com.gildedrose.custom.ItemCustom;
import com.gildedrose.enumeration.GildedRoseEnum;

public class AgedBrieItem extends ItemCustom {

    public AgedBrieItem(int sellIn, int quality) {
        super(GildedRoseEnum.AGED_BRIE, sellIn, quality);
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
