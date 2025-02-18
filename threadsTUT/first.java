package threadsTUT;

class A extends Thread{
   public void run(){
        for (int i = 0; i < 10; i++){
            System.out.println("Hello");
            try{
                Thread.sleep(10);
            }catch(Exception e){
                e.printStackTrace();
        }
    }
}
}

class B extends Thread{
    public void run(){
        for (int i = 0; i < 10; i++){
            System.out.println("Hi");
            try{
                Thread.sleep(10);
            }catch(Exception e){
                e.printStackTrace();
        }
    }
}
}


public class first {
    public static void main(String[] args) {
        A obj1 = new A();

        obj1.setPriority(Thread.MAX_PRIORITY-1);

        try{
            Thread.sleep(2);   
        }catch(Exception e){
            e.printStackTrace();
        }
        B obj2 = new B();


        obj1.start();
        obj2.start();
    }
}