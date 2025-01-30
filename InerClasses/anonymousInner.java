package InerClasses;
class A{
    public void show(){
        System.out.println("In A show");
    } 
}
public class anonymousInner {

    public static void main(String[] args) {
        A obj = new A(){
            public void show(){
                System.out.println("In Anonymous class");
            }
        };
        obj.show();
    }

}
