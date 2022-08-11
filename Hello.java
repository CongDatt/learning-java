import java.time.LocalDate;
import java.util.ArrayList;

class Hello {

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        
        // add item to array
        arr.add("cong dat");
        arr.add("cong doan");
        arr.add("cong dinh");
        arr.add("thi khiem");

        // remove item 
        arr.remove(0);

        // access to item 
        arr.get(0);

        // change item 
        arr.set(2, "cong cong");

        // remove all item 
        // arr.clear();

        // get size

        // arr.size();

        for(String i : arr) {
            System.out.println(i);
        }
        
    }
}