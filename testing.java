
class parent {
     void parentm(){
        System.out.println("parent method");
    }

    // parent p1 = new parent();
    // p1.parentm();
  
}

class child extends parent {
     void parentm(){
        System.out.println("child method");
    }
}

public class testing {

    public static void main(String[] args) {
        parent p1 = new parent();
        child c1 = new child();
        parent p2 = new child();
       // p1.parentm();
       p1.parentm();
        c1.parentm();
        p2.parentm();
    }
}
