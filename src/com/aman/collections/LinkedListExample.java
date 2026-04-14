package com.aman.collections;

import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer>  ll1 = new LinkedList<>();
        ll1.add(90);
        ll1.addFirst(9);
        ll1.add(8);
        System.out.println(ll1.getLast());

        Collections.replaceAll(ll1, 90, 10);

        Collections.sort(ll1);
        Collections.reverse(ll1);
        


        System.out.println(ll1);

        for(Object o1 : ll1){
            System.out.println(o1);

        }








    }
    


}
