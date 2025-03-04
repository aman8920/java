package com.aman.basics;

import java.util.ArrayList;
import java.util.Arrays;

public class arrayOperationsSorting {
    public static void main(String[] args) {
        

       int[] numbers = {11, 2, 30, 24, 5,6,72,18,9,10,13,0,89,5,1,11};
       int[] num1 = {1,2,1,1,3,2,1,8,9,2,5,2,3,4,3,2,1,9,8,8,9,6,7,8,9,8,8,7,8,9,90};
       
        // for (int i : numbers) {
        //     System.out.print(i+" ");
            
        // }
        // System.out.println();

       // int[]  insertionsortarray = insertionSort1(numbers);
        // for (int i : insertionsortarray){
        //     System.out.print(i+" ");
        // }

        quickSort(num1, 0, num1.length-1);
        System.out.println(Arrays.toString(num1));


        


        // Selection sort
      /*   for(int i=0;i<=numbers.length-2;i++){
            int min = i,temp=0;
            
            for(int j=i+1;j<=numbers.length-1;j++){
                if(numbers[j]<numbers[min]){
                    min=j;
                }
            }
                System.out.println("min is "+min);
                temp=numbers[i];
                numbers[i]=numbers[min];
                numbers[min]=temp;

            

        }
        for (int i : numbers) {
            System.out.print(i +" ");
            
        } */

        

    }

    //insertion sort
        public static int[] insertionSort(int[] arr){
            for (int i = 1; i < arr.length; i++) {
                int j=i;
              while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1] =  arr[j];
                arr[j]=temp;
                j--;
              }        
            }
            return arr;

        }

        public static int[] insertionSort1(int[] arr){
            for (int i = 1; i < arr.length; i++) {
                for (int j=i;j>0;j--){   //for every i iteration the j loop runs from i to i-- till 0 
              if( arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1] =  arr[j];
                arr[j]=temp; }      
            }
        }
            return arr;

        }



        //  merge sort method 
        public static void mergeSort(int[] arr, int low, int high){
            if(low>=high)
            return;
            int mid = ((low+high)/2);
            mergeSort(arr, low, mid);
           // System.out.println(Arrays.toString(arr) + "       after recursion");
            mergeSort(arr, mid+1, high);
            merge(arr,low,mid,high);
            
        }

        //  merge sort method's helping merge method
        public  static void merge(int [] arr,int low,int mid,int high){
            ArrayList<Integer> ar = new ArrayList<>();  //temporay arraylist to store the aorted array
            int left = low;  // pointer to loop the left and right arrays and sort
            int right = mid+1;
            while(left<=mid && right<=high){  //comparing the right left and then adding to the array list
                if(arr[left]<arr[right]){
                    ar.add(arr[left]);
                    left++;
                }
                else{
                    ar.add(arr[right]);
                    right++;
                }
            }
            while(left<=mid){
                ar.add(arr[left]);
                left++;
            }
            while(right<=high){
                ar.add(arr[right]);
                right++;
            }

            System.out.println(ar + " after recursion");
            

            for (int i=0;i<ar.size();i++){  // once all sorted added in arraylist , adding back to the array
                arr[i+low] = ar.get(i);
                
            }
            System.out.println(Arrays.toString(arr) + "       array after recursion");
            

        }


        // quick sort method 

        public static void quickSort(int[] arr, int low, int high){
            if (high>low){
            
            int p = pivot(arr,low, high);
            quickSort(arr, low, p-1);
            quickSort(arr, p+1, high);
            }
        }

        // QuickSort helping method pivot function
      /*   public static int pivot(int []arr, int low, int high) {
            int pivot = arr[high];
            int l=low,r=high;

            while(l<r){
                while(arr[l]<=pivot && l<r){
                    l++;
                }
                while(arr[r]>pivot && l<r){
                    r--;
                }
                if(l<=r){
                    int temp = arr[l];
                    arr[l] = arr[r];
                    arr[r]=temp;

                }
            }

            System.out.println("array after iterations  "+ Arrays.toString(arr));
            //  int temp = arr[r];
            //  arr[r] = pivot;
            //  arr[high]=temp;
            return r;
            
        } */

        /* // QuickSort helping method pivot function
         public static int pivot(int []arr, int low, int high) {
            int pivot = arr[(low+high)/2];
            int l=low,r=high;

            while(l<r){
                while(arr[l]<pivot){
                    l++;
                }
                while(arr[r]>pivot){
                    r--;
                }
                if(l<r){
                    if(arr[l]==arr[r]){
                        l++;
                        
                    }
                    int temp = arr[l];
                    arr[l] = arr[r];
                    arr[r]=temp;   
                     
                }
            }

            System.out.println("array after iterations  "+ Arrays.toString(arr));
            
              
            
            return l;
            
        }*/

        public static int pivot(int[] arr, int low, int high) {
            int pivotIndex = (high + low) / 2;  // Choose the middle element as the pivot
            int pivot = arr[pivotIndex];
            int l = low;
            int r = high;
    
            while (l <= r) {
                // Move the left pointer to the right until an element >= pivot is found
                while (arr[l] < pivot) {
                    l++;
                }
                // Move the right pointer to the left until an element <= pivot is found
                while (arr[r] > pivot) {
                    r--;
                }
                // If the pointers have not crossed, swap the elements
                if (l <= r) {
                    int temp = arr[l];
                    arr[l] = arr[r];
                    arr[r] = temp;
                    l++;
                    r--;
                }
            }
            System.out.println("array after iterations  "+ Arrays.toString(arr));
    
            // Return the partition point (index of the pivot)
            return l - 1;
        }
    

        




    
}
