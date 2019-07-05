package com.stackroute.exercise5;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class AscendingOrderTest {


    AscendingOrder ascendingOrder;

    @Before
    public void setUp() throws Exception {
        ascendingOrder = new AscendingOrder();
    }

    @After
    public void tearDown() throws Exception {
        ascendingOrder = null;
    }

    @Test
    public void testSortArrayListUsingSortedSet() {
        String expected = "[Alice, Bluto, Eugene, Harry, Olive]";
        String actual = ascendingOrder.sortArrayListUsingSortedSet("Harry Olive Alice Bluto Eugene");
        assertEquals(expected, actual);
    }

    @Test
    public void testSortArrayListUsingSortedSetNull() {

        String actual = ascendingOrder.sortArrayListUsingSortedSet(null);
        assertNull(actual);
    }

    @Test
    public void testSortArrayListUsingSortedSetNumbers() {
        String expected = "[1, 2, 3, 5, 7]";
        String actual = ascendingOrder.sortArrayListUsingSortedSet("1 5 7 3 2");
        assertEquals(expected, actual);
    }

}