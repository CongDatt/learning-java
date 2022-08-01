import java.util.*;
public class ex1{
    public static void main(String[] args){

        Scanner scanIn = new Scanner(System.in);
        int n = 0;
        int[] array = new int[1000];
    
        n = scanIn.nextInt();
        for(int i=0; i<n; i++){
            array[i] = scanIn.nextInt();
        }

        if (n >= 0 && n <= 1000){
            System.out.println(result(array,n));
        }
    }

    public static int result(int[] array, int n){
        int res = 1;
 
        for (int i = 1; i < n; i++)
        {
            int j = 0;
            for (j = 0; j < i; j++)
                if (array[i] == array[j])
                    break;
    
            if (i == j)
                res++;
        }
        return res;
    }
}