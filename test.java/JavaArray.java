import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class JavaArray {
    public static void main(String[] args) {
        Set<Integer> setJava = new HashSet<Integer>();
        setJava.add(1);
        setJava.add(2);
        setJava.add(3);
        setJava.add(4);

//        setJava.contains(5) -> check a item contains or not
//        setJava.clear();    -> delete all items in set
//        System.out.println(setJava.isEmpty()); -> check empty
        System.out.println(setJava);
    }
}
