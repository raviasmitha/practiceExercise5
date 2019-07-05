package com.stackroute.exercise5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;

import static org.junit.Assert.*;

public class CheckCharTest {

    CheckChar checkChar;

    @Before
    public void setUp() throws Exception {
        checkChar = new CheckChar();
    }

    @After
    public void tearDown() throws Exception {
        checkChar = null;
    }

    @Test
    public void testGivenArrayShouldReturnHashMap() throws IOException {

        HashMap expected= new HashMap();
        expected.put("a",true);
        expected.put("b",false);
        expected.put("c",true);
        expected.put("d",false);


        String input[]={"a","b","c","d","a","c","c"};
        HashMap actual= checkChar.checkCharacter(input);

        assertEquals(expected,actual);
        // assertNotEquals(unexpected,actual);
        assertNotNull(checkChar);

    }

    @Test
    public void testGivenArrayContainsSameCharacter() throws IOException {

        HashMap expected= new HashMap();
        expected.put("a",true);


        String input[]={"a","a","a","a","a"};
        HashMap actual= checkChar.checkCharacter(input);

        assertEquals(expected,actual);
        assertNotNull(checkChar);

    }

    @Test(expected = NullPointerException.class)
    public void testGivenNull() throws IOException {

        HashMap expected= new HashMap();

        HashMap actual= checkChar.checkCharacter(null);

        assertEquals(expected,actual);

    }


}
