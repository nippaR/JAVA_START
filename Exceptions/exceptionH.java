package Exceptions;



public class exceptionH {
    
    public static void main(String[] args) {
        
        int i = 10;
        int j = 2;
        String str = null;

        try{
            int k = i/j;
            System.out.println("output is :" + k);
            System.out.println("Length of the string is :" + str.length());
        }
        catch(ArithmeticException e){
            System.out.println("Somthing Went Wrong :" + e);
        }
        catch(Exception e){ // this will catch all the exceptions. "Exception" is the parent class of all the exceptions.
            System.out.println("Somthing Went Wrong :" + e);
        }
    }
}
