public class Hello {
    public static void main(String[] args) {
        Box box = new Box<Integer>(10);
        Box boxDouble = new Box<Double>(11.2);
        Box boxString = new Box<String>("Hello");

        System.out.println(box);
        System.out.println(boxDouble);
        System.out.println(boxString);
    }
}
