import java.util.Vector;

public class Stringd {
    public static void main(String[] args) {
        Vector<Integer> vec = new Vector<>();
        for (int i = 1; i <= 10; i++) {
            vec.add(i);
        }
        System.out.println("Add 10 element : " + vec);
        for (int i = 4; i <= 7; i++) {
            vec.remove(4);
        }
        System.out.println("After remove element 5th position to 8th position : " + vec);
        System.out.println("Size of vec : " + vec.size());
        vec.add(22);
        vec.add(23);
        System.out.println("After add some element final output is : " + vec);
    }
}
