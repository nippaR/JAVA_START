class A {
    public void display() {
        System.out.println("Inside A");
    }

    static class B {
        public void display() {
            System.out.println("Inside B");
        }
    }

}



public class inner {
    
    public static void main(String[] args) {
        
        A obj1 = new A();
        obj1.display();
        
        // A.B obj2 = obj1.new B();
        //but we can add static keyword to class B to make it static and then we can create object of class B without creating object of class A
        A.B obj2 = new A.B();
        obj2.display();
    }


}
