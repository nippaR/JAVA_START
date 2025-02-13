package Exceptions;

class A{
    public void show() throws ClassNotFoundException{
        Class.forName("Thanuja");
    }
}

public class thoEx{
    public static void main(String args[]){
        A obj = new A();
        try{
            obj.show();
        }
        catch(ClassNotFoundException e){
            System.out.println("This is a custom exception :" + e);
        }
    }
}