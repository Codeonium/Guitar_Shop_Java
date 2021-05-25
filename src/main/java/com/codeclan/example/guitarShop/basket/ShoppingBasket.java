package com.codeclan.example.guitarShop.basket;

import com.codeclan.example.guitarShop.behaviours.ISell;

import java.util.ArrayList;

public class ShoppingBasket implements ISell {

    protected ArrayList<ISell> basket;

    public ShoppingBasket() {
        this.basket = new ArrayList<>();
    }

    public double sell() {
        double itemsValue = 0;
        for (ISell item : basket) {
            itemsValue += item.sell();
        }
        return itemsValue;
    }

    public double profit() {
        double kitMarkup = 0;
        for (ISell item : basket) {
            kitMarkup += item.profit();
        }
        return kitMarkup;
    }

    public int countItems() {
        return basket.size();
    }

    public void addItem(ISell item) {
        basket.add(item);
    }
}
