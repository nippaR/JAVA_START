class Dog {

    public String speak(String a){
        return "woof, Woof";
    }
    
}

public class meth {
    public static void main(String[] args){
        
        Dog obj = new Dog();
        String speak = obj.speak("");

        System.out.println(speak);
    }
}
