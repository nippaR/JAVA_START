public class Conditional_and_Loops {
    public static void main(String[] args){
        
        int a = 16 , b = 10;
        
        if(a == b && a > b){
            System.out.println("a is greater than b");
        }
        else{
            System.out.println("b is greater than a");
        }


        //Ternary Operator

        int i = 10, result = 0;

        // if (i%2 == 0)
        //     result = 1;
        // else
        //     result = 0;
        
        

        //we cans use ternary operator to reduce the code
        
        result = (i%2 == 0) ? 1 : 0;
        System.out.println(result);
    }
}
