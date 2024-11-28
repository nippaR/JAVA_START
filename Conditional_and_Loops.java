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

        //Switch Case

        int day = 3;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;
            
            case 5:
                System.out.println("Friday");
                break;

            default:
                System.out.println("Enter Valid NO.");
        }

        //new version in using switch (after the 18 version)
        String d = "Sunday";

        switch (d) {
            case "Saterday","Sunday" -> System.out.println("Wow it's weekends");        
            case "Monday" -> System.out.println("ohh good it's weekday");
            default -> System.out.println("ohh yah, it's playing days comming");
        }

        // also we can return the values 

        String thanu = "tea";
        String exp = "";

        exp = switch (thanu)
                {
                    case "tea" : yield  "oh it's tea";
                    case "coffiy" : yield "ewww it's coffiy";
                    case "milk" : yield "ohh it's milk wow";
                    default:
                        throw new IllegalArgumentException("Unexpected value: " + thanu);
        };

        System.out.println(exp);

    }
}
