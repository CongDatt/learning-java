public class JavaString {
    public static void main(String[] args) {
        String a = "a";
        String aa = "a"; // store in String heap
        String a2 = new String("a"); // store in String pool

        System.out.println(a == aa); // true
        System.out.println(a == a2); // false
        // testing
    }
}