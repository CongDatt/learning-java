import java.util.Scanner;

public class Main {

    public static int caua(String org) {

        String rev = "";

        for (int i = 0; i < org.length(); i ++){
            char ch = org.charAt(i);
            rev = ch + rev;
        }

        int result = Integer.parseInt(org) - Integer.parseInt(rev);

        
        return result;
    }

    static void caub(String str, String ans){ 
        // If string is empty
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }
 
        for (int i = 0; i < str.length(); i++) {
 
            // ith character of str
            char ch = str.charAt(i);
 
            // Rest of the string after excluding
            // the ith character
            String ros = str.substring(0, i) +
                         str.substring(i + 1);
            
            // System.out.println("Here: " + ros);
 
            // Recursive call
            caub(ros, ans + ch);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        int t = caua(input);
        System.out.println(t);
        caub(input, "");
        System.out.println();
    }
  }