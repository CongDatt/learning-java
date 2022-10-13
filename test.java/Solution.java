import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        String s = "foo";
        String t = "bar";
        String[] sArr = s.split("");
        String[] tArr = t.split("");

        Map<String, String> myMap = new HashMap<String, String>();
        for(int i = 0; i < sArr.length; i++) {
            myMap.put(tArr[i],sArr[i]);
        }

        System.out.println(myMap.size());
    }
}
