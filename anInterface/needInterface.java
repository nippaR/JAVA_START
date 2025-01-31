package anInterface;

interface Computer{
    void code();
}

class Laptop implements Computer{
    public void code(){
        System.out.println("In code by Laptop");
    }
}

class Desktop implements Computer{
    public void code(){
        System.out.println("In code by Desktop");
    }
}

class Developer{
    public void develop(Computer c){
        c.code();
    }
}

public class needInterface {

    public static void main(String args[]){

    // Computer c = new Laptop();
    Computer d = new Desktop();

    Developer Thanuja = new Developer();
    Thanuja.develop(d);

    }
}