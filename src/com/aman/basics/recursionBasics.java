package com.aman.basics;

public class recursionBasics {
    public static void main(String[] args) {
        func1();
    }

    static int num =0, count=1;
    
    public static void  func1() {
        
        
        // if (num>=5)
        // return;
        
        // num++;
        // System.out.println("hello " + num);
        // num+=2;
        
        // func1();
        // num--;
        // System.out.println("hello with backtrack " + num);
        // num-=2;

        // print even number from 0-10 and odd number from 9-1 with backtrack
        if(num>=10)
        return;

        System.out.println("forward recursion number "+count+ " and number is " +num);

        num+=2;
        count++;

        func1();
        if(num<0)
        return;
        num--;
        if (num%2==0){
            System.out.println();
        }
        else
         System.out.println("odd nums with backtracking "+ num);
         num-=2;

        //  recursion can be used like a loop that goes both forward and backwards


        
        
        
    }
}
