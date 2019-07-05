package com.stackroute.exercise5;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;




public class KeyValueTest {

    KeyValue keyValue;

    @Before
    public void setUp() throws Exception {
        keyValue = new KeyValue();
    }

    @After
    public void tearDown() throws Exception {
        keyValue = null;
    }

    @Test
    public void testRotateValue() {
        String expexted = "{val2=java, val1= }";
        Map<String, String> map = new HashMap<>();
        map.put("val1", "java");
        map.put("val2", "c++");
        String actual = keyValue.rotateValue(map);
        assertEquals(expexted, actual);
    }

    @Test
    public void testRotateValueSecond() {
        String expexted = "{val2=mars, val1= }";
        Map<String, String> map = new HashMap<>();
        map.put("val1", "mars");
        map.put("val2", "saturn");
        String actual = keyValue.rotateValue(map);
        assertEquals(expexted, actual);
    }

    @Test
    public void testRotateValueNull() {

        String actual = keyValue.rotateValue(null);
        assertNull(actual);
    }
}
