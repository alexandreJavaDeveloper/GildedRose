package com.gildedrose.custom;

import com.gildedrose.Item;

/**
 * As we cannot change Item class, we needed to class this extension class.
 * Another alternative would be to change Item class to implement an interface that could have updateQuality method.
 * Then, each sub-class of Item (extends Item) would automatically Override updateQuality method and implements itself
 * logic. Then this class is no longer necessary, and just an interface would be added.
 */
public abstract class ItemCustom extends Item {

    public ItemCustom(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    abstract public void updateQuality();
}
