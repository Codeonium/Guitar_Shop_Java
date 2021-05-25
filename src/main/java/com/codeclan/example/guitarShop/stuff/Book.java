package com.codeclan.example.guitarShop.stuff;

public class Book extends Stuff {

    public Book(StuffType type, String colour, String material, double costPrice) {
        super(type, colour, material, costPrice);
    }


    public double sell() {
        double profiting = getCostPrice() * 2;
        return setSellPrice(profiting);
    }
}
