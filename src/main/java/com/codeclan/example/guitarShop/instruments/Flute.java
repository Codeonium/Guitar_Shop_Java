package com.codeclan.example.guitarShop.instruments;

import com.codeclan.example.guitarShop.behaviours.IPlay;

public class Flute extends Instrument implements IPlay{
    public Flute(InstrumentType type, String make, String colour, double costPrice) {
        super(type, make, colour, costPrice);
    }

    public String play() {
        return "Flu Fli Flu!";
    }

    public double sell() {
        double profiting = getCostPrice() * 1.5;
        return setSellPrice(profiting);
    }
}
