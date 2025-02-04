package LambdaExpression;

@FunctionalInterface  //annotation
interface A{ // this is a functional interface because it has only one method. 
    void show(int i); //also we can can't add more than one method in functional interface
}

public class lambdaE {
    
    public static void main(String[] args) {
        
        A obj = (i) -> System.out.println("Inside A show :" + i);
        obj.show(5);
    }
    
}
