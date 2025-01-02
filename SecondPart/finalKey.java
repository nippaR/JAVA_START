package SecondPart;

final class A{
    
    public A(){
        System.out.println("This My World Can't you Controll IT..?");
    }
}

class B {
    public final void show(){
        System.out.println("This Method Can't Override Anyone");
    }
}

class C extends B{
    // public void show(){
    //     System.out.println("This Method Can't Override Anyone");
    // }
    
}

public class finalKey {
    
}
