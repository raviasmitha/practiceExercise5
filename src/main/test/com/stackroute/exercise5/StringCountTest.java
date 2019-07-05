package com.stackroute.exercise5;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;


public class StringCountTest {


    StringCount stringCount;

    @Before
    public void setUp() throws Exception {
        stringCount = new StringCount();
    }

    @After
    public void tearDown() throws Exception {
        stringCount = null;
    }

    @Test
    public void testShouldreturnHashMap() throws IOException {

        HashMap expected = new HashMap();
        expected.put("one", 5);
        expected.put("two", 2);
        expected.put("three", 2);

        String string = "one one -one___two,,three,one @three*one?two";
        String input[] = {"one", "two", "three"};

        HashMap actual = stringCount.check(string, input);

        assertEquals(expected, actual);
        assertNotNull(stringCount);

    }

    @Test
    public void testIfWordIsNotInString() throws IOException {

        HashMap expected = new HashMap();
        expected.put("one", 0);
        expected.put("two", 2);
        expected.put("three", 2);

        String string = "  -___two,,three, @three*?two";
        String input[] = {"one", "two", "three"};

        HashMap actual = stringCount.check(string, input);

        assertEquals(expected, actual);
        assertNotNull(stringCount);

    }

    @Test
    public void testIfStringIsEmpty() throws IOException {

        HashMap expected = new HashMap();
        expected.put("one", 0);
        expected.put("two", 0);
        expected.put("three", 0);

        String string = "";
        String input[] = {"one", "two", "three"};

        HashMap actual = stringCount.check(string, input);

        assertEquals(expected, actual);
        assertNotNull(stringCount);

    }

    @Test(expected = NullPointerException.class)
    public void testGivenNull(){
        HashMap actual = stringCount.check(null, null);
    }

}