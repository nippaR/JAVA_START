public class wrapperClass {
    public static void main(String[] args){
        int i = 5;

        //Integer i1 = new Integer(i); // Boxing
        Integer num = i; // AutoBoxing
        System.out.println(num);



        // int j = num.intValue(); // Unboxing

        int j = num; // AutoUnboxing
        System.out.println(j);

        String str = "50";
        int x = Integer.parseInt(str);  // Converting string to int
        System.out.println(x*2);
    }
}
