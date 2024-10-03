package src.com.aman;

 public class Basic{

    private int sum(int... a){
        int s1=0;
        for(int a1 : a){
            s1 = s1+a1;
        }
        return s1;


    }

    public static void main(String[] args){
        //int x;  // if we don't assign local variable it will give error 
        int x=20;  
        String s1 = null;    // String in java is object and hence s1 is reference to null object
        String s2 = "aman";
        String s3 = new String("hello");
        System.out.println(x/2);
        //System.out.println(s1);
        //System.out.println(s2==s3);   // eaquality operator == is used for object reference while .equals() is used to comapre the content
	// adding comment to check git gui

    }

}