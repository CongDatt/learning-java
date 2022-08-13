import java.util.Scanner;

class Hello {

    public static void main(String[] args) {
        int n = 3;
        String binaryNumber = "";

        while(n > 0) {
            binaryNumber = (n%2) + binaryNumber;
            n = n / 2;
        }
        System.err.println(binaryNumber);
    }
}