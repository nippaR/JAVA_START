package StringBuf;
public class StBuf {
	public static void main(String args[]){

        StringBuffer sub = new StringBuffer("Thanuja");{
            System.out.println(sub);
            sub.append("Nipun");
            System.out.println(sub);
            sub.insert(7, " ");
            System.out.println(sub);
            sub.replace(7, 8, "RA");
            System.out.println(sub);
            sub.delete(7, 8);
            System.out.println(sub);
            sub.reverse();
            System.out.println(sub);
        }
    }
}
