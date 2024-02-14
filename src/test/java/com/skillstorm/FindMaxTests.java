package com.skillstorm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FindMaxTests {

    int[] emptyArray = {};
    int[] oneValueArray = { 3 };
    int[] multipleValueArray = { 5, 78, 20 };
    int[] someNegativeValuesArray = { 3, -4, 9, -1 };
    int[] allNegativeValuesArray = { -67, -100, -38 };

    // Old method

    @Test
    void testNullOld() {
        assertEquals(0, ArrayHelpers.findMaxOld(null));
    }

    @Test
    void testEmptyArrayOld() {
        assertEquals(0, ArrayHelpers.findMaxOld(emptyArray));
    }

    @Test
    void testOneValueArrayOld() {
        assertEquals(3, ArrayHelpers.findMaxOld(oneValueArray));
    }

    @Test
    void testMultipleValueArrayOld() {
        assertEquals(78, ArrayHelpers.findMaxOld(multipleValueArray));
    }

    @Test
    void testSomeNegativeValuesArrayOld() {
        assertEquals(9, ArrayHelpers.findMaxOld(someNegativeValuesArray));
    }

    @Test
    void testAllNegativeValuesArrayOld() {
        assertEquals(0, ArrayHelpers.findMaxOld(allNegativeValuesArray));
    }

    // Fixed method

    @Test
    void testNull() {
        assertEquals(0, ArrayHelpers.findMax(null));
    }

    @Test
    void testEmptyArray() {
        assertEquals(0, ArrayHelpers.findMax(emptyArray));
    }

    @Test
    void testOneValueArray() {
        assertEquals(3, ArrayHelpers.findMax(oneValueArray));
    }

    @Test
    void testMultipleValueArray() {
        assertEquals(78, ArrayHelpers.findMax(multipleValueArray));
    }

    @Test
    void testSomeNegativeValuesArray() {
        assertEquals(9, ArrayHelpers.findMax(someNegativeValuesArray));
    }

    @Test
    void testAllNegativeValuesArray() {
        assertEquals(0, ArrayHelpers.findMax(allNegativeValuesArray));
    }

}
