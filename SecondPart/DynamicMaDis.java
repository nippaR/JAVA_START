package SecondPart;

class A{
    public void show(){
        System.out.println("Show in A");
    }

    public int add(int a, int b){
        
        int sum = a + b;

        return sum;

    }
}

class B extends A{

    public void show(){
        System.out.println("show in B");
    }
}

public class DynamicMaDis {
    
    public static void main(String[] args) {
        
        A obj = new A();
        obj.show();
        
        obj = new B();
        obj.show();
    }
}
