package src.com.aman.a1;
import src.com.aman.Basic;

public class a1 {


        Basic b1 = new Basic();
      //  int s1 = b1.sum(5,8,90);  //  sum method won't work if the method level modifiers are set to private or default
        
    public static void main(String[] args) {
        
       // int s1 = b1.sum(5,8,90);    b1.sum is not working the as the sum method is nopt public in the Basic class of the src.com.aman pckg
       
        // System.out.println(s1);   
    }
        
}
