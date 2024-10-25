package com.example.lab8;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
     * Gets the size of the list.
     * @return the size of the list
     */
    public int getCount() {
        return list.getCount(); // Uses the getCount() method of CustomList
    }

    /**
     * Adds a city object to the list.
     * @param city the city to add
     */
    public void addCity(City city) {
        list.addCity(city); // Calls the addCity method in CustomList
    }

    /**
     * Tests adding a city to the list.
     * Verifies that the list size increases by one.
     */
    @Test
    public void addCityTest() {
        int initialSize = getCount();
        addCity(new City("Estevan", "SK"));
        assertEquals(initialSize + 1, getCount());
    }
}
