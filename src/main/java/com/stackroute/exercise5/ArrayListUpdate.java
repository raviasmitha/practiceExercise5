package com.stackroute.exercise5;

import java.util.*;


public class ArrayListUpdate {


    public ArrayList update(ArrayList arrayList) {



        //this method replaces at particular index

        arrayList.set(0, "Kiwi"); // updating arraylist second first element
        arrayList.set(2, "Mango"); //updating arraylist second third element
        return arrayList;
    }

    public ArrayList removeList(ArrayList arrayList) {

        //this method clears the array list

        arrayList.clear();
        return arrayList;
    }

}