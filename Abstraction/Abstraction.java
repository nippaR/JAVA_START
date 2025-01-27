package Abstraction;

abstract class Car{
    
    public abstract void drive();

    public void playMusic(){
        System.out.println("Playing music");
    }
}

class BMW extends Car{
    
    public void drive(){
        System.out.println("Driving BMW");
    }
}

public class Abstraction {
    
    public static void main(String[] args) {
        
        Car obj = new BMW();
        obj.drive();
        obj.playMusic();
    }
}
