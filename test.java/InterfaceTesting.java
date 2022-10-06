interface Demo {

    void demo();
    default void show() {
        System.out.println("I'm default method");
    }
}

class Implementer implements Demo {
    public void demo() {
        System.out.println("Demo");
    }
}

public class InterfaceTesting {
    public static void main(String[] args) {
        Implementer a = new Implementer();
        a.demo();
        a.show();
    }
}
