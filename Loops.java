public class Loops {
    public static void main(String[] args){

        //While Loop
        int i = 1;
        while(i <= 10){
            System.out.println("Thanuja Nipun Rajawardhana " + i);
            int j = 1;
            while (j <= 1){
                System.out.println("Study at SLIIT" + j);
                j++;
            }
            i++;
        };

        //for loop
        for(int n=1;n<=5;n++){
            System.out.println("Thanuja Nipun Rajawardhana " + n);
            for(int m=1;m<=1;m++){
                System.out.println("Study at SLIIT" + m);
            }
        }
    }
}