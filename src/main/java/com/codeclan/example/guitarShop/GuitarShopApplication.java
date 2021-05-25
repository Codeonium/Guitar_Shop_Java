package com.codeclan.example.guitarShop;

import com.codeclan.example.guitarShop.behaviours.ISell;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class GuitarShopApplication {

	private String name;
	protected ArrayList<ISell> stock;
	private ArrayList<ISell> itemsSold;
	private double till;

	public GuitarShopApplication(String name) {
		this.name = name;
		this.stock = new ArrayList<>();
		this.itemsSold = new ArrayList<>();
		this.till = 0;
	}

	public String getName() {
		return name;
	}

	public ArrayList<ISell> getStock() {
		return stock;
	}

	public ArrayList<ISell> getItemsSold() {
		return itemsSold;
	}

	public double getTill() {
		return till;
	}

	public int countStock() {
		return stock.size();
	}

	public int countItemsSold() {
		return itemsSold.size();
	}

	public void addItem(ISell item) {
		stock.add(item);
	}

	public void removeItem(ISell item) {
		stock.remove(item);
	}

	public void sellItem(ISell item) {
		till += item.sell();
		itemsSold.add(item);
		removeItem(item);
	}

	public double profit() {
		double sellPriceItems = 0;
		for (ISell item : this.itemsSold) {
			sellPriceItems += item.profit();
		}
		return sellPriceItems;
	}

	public double potentialProfit() {
		double sellPriceItems = 0;
		for (ISell item : this.stock) {
			sellPriceItems += item.profit();
		}
		return sellPriceItems;
	}
}
