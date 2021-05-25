package com.codeclan.example.guitarShop.stuff;

public class Valves extends Stuff {
    public Valves(StuffType type, String colour, String material, double costPrice) {
        super(type, colour, material, costPrice);
    }

    public double sell() {
        double profiting = getCostPrice() * 20;
        return setSellPrice(profiting);
    }
}
