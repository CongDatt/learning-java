// int / float / double
// Integer

public class StaticDemo {

    public static void main(String[] args) {
        int i = 5; // Primitive data type -> int / float / double
        Integer ii = new Integer(3); // Wrapper class - Boxing
        Double doubleee = 5.5; // AutoBoxing
        int j = ii.intValue(); // unboxing - unwrapping


        System.out.println(i);
        System.out.println(ii);
        System.out.println(doubleee);
        System.out.println(j);
    }
}
