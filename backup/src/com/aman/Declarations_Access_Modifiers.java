package src.com.aman;

import java.util.ArrayList;
import src.com.aman.Basic;

import javax.swing.text.Position.Bias;

//import src.com.aman.*;

class A 
{

}

class B 
{

}
public class Declarations_Access_Modifiers {

    public static void main(String[] args) {
        
        System.out.println("---------java source file structure ------------ ");
        System.out.println();  
        //  a java file can have any nub=mber of class but at most one public class and if the class name is public
        // then the file name should be sa eas the public class name eg .
        // public class Declarations_Access_Modifiers   is public class and name of the file is same

        // if we  name this file anything and compile it will only generate the .class files for the defined class only
        // and hence we can only run the .class where the main method is defined.

        ArrayList al1 = new ArrayList<>(); // if want to use this we need to specify the class name where it's present
        // which can be done by using import


        System.out.println("---------package ------------ ");
        System.out.println();

        //  group of related classes and interfaces is called a package , is usually for a particular method
        // eg database related class and interface is sql package , file related claases and interfaces io package 

        //  package format com.domain.module.submodule.class
        // java file format 
        /* pacakge satement --  at most one
            import statemnet --  any number
            class/interface/enum statements --  any number    */ 

        System.out.println("---------class level moddifiers ------------ ");
        System.out.println();

        /* while creating the classes we need to specify the info to jvm what kind of the class is being created
         and this info is given with the help of the class level modifiers.
         modifires 12 - public, private , <default>, protected, final, abstract, static, synchronized, native
         staticfp, transient, volatile

         out of there the orter class can be public, <default>, final , abstract, and staticfp, and inner class adds 
         private , protected and static on top of that.


          publc classes can be accessed outside of the package when imported 
          default class can be accessed only within the package 
          final access modifier is applicable for class , method and variables ; if the method is final means it can't 
          be overridden in the child class , if the class is final then it can't be inherited
          so all the methods of a final class automatically become final methods as they can't be inherited and 
          hence can't be overridden

          abstract modifier -  applicable for both class and methods 
          abstract method declares a method but doesn't implement it. eg - abstract void m1();
          class containing the abstract methods must be declared as abstract class so that the child class can 
          implement the abtract methods present in the abstract class

          strictfp --  is used to get the same result based on ieee 754 standard results for the floating point
          calculations independent of the platform , as floating point calculations give different decimal point 
          values for different platforms
          it is applicable for class and method level.
          strictfp class requiers implementation and hence a method can't be both strictfp and abstract while the
          same is legal for class , as abstact class can have strictfp modifiers a too.
         */

         System.out.println("---------member level moddifiers ------------ ");
         System.out.println();
         /*
          the below class will be working as it's in the same package but won't work in different package if the class
          is not declared public , similarly the methods won't work either if the method level identifiers are set like that
          public members-  this member can be accessed from anywhere provided the class is public
          default members -  are accessible within the package
          private members - are accessible only in the same class 
          protected members - are accessible within the package and outside package in the child class with child reference



          */


        Basic b1 = new Basic();
       // int s1 = b1.sum(5,8,90);  since the sum method is declared as private we can't access it outside the class
       // System.out.println(s1);

       System.out.println("---------final variables ------------ ");
       System.out.println();
       /* 3 types of variables instance, static and local
        * static and instances need not be initialed but local needs to be in case we are using it.
        if we declare instance variable as final we need to initialise it before the constructor block completes,
        for static final variable we need to initialze before class loading

        for final local varible , need to initialise if only we are using them 
        */
        System.out.println("---------static modifiers ------------ ");
        System.out.println();
        






    }
    
}
