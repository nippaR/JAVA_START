class Calculator {

    public int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public int add(int a, int b,int c) {
        return a + b + c;
    }

    public double add(double a , double b ,double c){
        return a + b - c;
    }
    
}


public class OOP 
{
    public static void main(String[] args) {
        double a = 10.00;
        double b = 25.00;
        double c = 30.00;

        //create a new object of Calculator class this is defined above
        Calculator calc = new Calculator();
        double result = calc.add(a, b, c);

        System.out.println("The sum  is = " + result);
    }
    
}
