package com.aman.Practice;

import java.util.Arrays;

public class quickSort {

    public static void QS(int [] arr1, int low , int high){
        if (low<high){
            int partition = pivot(arr1, low, high);
            QS(arr1, low, partition-1);
            QS(arr1,partition+1, high);
        }
    }

    public static int pivot (int [] arr1, int low , int high){
        //int mid = (low+high )/2;
        int point = arr1[low];
        int i = low;
        int j = high;

        while (i<j){
            while(arr1[i]<=point && i<=high-1){
                i++;
            }
            while(arr1[j]>= point && j>=low+1){
                j--;
            }

            if (i<j){
                int temp = arr1[i];
                arr1[i] = arr1[j];
                arr1[j] = temp;
            }
        }

                int temp = arr1[j];
                arr1[j] = arr1[low];
                arr1[low] = temp;
                return j;

    }


    public static void main(String[] args) {
        int [] arr1 = new int []{4,3,5,6,3,2,7,8,5,5,4,3};
        QS(arr1,0,arr1.length-1);
        System.out.println(Arrays.toString(arr1));
    }
    
}
