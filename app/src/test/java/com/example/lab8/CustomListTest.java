package com.example.lab8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;

    /**
     * This method creates a mock list for my city list.
     */
    public CustomList mockCityList() {
        return new CustomList(new ArrayList<>()); // Assuming CustomList constructor takes an ArrayList
    }

    /**
     * Setup method to initialize the list before each test.
     */
    @BeforeEach
    public void setUp() {
        list = mockCityList();
    }

    /**
     * This test checks if adding a city increases the list size by one.
     */
    @Test
    public void addCityTest() {
        int initialSize = list.getCount(); // Get initial size
        list.addCity(new City("Estevan", "SK")); // Add a new city
        assertEquals(initialSize + 1, list.getCount()); // Assert the size increased by one
    }
}
