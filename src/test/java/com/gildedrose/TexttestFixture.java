package com.gildedrose;

import com.gildedrose.custom.ItemCustom;
import com.gildedrose.item.AgedBrieItem;
import com.gildedrose.item.BackstageItem;
import com.gildedrose.item.ConjuredItem;
import com.gildedrose.item.SulfurasItem;

import java.util.Arrays;
import java.util.List;

public class TexttestFixture {

    public static void main(String[] args) {
        System.out.println("OMGHAI!");

        List<ItemCustom> itemCustoms = Arrays.asList(new AgedBrieItem(2, 0), //
                new SulfurasItem(0, 80), //
                new SulfurasItem(-1, 80),
                new BackstageItem(15, 20),
                new BackstageItem(10, 49),
                new BackstageItem(5, 49),
                // this conjured item does not work properly yet
                new ConjuredItem(3, 6));

        GildedRose app = new GildedRose(itemCustoms);

        int days = 2;
        if (args.length > 0) {
            days = Integer.parseInt(args[0]) + 1;
        }

        for (int i = 0; i < days; i++) {
            System.out.println("-------- day " + i + " --------");
            System.out.println("name, sellIn, quality");
            for (Item item : itemCustoms) {
                System.out.println(item);
            }
            System.out.println();
            app.updateQuality();
        }
    }
}
