class Casio {
    public void add(int a, int b) {
        System.out.println(a + b);
    }
    // overloading
    public void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }
}

public class Calculator {

    public static void main(String[] args) {
        Casio a = new Casio();
        a.add(1,2);
        a.add(1,2,3);
    }
}
