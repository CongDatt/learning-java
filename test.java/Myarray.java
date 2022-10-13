import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

public class Myarray {
    public static void main(String[] args) {
        Collection <Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(3);


        Set<Integer> mySet = new TreeSet<>();
        mySet.add(5);
        mySet.add(6);
        mySet.add(8);
        mySet.add(2);

        System.out.println("my set: " +mySet);
//        System.out.println(arr);
    }
}
