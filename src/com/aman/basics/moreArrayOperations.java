package com.aman.basics;

public class moreArrayOperations {
    public static void main(String[] args) {
        

        int[] numbers = {0,2,0,0,3,4,5,0,0,0,7,6,0,4};
        int[]num1 = {5,2,4,5};
        int [] consOnes = {1,1,2,1,0,1,1,1,1,0,1,1,1,0,0,0,1,1,1,1,1,0,9,1};


        System.out.println(consecutiveOnes(consOnes));

        //move zeros to last
        int j=0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]!=0){
                int temp = numbers[j];
                numbers[j]=numbers[i];
                numbers[i]=temp;
                j++;
            }
            

        }
        //System.out.println(Arrays.toString(numbers));    //// use this to pring zeroes at last


           // int missingNumber= missingNumberWithXor(num1);
           // System.out.println(missingNumber);   ////  implement this to find the missing numbers with xor method
         

    }

    public static int missingNumberWithXor(int [] arr){
        int xor =0;
        for(int i=0;i<arr.length;i++){
            
            xor ^= arr[i];
            xor ^=(i+1);
            System.out.println(arr[i]+" "+(i+1)+" "+"after "+ i+ " iteration xor is "+ xor);
        }
        


        return xor^5;


    }

    public static int consecutiveOnes(int []arr){
        int count=0, max=0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]!=0){
                count ++;
            }
            else{
                if(max<count){
                    max=count;
                }
                count=0;
            }
        }
        return max;
    }


}
