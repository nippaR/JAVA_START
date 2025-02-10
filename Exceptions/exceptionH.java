package Exceptions;

class ThanujaException extends Exception{
    public ThanujaException(String s){
        super(s);
    }
}

public class exceptionH {
    
    public static void main(String[] args) {
        
        int i = 0;
        int j = 0;
        // String str = null;

        try{
            j = 18/i;
            System.out.println("output is :" + j);
            // System.out.println("Length of the string is :" + str.length());
            if (i == 0) {
                // throw new ArithmeticException("This is not possible");
                throw new ThanujaException("This is a custom exception");
            }
        }
        //custom exception
        catch(ThanujaException e){
            System.out.println("This is a custom exception :" + e);
            j = 18/1;
            System.out.println("This is a Default Value outputs :"+ j);
        }
        // catch(ArithmeticException e){
        //     j= 18/1;
        //     System.out.println("This is a Default Value outputs :"+ j + e);
        // }
        // catch(ArithmeticException e){
        //     System.out.println("Somthing Went Wrong :" + e);
        // }
        catch(Exception e){ // this will catch all the exceptions. "Exception" is the parent class of all the exceptions.
            System.out.println("Somthing Went Wrong :" + e);
        }
    }
}
