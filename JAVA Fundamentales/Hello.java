class Hello{
    public static void main(String[] args){

       // int i = 5;

        //float f = 5.5f;

        //double d = 5.5; 
        
        // char c = 'A';
        // c++; // increment the value 
    
        // boolean b = true;  

        // long l = 5000000000L;

        // short s = 5;
    
        // System.out.println(c);

        /*int -> 4 bytes
        long -> 8 bytes
        short -> 2 bytes*/

        //literal

        //int num1 = 100_00_00_0; //print 10000000

        double G = 12e02;

        // System.out.println(G);   

        //Type conversion and casting 
        //conversion 
        byte b = 127;
        int a = 257;
        // a = b;
        // System.out.println(a);

        //casting 
        // byte t = 127;
        // int d = 12;

        // t = (byte) d;
        // System.out.println(t);

        // to perform this in moduler operation (%- moduler operation - remainder)
        // int k = 257;
        // byte z = (byte)k;

        // System.out.println(z);

        //Type Promtion 

        // byte p = 10;
        // byte o = 30;

         //java automatic convert this bytes in to int
        //int result = p * o;
        //System.out.println("This is type promtion : " + result);
       
        //Arithmetic operation

        int num = 10;

        num += 2; // num = num + 2;

        //num =- 2; // num = num - 2;

        //num =* 2; // num = num * 2;

        //num++; post-increment "fetch the value first and then increment"
        //++num; pre-increment  "increment the value first and then fetch"

        System.out.println(num); 

        //Logical operators (&& -> and, || -> or, ! -> not)
        int r = 10;
        int j = 4;
        int q = 12;
        int h = 2;

        boolean output = (r > j) && (q > h); //true

        //short circuit operator - this one checks the first condition and if it is false then it will not check the second condition
        //boolean output = (r > j) && (q < h); //false

        System.out.println(output);

        //Bitwise operator (& -> and, | -> or, ^ -> xor, ~ -> not, << -> left shift, >> -> right shift, >>> -> zero fill right shift)
    }
}