package com.codeclan.example.guitarShop;

import com.codeclan.example.guitarShop.stuff.Book;
import com.codeclan.example.guitarShop.stuff.StuffType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

    public class BookTest {

        Book book;

        @Before
        public void before() {
            book = new Book(StuffType.BOOKS, "Obama Green", "Reciclyed", 10.10);
        }

        @Test
        public void hasType() {
            assertEquals(StuffType.BOOKS, book.getType());
        }

        @Test
        public void hasColour() {
            assertEquals("Obama Green", book.getColour());
        }

        @Test
        public void hasModel() {
            assertEquals("Reciclyed", book.getMaterial());
        }

        @Test
        public void hasCostPrice() {
            assertEquals(10.10, book.getCostPrice(), 0.1);
        }

        @Test
        public void hasSellPrice() {
            book.sell();
            assertEquals(20.20, book.getSellPrice(), 0.1);
        }
    }
