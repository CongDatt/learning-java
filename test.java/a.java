import java.util.*;

public class a {
    public static void main(String[] args) {
        Map<Integer, String> myMap = new HashMap<>();

        myMap.put(1, "Dinh");
        myMap.put(2, "Khiem");
        myMap.put(3, "Dat");
        myMap.put(4, "Doan");


//        myMap.get(0) -> return value or null
//        for(Map.Entry<Integer,String> entry : myMap.entrySet()) {
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }
        // Java 10 +
//        for(var entry : myMap.entrySet()) {
//            System.out.println(entry.getKey() + " / " + entry.getValue());
//        }
    }
}
