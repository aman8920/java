package src.com.aman;

public class FlowControl {
    public static void main(String[] args) {
        System.out.println();
       System.out.println("-----------if-else conditions------------");  //  argument to the if statement should be only boolean 

       System.out.println();
       int x = 10;
      /*   if (x)
       {System.out.println("hello");}
       else
       {System.out.println("hi");}  */  // code won't work as we have provided the x=int whereas the if
       // statement expects boolean value 

       /*   if (x = 20)
       {System.out.println("hello");}
       else
       {System.out.println("hi");}  */  //  here we are assigning x=20 which is also an int value

        if (x==20)
       {System.out.println("hello");}
       else
       {System.out.println("hi");}  // this works as we have == equality operator comparing the value of x and 
       // 20 and give the boolean output as false 

       boolean y = false;
       if (y = true)
       {System.out.println("hello");}  //  print hellow as the value of the y is assigned true which is used by the if statement
       else
       {System.out.println("hi");}


       System.out.println("value of y is " + y);
       System.out.println();
       if (y==false)
       {System.out.println("hello");}
       else
       {System.out.println("hi");}  //  compares value of the y to false and give false and hence the hi is printed

       if (true);
       if (true)
       System.out.println("hello");
      /* if (true)
       int n1=10; */   // gives error as we can only use one line when not using {} and hence when we declare anything
       //  variable then we won't be using the same variable and if we don't use the same what's the use of declaring the same
       if (true);
       {int n2= 10;}  //  here we can declare as we can have n number of lines within {.....}



       System.out.println();
       System.out.println("-----------switch conditions-----------");  // if the number of conditions are more then we should go for
       // switch statement
       System.out.println();

       byte b =2;
       int sw1 = 90;
       switch(b){
       }
       switch (b) {
        //case b=10:   wrong; case statement should be a constant expression
        case 10+0+0:
            System.out.println("hello");
            break;

       // System.out.println("hi");  wrong independent statement are not allowed

        // case 200:  if we give a value out of the byte range it won't compile 
        case 127:
            System.out.println("byte value out of range");

        case 90:
            System.out.println("90");
       
        default:
            System.out.println("not found");
            break;
       }




       System.out.println();
       System.out.println("---------while , do-while------------ "); //  used when number of iterations are not known
       System.out.println();

       /* while (1>2){
        System.out.println("hello");
       }
       System.out.println("hi");  */  //  never works cause the while block statement becomes unreachable at compile
       // time only and hence we get the compile time error 

       /* while (true){
        System.out.println("hello");
       }
       System.out.println("hi"); */  // same happens in case of true fase, and any constant value , if the value is 
       // know to the compiler and cause of the condition the code is unreachable we are bound to get Compile Error


       int w1=10, w2=30;
       /* while(w1>2){
        System.out.println("hello");  //  infinite loop
       } 
       System.out.println("hi"); */ //  this code works cause the evaluation will happen at runtime and the w1 
       // variable can change so the compiler won't give any error and it is the job of jvm to evaluate the same
        while (w2>w1)
        {
            System.out.println("while loop testing number "+ w2+" " + w1);  
            w1 += 3; // executes till the condition is true and breaks once condition is false
        }

        System.out.println();
        do {
            System.out.println("hi");

        } while (2>5);  // here the body works cause even though the condition is false and known by the compiler 
        // the body is executed at least one


        System.out.println();
       System.out.println("---------for loop------------ "); //  used when number of iterations are not known
       System.out.println();

       int f = 0;
       for (System.out.println("hello"); true;){  //  can assign anything and any valid java statement is correct
        System.out.println("hi");
         f+=10;
         if (f>10)
         break;
         System.out.println("this is loop number " + f); } 

         System.out.println();
         System.out.println("---------for-each loop------------ "); //  used usually for array or collections
         System.out.println();
  
            int[] ar1 = new int[5];
            int [ ] ar2 = {3,6,2,8,9};
            // for (byte arx1 : (byte)ar2){  can't perform cause we can't convert array to byte we can convert array element to byte but not the array
            for (int arx1 : ar2){
                System.out.println(arx1);    // print the elements contained in array
            }

         System.out.println();
         System.out.println("---------transfer statements break and continue ------------ ");
          //  used only for switch , loops and labelled blocks
         System.out.println();

         //  continue is used to skip the execution based on the conditions and only applicable in loops


         // this seems to be completed





        
       










       






    }
    
}
