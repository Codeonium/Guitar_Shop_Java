package com.codeclan.example.guitarShop.instruments;

import com.codeclan.example.guitarShop.behaviours.ISell;

public abstract class Instrument implements ISell {

    private InstrumentType type;
    private String make;
    private String colour;
    public double costPrice;
    public double sellPrice;

    public Instrument (InstrumentType type, String make, String colour, double costPrice) {
        this.type = type;
        this.make = make;
        this.colour = colour;
        this.costPrice = costPrice;
        this.sellPrice = 0;
    }

    public InstrumentType getType() {
        return type;
    }

    public String getMake() {
        return make;
    }

    public String getColour() {
        return colour;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public double setSellPrice(double newSellPrice) {
        return sellPrice = newSellPrice;
    }

    public double profit() {
        return sell() - costPrice;
    }
}
