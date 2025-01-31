package Array;

public class arrays{
    public static void main(String[] args){
        //Array
        int num[] = {1,2,3,4,5};

        //print the element of the array
        System.out.println(num[0]);

        //print the length of the array
        System.out.println(num.length);

        //print the last element of the array
        System.out.println(num[num.length-1]);

        //update the element of the array
        num[0] = 10;
        System.out.println(num[0]);

        //print the all element of the array
        for(int i = 0; i < 5; i++){
            System.out.println(num[i]);

        }

        //implement the new array 
        // int arr[] = new int[5];//this arry size in 5

        // double num2[] = new double[5];

    }

}
