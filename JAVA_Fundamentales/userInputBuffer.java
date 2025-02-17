import java.io.BufferedReader;
import java.io.InputStreamReader;

public class userInputBuffer{
    public static void main(String args[]) throws Exception
    {

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        System.out.println("Enter your name: ");
        String name = br.readLine();
        System.out.println("Enter your age: ");
        int age = Integer.parseInt(br.readLine());
        System.out.println("");
        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age);
    }
}