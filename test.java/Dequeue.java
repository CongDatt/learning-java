import java.util.ArrayDeque;
import java.util.Deque;

public class Dequeue {
    public static void main(String[] args) {
        Deque<String> danhsachSv = new ArrayDeque<>();

        danhsachSv.offer("Cong dat ne 1");
        danhsachSv.offer("Cong dat ne 11");
        danhsachSv.offerFirst("First ne");
        danhsachSv.offerLast("Last ne");
        danhsachSv.offer("Cong dat ne 1111");

        while (true) {
            String ten = danhsachSv.poll();
            if(ten == null) {
                break;
            }
            System.out.println(ten);
        }
    }
}
