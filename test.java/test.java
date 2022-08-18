import java.sql.Connection;
import java.util.Scanner;
import java.util.Stack;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<String> stack = new Stack<>();
        System.out.println("Nhap chuoi vao: ");
        String s = sc.nextLine();
        for(int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i)+"");
        }
        System.out.println("Chuoi dao nguoc: ");
        for(int i = 0; i < s.length(); i++) {
            System.out.print(stack.pop());
        }
    }
}
