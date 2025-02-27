package ThreadsAt;

class Counter{
    int count;
    public synchronized void increment(){
        count++;
    }
}

public class Race {
    public static void main(String[] args) {
        Counter c = new Counter();
        Thread t1 = new Thread(new Runnable(){
            public void run(){
                for(int i = 0; i < 1000; i++){
                    c.increment();
                }
            }
        });
        Thread t2 = new Thread(new Runnable(){
            public void run(){
                for(int i = 0; i < 1000; i++){
                    c.increment();
                }
            }
        });
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }catch(Exception e){
            e.printStackTrace();

}
        System.out.println(c.count);
    }
}
// What is the output of the following code?   