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

        System.out.println(G);   

        //Type conversion and casting 
        //conversion 
        byte b = 127;
        int a = 257;
        a = b;
        System.out.println(a);

        //casting 
        byte t = 127;
        int d = 12;

        t = (byte) d;
        System.out.println(t);

        // to perform this in moduler operation
        int k = 257;
        byte z = (byte)k;

        System.out.println(z);

    }
}