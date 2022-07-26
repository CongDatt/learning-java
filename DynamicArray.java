import java.util.ArrayList;

public class DynamicArray {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("String 1");   
        arr.add("String 2");   
        arr.add("String 3");   
        arr.add("String 4"); 
        
        System.out.println(arr.get(0)); // String 1
        System.out.println(arr.size()); // 4
    }
}
