package com.aman.collections;
import java.util.*;


public class ArraylistExample{
    public static void main(String[] args){

        ArrayList <Integer> al1 = new ArrayList<>();
        al1.add(1);
        al1.add(2);
        al1.add(0,10);
        al1.add(90);

        al1.addAll(Arrays.asList(3, 4,5,32,45,67,10,90,89,76,100,87,100));

        for (int a : al1){
            System.out.print(a + " ");
        }
        System.out.println();

        Collections.sort(al1);
        System.out.println("Sorted: " + al1);
        
        Collections.sort(al1, Collections.reverseOrder());    // sorting and reverse sorting collection methods both will chnage the original arrayList
        System.out.println("Reverse sorted: " + al1);
        System.out.println(al1.get(2));
        al1.remove(2);
        System.out.println(al1.get(2));


        al1.removeAll(Arrays.asList(1,90,67));    //. removes the list from the arrayList
        System.out.println(al1.lastIndexOf(10));
        al1.set(al1.lastIndexOf(10), 100);
        ArrayList<Integer> al2 = new ArrayList<>(al1.subList(0,5));  // .subList method returns a list and that is a backend copy changing which changes the original copy as well
        for (int a : al1){
            System.out.print(a + " ");
            //System.out.println(Collections.frequency(al1, a));
        }
        System.out.println();

        System.out.println("-------------------------");
        System.out.println(al1.size());
        System.out.println(al1.isEmpty());
        System.out.println(al1.contains(10));

        System.out.println(Collections.frequency(al1, 100));


    }

}

