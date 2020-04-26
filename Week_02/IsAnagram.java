package homework;

import java.util.Arrays;

public class IsAnagram {
/**工具类方法*/
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        String[] arrs = s.split("");
        String[] arrt = t.split("");
        Arrays.sort(arrs);
        Arrays.sort(arrt);
        return Arrays.equals(arrs,arrt);
    }
    /**计数法*/
    public static boolean countIsAnagram(String s , String t ) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a'] ++;
        }
        for (int i = 0; i < t.length(); i++) {
            count[t.charAt(i) - 'a'] --;
            if (count[t.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
