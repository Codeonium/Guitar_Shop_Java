package com.codeclan.example.guitarShop.instruments;

import com.codeclan.example.guitarShop.behaviours.IPlay;

public class Violin extends Instrument implements IPlay {
    public Violin(InstrumentType type, String make, String colour, double costPrice) {
        super(type, make, colour, costPrice);
    }
    public String play() {
        return "flin fling flingaflung";
    }

    public double sell() {
        double profiting = getCostPrice() * 4;
        return setSellPrice(profiting);
    }
}
