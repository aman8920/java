package com.aman.Practice;

import java.util.Arrays;

public class zeroesToRight {

    public static void shiftZero(int [] arr){
        
       

        for (int left = 0; left <arr.length-1;left++){
            if(arr[left] ==0){
                int right = left+1;
                while ((right<arr.length) && arr[right]==0 ){
                    right++;
                }

                System.out.println(left + " , "+right);

                if( (right<arr.length) && arr[right] !=0 ){
                   int temp = arr[left];
                   arr[left] = arr[right];
                   arr[right] = temp;

                //    if (right>arr.length)
                //     break;
                   right++;
                   


                }
                
                System.out.println(Arrays.toString(arr));


            }

        }
    }
    public static void shiftZero2(int [] arr){

        int j= 0 ;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == 0){
                    int temp = arr[j];
                   arr[j] = arr[i];
                   arr[i] = temp;
            }
        }

    }

    public static void main(String[] args) {
        int [] arr1 = new int[]{0,0,0,0,0,0,1};
        shiftZero(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println("do better");
    }
    
}
