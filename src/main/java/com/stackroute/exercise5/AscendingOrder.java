package com.stackroute.exercise5;

import java.util.*;

public class AscendingOrder {


    // method is used to implement set interface which sorts the given randomly ordered names in

    // ascending order

    public String sortArrayListUsingSortedSet(String string) {

        if (string == null)
            return null;

        SortedSet<String> sortedSet = new TreeSet<>(Arrays.asList(string.split(" ")));

        return new ArrayList<String>(sortedSet).toString();
    }

}
