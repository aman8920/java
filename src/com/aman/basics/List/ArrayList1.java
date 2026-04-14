package com.aman.basics.List;

import java.util.*;

public class ArrayList1 {
    public static void main(String[] args) {
        List <String> al1 = new ArrayList<String>();
        al1.add("red");
        al1.add("white");
        al1.add("green");

        //al1.add(0,"pink");

        al1.set(1, "teak");
        //al1.clear();
        al1.add(0,"pink");

        List<String> al2 = al1.subList(0,2);

        System.out.println(al1.isEmpty());
        System.out.println(al1.size());
        System.out.println(al1.contains("teak"));
        System.out.println(al1.indexOf("red"));

        System.out.println(al1);
        System.out.println(al2);

        for(String s : al1){
            System.out.print(s + " ");
        }

    }
}
