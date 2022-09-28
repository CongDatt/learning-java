import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] myArray = { 1,34,32, 5, 90,45, 29 };

        for(int i = 1; i < myArray.length; i++) {
            int cur = myArray[i]; // 32
            int j = i; // 2

            while (j > 0 && myArray[j - 1] > cur) { // 34 > 32
                myArray[j] = myArray[j - 1]; // 1, 34 , 34
                j -- ; // 1
            }
            myArray[j] = cur; // 1, 32 , 34
        }
        System.out.println(Arrays.toString(myArray));
    }
}
