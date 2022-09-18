import java.sql.Connection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class test {
    public static void main(String[] args) {
        ArrayList<String> users = new ArrayList<String>();

        users.add("Hello");
        users.add("Guys");

        for (String user : users) {
//            System.out.println(user);
        }

        myGenerics<String> a = new myGenerics<String>("string a");
        myGenerics<Integer> aNum = new myGenerics<>(10);

//        System.out.println(a.getValue());
//        System.out.println(aNum.getValue());

        List<Person> people = Arrays.asList(new Person("John", "Doe"),
                new Person("Bob", "Dole"),
                new Person("Ronald", "McDonald"),
                new Person("Alice", "McDonald"),
                new Person("Jill", "Doe"));
        Collections.sort(people);
        System.out.println(people);
    }
}
