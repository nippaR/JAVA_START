public record Activitywhile() {
    public static void main(String[] args) {
        
        // int i = 1;
        // while (i <= 2) {
        //     System.out.println("******");
        //     if (i == 2 ) {
        //         break;
        //     }
        //     else {
        //         int j = 1;
        //         while (j<=5) {
    
        //             System.out.println("*    *");
        //             j++;
        //         }
        //     }
           
        //     i++;
        // };
                int rows = 5;
                int i = 1;
                
                while (i <= rows) {
                    int j = 1;
                    while (j <= i) {
                        System.out.print("*");
                        j++;
                    }
                    System.out.println();
                    i++;
                };
    }
}
