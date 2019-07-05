package com.stackroute.exercise5;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;


public class ArrayListUpdateTest {

    ArrayListUpdate arrayListUpdate;

    @Before
    public void setUp() throws Exception {
        arrayListUpdate= new ArrayListUpdate();
    }

    @After
    public void tearDown() throws Exception {
        arrayListUpdate = null;
    }

    @Test
    public void testUpdateArrayList() throws IOException {


        ArrayList<String> Expected= new ArrayList<String>();
        Expected.add("Kiwi");
        Expected.add("Grape");
        Expected.add("Mango");
        Expected.add("Berry");

        ArrayList<String> arrayList= new ArrayList<String>();
        arrayList.add("Apple");
        arrayList.add("Grape");
        arrayList.add("Melon");
        arrayList.add("Berry");

        ArrayList actual= arrayListUpdate.update(arrayList);
        assertEquals(Expected,actual);

        assertNotNull(arrayListUpdate);

    }

    @Test
    public void testClearArrayList() throws IOException {


        ArrayList<String> Expected= new ArrayList<String>();

        ArrayList<String> arrayList= new ArrayList<String>();
        arrayList.add("Apple");
        arrayList.add("Grape");
        arrayList.add("Melon");
        arrayList.add("Berry");

        ArrayList actual= arrayListUpdate.removeList(arrayList);
        assertEquals(Expected,actual);

        assertNotNull(arrayListUpdate);

    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testIndexOutOfBound(){

        ArrayList<String> Expected= new ArrayList<String>();
        ArrayList<String> arrayList= new ArrayList<String>();
        ArrayList actual= arrayListUpdate.update(arrayList);
        assertEquals(Expected,actual);
    }

}