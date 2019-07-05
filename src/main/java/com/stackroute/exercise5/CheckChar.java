package com.stackroute.exercise5;

import java.util.HashMap;

public class CheckChar {
    public HashMap checkCharacter(String[] input) {

        //this method checks if frequency of occurence of any string is more than 2

        int len[] = new int[input.length]; // new array with size of input length
        boolean output[] = new boolean[input.length]; //new array with size of input length

        HashMap hashMap = new HashMap();


        for (int i = 0; i < input.length; i++) {

            //travelling string array

            int count = 0;
            for (int j = 0; j < input.length - 1; j++) {

                // comparing with remaining elements

                if (input[i].equals(input[j]))
                    len[i] = count++;
                if (len[i] > 0)

                    // if count is greater than 0 number exists more than once so set output to true

                    output[i] = true;

                else output[i] = false;
            }

        }


        for (int i = 0; i < len.length; i++) {
            hashMap.put(input[i], output[i]);   // adding output to hashmap

        }

        return hashMap;
    }

}
