package com.codeclan.example.guitarShop;

import com.codeclan.example.guitarShop.instruments.Flute;
import com.codeclan.example.guitarShop.instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

    public class FluteTest {

        Flute flute;

        @Before
        public void before() {
            flute = new Flute(InstrumentType.FLUTE,"Ghuring","Obama Green", 20.00);

        }

        @Test
        public void hasType() {
            assertEquals(InstrumentType.FLUTE, flute.getType());
        }

        @Test
        public void hasMake() {
            assertEquals("Ghuring", flute.getMake());
        }

        @Test
        public void hasColour() {
            assertEquals("Obama Green", flute.getColour());
        }


        @Test
        public void hasCostPrice() {
            assertEquals(20.00, flute.getCostPrice(), 0.1);
        }

        @Test
        public void hasSellPrice() {
            flute.sell();
            assertEquals(30.00, flute.getSellPrice(), 0.1);
        }

        @Test
        public void canPlay() {
            assertEquals("Flu Fli Flu!", flute.play());
        }
    }
