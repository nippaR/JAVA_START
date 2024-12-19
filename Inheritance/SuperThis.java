package Inheritance;

class A{
    
    public A(){
        super();
        System.out.println("In A");
    }

    public A(int C){
        super();
        System.out.println("int A in");
    }

}

class B extends A{
    
    public B(){
        super();
        System.out.println("In B");
    }

    public B(int C){
        this();
        System.out.println("int B in");
    }

}


public class SuperThis{

    public static void main(String[] args) {
        
        B obj = new B(5);
    }
}