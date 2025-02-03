package ENUM;

class A {

    public void ThisclassShowinwhat(){
        System.out.println("Inside A");
    }
}

// noramly using annotation we can find compile time error
// if we are not overriding the method of parent class


class B extends A{
    @Override // this annotation is used to check if the method is overridden or not
    public void ThisclassShowinwhat(){
        System.out.println("Inside B");
    }
}

public class Annotation {
    public static void main(String[] args) {
        A obj1 = new B();
        obj1.ThisclassShowinwhat();
    }
}