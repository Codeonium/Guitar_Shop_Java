package com.codeclan.example.guitarShop;

import com.codeclan.example.guitarShop.behaviours.ISell;
import com.codeclan.example.guitarShop.instruments.Flute;
import com.codeclan.example.guitarShop.instruments.InstrumentType;
import com.codeclan.example.guitarShop.instruments.Violin;
import com.codeclan.example.guitarShop.stuff.Book;
import com.codeclan.example.guitarShop.stuff.Valves;
import com.codeclan.example.guitarShop.stuff.StuffType;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

public class GuitarShopApplicationTests {

	GuitarShopApplication shop;
	ISell book;
	ISell metalString;
	ISell flute;
	ISell violin;



	@Before
	public void setUp() {
		book = new Book(StuffType.BOOKS, "Obama Green", "Reciclyed", 10.10);
		metalString = new Valves(StuffType.STRINGS, "Silver", "metal", 2.50);
		violin = new Violin(InstrumentType.VIOLIN, "German", "Black Wood",150.00);
		flute = new Flute(InstrumentType.FLUTE,"Ghuring","Obama Green", 20.00);
		shop = new GuitarShopApplication("Books and Stuff");
		shop.addItem(book);
		shop.addItem(metalString);
		shop.addItem(violin);
		shop.addItem(flute);
	}

	@Test
	public void hasName() {
		assertEquals("Books and Stuff", shop.getName());
	}

	@Test
	public void canAddItemToStock() {
		shop.addItem(book);
		shop.addItem(metalString);
		assertEquals(6, shop.countStock());
	}

	@Test
	public void canRemoveItemFromStock() {
		shop.addItem(book);
		shop.addItem(metalString);
		shop.removeItem(metalString);
		assertEquals(5, shop.countStock());
	}

	@Test
	public void canSellItem() {
		shop.sellItem(book);
		assertEquals(3, shop.countStock());
		assertEquals(1, shop.countItemsSold());
		assertEquals(20.2, book.sell(), 0.1);
		assertEquals(20.2, shop.getTill(), 0.1);
	}

	@Test
	public void canCalculateProfit() {
		shop.sellItem(flute);
		shop.sellItem(metalString);
		assertEquals(57.5, shop.profit(), 0.1);
		assertEquals(30, flute.sell(), 0.1);
		assertEquals(10, flute.profit(), 0.1);
		assertEquals(47.5, metalString.profit(), 0.1);
		assertEquals(80, shop.getTill(), 0.1);
		assertEquals(2, shop.countItemsSold());
	}

	@Test
	public void canCalculatePotentialProfit() {
		assertEquals(517.6, shop.potentialProfit(), 0.1);
		assertEquals(10.10, book.profit(), 0.1);
		assertEquals(10.0, flute.profit(), 0.1);
		assertEquals(47.5, metalString.profit(), 0.1);
		assertEquals(450, violin.profit(), 0.1);
	}
}
