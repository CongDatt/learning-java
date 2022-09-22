public class binarySearch {
    public static int BinarySearch(int[] array, int k) {
        int L = 0;
        int R = array.length - 1;

        while(L <= R) {
            int mid = (L + R) / 2;
            System.out.println("Mid:  " +mid);
            if(array[mid] == k) {
                return mid;
            } else if (array[mid] > k) {
                R = mid - 1;
                System.out.println("R: " + R);
            } else {
                L = mid + 1;
                System.out.println("L: " + L);
            }
        }
        return - 1;
    }
    public static void main(String[] args) {
        int[] array = { 2,5,8,12,16,23,38,56,72,91 };
        int k = 23;
        System.out.println(BinarySearch(array,k));
    }
}
