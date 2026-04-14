package com.aman.Practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mergeSort {

    public static void MS(int[] arr1, int low , int high){
        int mid ;
        if (low>=high)
            return;
        else
            mid = (low+high)/2;
            MS(arr1, low,mid);
            MS(arr1,mid+1,high);
            merge(arr1, low, mid, high);
    }

    public static void merge(int [] arr1, int low , int mid , int high ){

        int left = low;
        int right = mid+1;
        List<Integer> l1 = new ArrayList<>();

        while (left<=mid && right<=high ){
            if (arr1[left]<=arr1[right]){
                l1.add(arr1[left]);
                left++;

            }
            else
                {l1.add(arr1[right]);
                right++;}
        }

        while(left <=mid){
            l1.add(arr1[left]);
            left++;
        }
        while(right<=high){
            l1.add(arr1[right]);
            right++;
        }

        for(int i =low; i<=high; i++){
            arr1[i] = l1.get(i-low);
        }
    }

    public static void main(String[] args) {
        int [] arr1 = new int[]{2,0,3,1,43,2,5};
        MS(arr1, 0 , (arr1.length - 1));
        System.out.println(Arrays.toString(arr1));
    }
    
}
