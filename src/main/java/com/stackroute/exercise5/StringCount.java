package com.stackroute.exercise5;

import java.util.HashMap;


public class StringCount {

    //this method will take an input string and count frequency of occurence of each word

    public HashMap check(String string, String[] input) {
        int array[] = new int[input.length]; //new integer array
        int len[] = new int[input.length]; // new integer array

        HashMap hashMap = new HashMap();

        input[0].length();
        for (int i = 0; i < array.length; i++) {
            array[i] = string.length() - (string.replaceAll(input[i], "").length()); //count of oocurence of words
        }

        for (int i = 0; i < array.length; i++) {
            len[i] = input[i].length(); // length of each word
        }

        for (int i = 0; i < array.length; i++) {
            hashMap.put(input[i], (array[i] / len[i])); // divide by length of word to get number of words and add to hash map
        }

        return hashMap;
    }

}