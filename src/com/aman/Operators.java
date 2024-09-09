package src.com.aman;

// package com.aman.basic ;

public class Operators {

    public class Test{
    
    }
    public static void main(String[] args) {
        int s = 10;
        System.out.println(s);

        //instanceof operator - to know if an object is of a particular type eg. in an array we can do 
        //object o = array1.get(0) and can find the object type by - (o instanceof String)

        Thread t1 = new Thread();
        System.out.println(t1 instanceof Thread);
        System.out.println(t1 instanceof Object);
        System.out.println(t1 instanceof Runnable);
       // System.out.println(t1 instanceof String);  give compile type error
       System.out.println(null instanceof Object);  //  null instanseof object or class is always false
       System.out.println();

       // Bitwise operators (& , |, ^)   xor return true for 10, 01 and flase for 11, 00 .
       System.out.println("bitwise operators");
       System.out.println(true & false);
       System.out.println(true | false);
       System.out.println(true ^ false);
       System.out.println(1 ^ 0);

       System.out.println("4 and 5 bitwise operations");
       System.out.println(4 & 5);
       System.out.println(4 | 5);
       System.out.println(4 ^ 5);


       System.out.println();
       System.out.println("bitwise complement operator ~ ");  // works for integral and not boolean
       System.err.println(~4);
       // System.err.println(~true); gives error 

       //  ~ works on integral type while ! works only for boolean
       
       System.out.println();
       System.out.println("short circuit operators && , ||  ");
       // System.out.println(1 && 0); gives error as only applicable for boolean data types
       System.out.println(false && true);   // the first argument is false it doesn't check for the second one

       System.out.println();
       System.out.println("Type case operators");
       int x = 'a';
       double d = 10;

       System.out.println(x);    //compiler implicitly converts char value to int or int to double
       System.out.println(d);


       int n1 = 130;
       byte b = (byte) n1;
       System.out.println(b);    //here we need to explicity define the same and loss of data is possible


       System.out.println();
       System.out.println("assignment operators");

       int n2 = 10,n3=20,n4=30;
       // int n5=n6=n7=n8=900;  not acceptable as only n5 is declared and the n6,n7,n8 local variables
       //are not declared .

       n2+=n3-=n4/=2;
       System.err.println(n2 + " "+n3+" "+n4);

       System.out.println();
       System.out.println("Conditional/ternary operators");

       int n10=(30>40)?50:((50==60)?60:70);
       System.err.println(n10);

       System.out.println();
       System.out.println("new operators");

       Operators o = new Operators();

       Test t2 = o.new Test();

       System.out.println();
       System.out.println("operators  precedence");

       //  *,/,%, +, -  if the operators are same then the operation goes from left to right





        













    }
    
}
