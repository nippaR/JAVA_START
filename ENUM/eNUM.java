package ENUM;

enum Status{
    Running,Error,Success,Pending;
}

public class eNUM {
    public static void main(String args[]){
        
        Status[] s = Status.values();

        for(Status stu : s){
            System.out.println(stu + " " + stu.ordinal());
        }
        // System.out.println(s.ordinal());
    }
}