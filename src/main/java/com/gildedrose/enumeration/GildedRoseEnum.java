package com.gildedrose.enumeration;

public enum GildedRoseEnum {
    AGED_BRIE("Aged Brie"),
    SULFURAS("Sulfuras, Hand of Ragnaros"),
    BACKSTAGE_PASSES("Backstage passes to a TAFKAL80ETC concert"),
    CONJURED("Conjured");

    private final String value;

    GildedRoseEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
