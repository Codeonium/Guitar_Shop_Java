package com.codeclan.example.guitarShop;
import com.codeclan.example.guitarShop.basket.ShoppingBasket;
import com.codeclan.example.guitarShop.behaviours.ISell;
import com.codeclan.example.guitarShop.instruments.Flute;
import com.codeclan.example.guitarShop.instruments.InstrumentType;
import com.codeclan.example.guitarShop.instruments.Violin;
import com.codeclan.example.guitarShop.stuff.Book;
import com.codeclan.example.guitarShop.stuff.StuffType;
import com.codeclan.example.guitarShop.stuff.Valves;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BasketTest {

    ShoppingBasket kit;
    ISell book;
    ISell metalString;
    ISell flute;
    ISell violin;

    @Before
    public void before() {
        book = new Book(StuffType.BOOKS, "Obama Green", "Reciclyed", 10.10);
        metalString = new Valves(StuffType.STRINGS, "Silver", "metal", 2.50);
        violin = new Violin(InstrumentType.VIOLIN, "German", "Black Wood",150.00);
        flute = new Flute(InstrumentType.FLUTE,"Ghuring","Obama Green", 20.00);
        kit = new ShoppingBasket();
        kit.addItem(book);
        kit.addItem(violin);
        kit.addItem(metalString);
        kit.addItem(flute);
    }

    @Test
    public void canAddItem() {
        kit.addItem(book);
        assertEquals(5, kit.countItems());
    }

    @Test
    public void hasPrice() {
        assertEquals(700.2, kit.sell(), 0.1);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(517.6, kit.profit(), 0.1);
    }

}