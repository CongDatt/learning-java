import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] myArray = new int[10];

        for(int i = 0; i < myArray.length; i ++) {
            System.out.println("Please in put item of array: ");
            myArray[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(myArray));
    }
}
