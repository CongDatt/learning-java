public class InsertionSort {
    public static void main(String[] args) {
        int [] arr = { 1,3,2,4,5,6,8,7 };

        for(int i = 1; i < arr.length; i++) {
            int temp = arr[i]; // lay arr thu 2
            int j = i - 1; // lay arr dau tien
        
            while(j >= 0 && arr[j] > temp) { // neu arr thu 2 > arr dau tien
                arr[j+1] = arr[i]; // 
                j--; 
            }
            arr[j + 1] = temp;
        }

        for(int i : arr) {
            System.out.println(i);
        }
    }
}
