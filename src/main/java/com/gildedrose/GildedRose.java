package com.gildedrose;

import com.gildedrose.custom.ItemCustom;

import java.util.List;

class GildedRose {

    protected static final String AGED_BRIE = "Aged Brie";
    protected static final String SULFURAS_HAND_OF_RAGNAROS = "Sulfuras, Hand of Ragnaros";
    protected static final String BACKSTAGE_PASSES_TO_A_TAFKAL_80_ETC_CONCERT = "Backstage passes to a TAFKAL80ETC concert";
    protected final List<ItemCustom> itemCustoms;

    public GildedRose(List<ItemCustom> itemCustoms) {
        this.itemCustoms = itemCustoms;
    }

    /**
     * Updates the inventory of items.
     */
    public void updateQuality() {
        this.itemCustoms.forEach(ItemCustom::updateQuality);
    }
}
