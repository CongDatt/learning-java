
interface demo {

    void abc();
    static void show() {
        System.out.println("Static in show");
    }
}

public class InterfaceJava8 {

    public static void main(String[] args) {
        demo.show();
    }
}
