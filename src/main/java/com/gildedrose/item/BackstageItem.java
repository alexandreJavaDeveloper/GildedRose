package com.gildedrose.item;

import com.gildedrose.custom.ItemCustom;

public class BackstageItem extends ItemCustom {

    private static final String BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";

    public BackstageItem(int sellIn, int quality) {
        super(BACKSTAGE_PASSES, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        sellIn--;

        if (quality >= 50) {
            return;
        }

        quality++;

        if (sellIn < 11) {
            this.increaseQuality();
        }

        if (sellIn < 6) {
            this.increaseQuality();
        }

        if (sellIn < 0) {
            quality = quality - quality;
        }
    }

    private void increaseQuality() {
        quality++;
    }
}
