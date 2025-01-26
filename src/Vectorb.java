import java.util.Vector;

public class Vectorb {
    public static void main(String[] args) {
        Vector<Integer> vector= new Vector<>();
        String saim= "Hrida";
        vector.add(1);
        vector.addElement(2);
        System.out.println(vector);
        vector.removeAllElements();
        System.out.println(vector.capacity());
        System.out.println(vector);
    }
}
