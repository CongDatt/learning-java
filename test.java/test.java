import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        List<String> myListTwo = new ArrayList<>();
        List<String> myListThree = new ArrayList<>();

        myList.add("1");
        myListTwo.add("2");

        myListThree.addAll(myListTwo);
        myListThree.addAll(myList);

        System.out.println(myListThree);

    }
}
