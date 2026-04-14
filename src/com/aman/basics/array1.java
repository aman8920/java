package com.aman.basics;

public class array1 {

    public static void main(String[] args){

        int [][] ar1 = new int [3][];
        ar1[0] = new int[]{0,1,2};
        ar1[1] = new int[]{6,7,8,9};
        ar1[2]= new int[]{12,13,14,15,16,17};


        for (int[] row: ar1){
            for (int val : row){
                System.out.print(val+ " ");
            }
            System.out.println();
        }



    }
    
}
