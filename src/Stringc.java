import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Stringc {
    public static void arra() {
        ArrayList<Integer> arr = new ArrayList<>();
          for (int i = 1; i <= 10; i++) {
                arr.add(i);
            }
            System.out.println("Add 10 elements : " + arr);
            arr.remove(4);
            System.out.println("After remove 5th element : "+ arr);
            arr.set(2,11);
            System.out.println("Replace 3rd element to new value");
            System.out.println("Print all element in reverse order : ");
            for(int i=arr.size()-1;i>=0;i--){
                System.out.print(arr.get(i)+" ");
            }
        System.out.println("\n");
    }

        public static void linke() {
            LinkedList<String> list = new LinkedList<>();
                list.add("Nanded");
                list.add("Nagpur");
                list.add("Akola");
                list.add("Amravati");
                list.add("Washim");
                System.out.println("Add 5 city name : " + list);
                list.add(1, "Mumbai");
                System.out.println("add 1 city at 2nd position : " + list);
                list.removeFirst();
                System.out.println("After remove 1st city : " + list );
            System.out.print("Print in reverse : ");
            for(int i=list.size()-1;i>=0;i--){
                System.out.print(list.get(i) + " ");
            }
            System.out.println("\n");
    }

        public static void vecto() {
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

    public static void main(String[] args) {
        arra();
        linke();
        vecto();
    }
}
