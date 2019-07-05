package com.stackroute.exercise5;

import java.util.Map;

public class KeyValue {


    public String rotateValue(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        String val1 = map.get("val1");
        map.replace("val2", val1);     // If the key `val1` has a value, set the key `val2` to have that value, and
        map.replace("val1", " ");     //  Set the key `val1` to have the value `" "` (empty string).
        return map.toString(); // converting to string
    }
}
