import java.util.HashMap;
import java.util.HashSet;

public class LSWRC {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int maxSubLen = 0;
        HashMap<Character, Integer> lastPos = new HashMap<>();
        for (int left = 0, right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);
            if (lastPos.containsKey(rightChar)) {
                left = Math.max(left, lastPos.get(rightChar) + 1);
            }
            lastPos.put(rightChar, right);
            maxSubLen = Math.max(maxSubLen, right - left + 1);
        }
        return maxSubLen;
    }
}