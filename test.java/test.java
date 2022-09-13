import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        ArrayList<String> users = new ArrayList<String>();

        users.add("Hello");
        users.add("Guys");

        for (String user : users) {
            System.out.println(user);
        }
    }
}
