package com.aman.Practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class removeDuplicatesFromSortArray {

    public static int uniqueElement(int [] arr1){
        int left =0;
        int right=1;

        while (right<arr1.length){
            if (arr1[left] >= arr1[right]){
                right++;
            }
            else{
            left++;
            int temp = arr1[left];
            arr1[left]=arr1[right];
            arr1[right]=temp;
            System.out.println(left + "  " + right);
            System.out.println(Arrays.toString(arr1));}
        }
        return left+1;
    }

    public static int uniqueElement1(int [] arr1){
        int i =0;
        for (int j = 1;j<arr1.length;j++){
            if(arr1[j] != arr1[i]){
                i++;
                int temp = arr1[i];
                arr1[i] = arr1[j];
                arr1[j] = temp;
                
            }
        }
        System.out.println(Arrays.toString(arr1));
        return i+1;
    }

    public static void main(String[] args) {
        int [] arr1 = new int[]{1,1,1,2,2,3,3,4,4,4,4,5,6};
        //int unique = uniqueElement(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println(uniqueElement(arr1));
    }
    
}
