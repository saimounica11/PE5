package com.stackroute.PE5;

import java.util.HashMap;
import java.util.Map;

public class StringCount {
    public Map<String,Integer> stringCount(String input){
        Map<String,Integer> map=new HashMap<String, Integer>();
        //split the string
        String[] array=input.split("[\\W_]+");
        for(String i:array){
            if (map.containsKey(i)) {
                map.replace(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        return map;
    }
}

