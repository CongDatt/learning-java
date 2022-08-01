import java.util.Scanner;

public class Cau3 {
  public static void main(String[] args) {
    String str, rev = "";
    char ch;
    int result;
    Scanner sc = new Scanner(System.in);

    str = sc.nextLine();
    for (int i = 0; i < str.length(); i++) {
      ch = str.charAt(i); // extracts each character
      rev = ch + rev; // adds each character in front of the existing string
    }

    result = Integer.parseInt(str) - Integer.parseInt(rev);

    System.out.println(str + " - " + rev + " = " + result);

    sc.close();
  }
}
