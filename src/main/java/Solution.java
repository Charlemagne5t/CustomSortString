import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String customSortString(String order, String s) {
        Map<Character, Integer> map = new HashMap<>();
        char ch = 'a';
        for (int i = 0; i < 26; i++) {
            map.put(ch++, 0);
        }
        int c = 1;
        for (int i = 0; i < order.length(); i++) {
            map.put(order.charAt(i), c++);
        }
        Character[] arr = new Character[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }

        Arrays.sort(arr, (a, b) -> map.get(a) - map.get(b));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}
