package com.aman.basics;

import java.util.HashMap;
import java.util.Map;

public class mapsPractice {
    
    public static void main(String[] args) {
        Map<String,Integer> nameCount = new HashMap<>();
        nameCount.put("a", 5);
        nameCount.put("t", 7);
        nameCount.put("h", 9);

        String[] charArray = {"a","j","l","h"};

        for(String s : charArray){
            //System.out.println(s);  so we can create map and use the mathods to get the map elements
            // if (nameCount.containsKey(s))  this is to check if the map contains the key
            //nameCount.put(s, nameCount.getOrDefault(s, 0) + 1);  to convert the null pointer in case key not there to int 0 value
            nameCount.put(s, (nameCount.get(s) != null ? (int) nameCount.get(s) : 0) +1 );
            System.out.println(s + "  is present in map "+ nameCount.getOrDefault(s, 0) + " times");
                            
        }

        System.out.println(nameCount);





    }
}
