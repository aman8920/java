package com.aman.basics;

import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        int count=0;

        for (int i =1; i*i<=number;i++){
            if(number%i==0){
                count++;
                if(number/i != i)
                    count++;
            }
        }

        if (count<=2){
            System.out.println("given number is prime");
        }
        else
            System.out.println("not prime");
    }

    
}
