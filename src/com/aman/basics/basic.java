package com.aman.basics;

import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =0;
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        int num2 = num1;
        System.out.println(num1);
        int rev = 0,rem=0,qat=0;

        while (num1>0){
            rem = num1%10;
           // System.out.println("remainder is " + rem);
            qat = num1/10;
            //System.out.println("qat is " +qat);
            rev = rev*10+rem;
            //System.out.println("reverse num is " +rev);
            num1 = qat;
            //System.out.println("num after iteration" +num1);
            
        }


        // System.out.print("Enter the second number: ");
        // int num2 = scanner.nextInt();
        System.out.println("The reverse is: " + rev);

        scanner.close();

        System.out.println("recursion function reverse is " + reverseNum(num2, 0));
    }

    public static int reverseNum(int Num1,int revNumber){
        if (Num1 == 0)
        return revNumber;

        revNumber = revNumber*10 + Num1%10;
        Num1 = Num1/10;
        return reverseNum(Num1, revNumber) ;


    }
}
    
    
