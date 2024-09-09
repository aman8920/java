package src.com.aman;

class Basic{
    public static void main(String[] args){
        //int x;  // if we don't assign local variable it will give error 
        int x=9;  
        String s1 = null;    // String in java is object and hence s1 is reference to null object
        String s2 = "aman";
        String s3 = new String("hello");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2==s3);   // eaquality operator == is used for object reference while .equals() is used to comapre the content
    }

}