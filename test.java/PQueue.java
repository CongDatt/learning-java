import java.util.Queue;
import java.util.PriorityQueue;

public class PQueue {
    public static void main(String[] args) {
        Queue<String> danhsachSv = new PriorityQueue<String>();

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
