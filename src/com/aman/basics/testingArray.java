package com.aman.basics;

import java.util.Arrays;

public class testingArray {
    public static void main(String[] args) {
        String [] x;
        x= new String[8];
        x[3]= "siva";

        int [][] y = new int[2][6];
       
        y[0][0] = 5;
        y[0][1] = 6;
        Arrays.fill(y[0], 2, y[0].length,9);
        y[1][0] = 7;
        y[1][1]=8;
        for(int i=2,value=10;i<y[1].length;i++,value+=10){
            y[1][i]=value;
        }


        //System.out.println(Arrays.deepToString(y));


        int[]z={1,2,3,4};
        char[]ch1 = {'a','b','c'};
        int[]x1 = z;

        char []ch2 = new char[ch1.length+1];
        int [] x2 = new int[ch1.length ];

        System.arraycopy(ch1, 0, ch2, 1, ch1.length);
       System.out.println(Arrays.toString(ch2));
        // for (char a1: ch1){
        //    Arrays.fill(x2, a1-'a',a1-'a'+1,a1-'a');
        //     System.out.println(a1);
        //     System.out.println(Arrays.toString(x2));

        // }

       



        //int index = Arrays.binarySearch(x, "siva");
        //System.out.println((int )Arrays.binarySearch(x, "siva"));
        // for (String a : x){
        //     System.out.print(a+ " ");
        // }
    }

    
}
