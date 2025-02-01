package ENUM;

enum Status{
    Running,Error,Success,Pending;
}

public class ifswitchENM {
    
    public static void main(String args[]){
        
        Status s = Status.Running;

        // if(s == Status.Running){
        //     System.out.println("All Good");
        // }
        // else if(s == Status.Error){
        //     System.out.println("getting Error");
        // }
        // else if(s == Status.Success){
        //     System.out.println("All Good");
        // }
        // else if(s == Status.Pending){
        //     System.out.println("Waiting");
        // }

        switch(s){
            case Running:
                System.out.println("All Good");
                break;
            case Error:
                System.out.println("getting Error");
                break;
            case Success:
                System.out.println("All Good");
                break;
            default:
                System.out.println("Waiting");
                break;
        }
    }
    
}
