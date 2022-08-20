import java.sql.Connection;

public class test {
    public static void main(String[] args) {
        Box a = new Box<Integer>(10);
        System.out.println(a.getValue());
    }
}
