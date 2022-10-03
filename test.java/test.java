import javax.swing.plaf.synth.SynthTextAreaUI;
import java.sql.Connection;

public class test {
    public static void main(String[] args) {
//        Connection connection = JDBCUtil.getConnection();
//        System.out.println(connection);

        byte b = 5; // 1 byte -> 8 bits -> -128 - 127
        short s = 5; // 2 bytes -> 16 bits -> -32768 - 32767
        int i = 5; // 4 bytes -> 32 bits ->
        long l = 5; // 8 bytes
        float f = 5.5f;
        double d = 5.5;
        char c = 'A';


        double d1 = 5; // implicit conversion
        int k = (int) 5.6; // type casting

        System.out.println(d1);
        System.out.println(k);
    }
}
