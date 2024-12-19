package Encapsulation;

class A {
	public void show(){
        System.out.println("in show A ");
    }
}

class B{
    
    public void show(){
        System.out.println("in show B");
    }

}

public class mOverrid{
    public static void main(String[] args) {
        
        B obj = new B();
        obj.show();
    }


}