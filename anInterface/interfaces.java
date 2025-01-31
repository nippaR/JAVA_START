package anInterface;

interface A {

    int age=25;
    String name = "Teemo";

    void show(); // we don't need to write public abstract void show();

    static void count(){ 	    // we can have static methods in interface
        System.out.println("In count");
    }
}

class B implements A{
    public void show(){
        System.out.println("In show by film");
    }
}

public class interfaces {
    
    public static void main(String args[]){
        // A obj;
        // A.count(); // we can call static method of interface without creating object of class

        A obj = new B();
        obj.show();

        System.out.println(A.name);

    }
}
