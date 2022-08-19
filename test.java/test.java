import java.sql.Connection;
import java.util.LinkedList;
import java.util.Queue;

public class test {
    public static void main(String[] args) {
        Queue<String> danhsachSv = new LinkedList<String>();

        // Add to queue
        danhsachSv.offer("Cong dat 1");
        danhsachSv.offer("Cong dat 2");
        danhsachSv.offer("Cong dat 3");

        while (true) {
            String ten = danhsachSv.poll(); // get & delete
            if(ten == null) {
                break;
            }
            System.out.println(ten);
        }
    }
}
