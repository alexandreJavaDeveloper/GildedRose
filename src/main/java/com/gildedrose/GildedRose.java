package com.gildedrose;

import com.gildedrose.custom.ItemCustom;

import java.util.List;

class GildedRose {

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
