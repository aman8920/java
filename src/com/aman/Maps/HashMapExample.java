package com.aman.Maps;

import java.util.Map;
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {

        Map<String, Integer> studentAge = new HashMap<>();
        studentAge.put("aman", 27);
        studentAge.put("yash", 26);
        studentAge.put("nimo", 27);
        studentAge.put("riya", 27);

        System.out.println("riyas age is " + studentAge.get("riya"));
        System.out.println("changing the riyas age to 30 now " + studentAge.put("riya", 30));
        System.out.println("riyas update age is " + studentAge.get("riya"));

        System.out.println(studentAge);

    }
}
