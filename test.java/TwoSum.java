import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++) {
            int remain = target - nums[i];
            if(map.containsKey(remain)) {
                result[0] = i;
                result[1] = map.get(remain);
                return result;
            } else {
                map.put(nums[i], i);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = { 1,2,3,4,5,4,9 };
        System.out.println(Arrays.toString(twoSum(nums, 10)));
    }
}