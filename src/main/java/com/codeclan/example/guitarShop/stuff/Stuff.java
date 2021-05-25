package com.codeclan.example.guitarShop.stuff;

import com.codeclan.example.guitarShop.behaviours.ISell;

public abstract class Stuff implements ISell {

    private StuffType type;
    private String colour;
    private String material;
    public double costPrice;
    public double sellPrice;

    public Stuff(StuffType type, String colour, String material, double costPrice) {
        this.type = type;
        this.colour = colour;
        this.material = material;
        this.costPrice = costPrice;
        this.sellPrice = 0;
    }

    public StuffType getType() {
        return type;
    }

    public void setType(StuffType type) {
        this.type = type;
    }

    public String getColour() {
        return colour;
    }

    public String getMaterial() {
        return material;
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
