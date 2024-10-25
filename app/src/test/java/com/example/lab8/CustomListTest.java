package com.example.lab8;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;

    /**
     * Setup a mock list for testing before each test.
     */
    @BeforeEach
    public void setUp() {
        list = new CustomList(null, new ArrayList<>());
    }

    /**
     * Tests adding a city to the list.
     * Verifies that the list size increases by one.
     */
    @Test
    public void addCityTest() {
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(listSize + 1, list.getCount());
    }

    /**
     * Tests the hasCity method to verify if a city is in the list.
     */
    @Test
    public void testHasCity() {
        City city = new City("Regina", "Saskatchewan");
        assertFalse(list.hasCity(city));
        list.addCity(city);
        assertTrue(list.hasCity(city));
    }
}
