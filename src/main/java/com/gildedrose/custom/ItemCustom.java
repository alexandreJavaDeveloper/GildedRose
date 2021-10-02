package com.gildedrose.custom;

import com.gildedrose.Item;

/**
 * As we cannot change Item class, we needed to class this extension class.
 * Another alternative would be to change Item class to implement an interface that could have updateQuality method.
 * Then, each sub-class of Item (extends Item) would automatically Override updateQuality method and implements itself
 * logic. Then this class is no longer necessary, and just an interface would be added.
 * The protected methods created here could be added in Item class.
 */
public abstract class ItemCustom extends Item {

    public ItemCustom(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    protected void increaseQuality() {
        if (this.quality < 50) {
            this.quality++;
        }
    }

    protected void decreaseQuality() {
        if (this.quality > 0) {
            this.quality--;
        }
    }

    protected void decreaseDaysRemaining() {
        this.sellIn--;
    }

    abstract public void updateQuality();
}
