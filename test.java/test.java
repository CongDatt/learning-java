import java.sql.Connection;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        Connection connection = JDBCUtil.getConnection();

        int[] a = new int[] {1,0,4,4,5,7,8};
        int[] b = new int[10];

        Arrays.sort(a);
        Arrays.fill(b,10);
        System.out.println("Mang a la: " + Arrays.toString(a));
        System.out.println("Search: " + Arrays.binarySearch(a,4));
        System.out.println("Mang b la: " + Arrays.toString(b));
    }
}
