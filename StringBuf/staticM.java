package StringBuf;

class Mobile {
    String brand;
    static String Name;
    int price;


    public void show(){
        System.out.println(brand + ":" + Name + ":" + price);
    }   

    public static void show1(Mobile m){
        System.out.println(m.brand + ":" + Name + ":" +m. price );
    } 
}

public class staticM {

    public static void main(String args[]){
        
        Mobile m1 = new Mobile();
        m1.brand = "Samsung";
        Mobile.Name = "Galaxy";
        m1.price = 50000;

        Mobile m2 = new Mobile();
        m2.brand = "Apple";
        Mobile.Name = "Iphone";
        m2.price = 100000;

      
      m1.show();
      Mobile.show1(m2);
    }

     
}
