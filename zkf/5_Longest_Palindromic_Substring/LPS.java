public class LPS{
    private int start = 0;
    private int maxLen = 0;

    public String longestPalindrome(String s) {
        if (s.length() < 2) {
            return s;
        }

        for (int i = 0; i < s.length() - 1; i++) {
            extendPalindrome(s, i, i);
            extendPalindrome(s, i, i + 1);
        }
        return s.substring(start, start + maxLen);
    }

    private void extendPalindrome(String s, int low, int high) {
        if (s.charAt(low) != s.charAt(high)) {
            return;
        }
        while (low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
            low -= 1;
            high += 1;
        }
        high -= 1;
        low += 1;
        if (high - low + 1 > maxLen) {
            start = low;
            maxLen = high - low + 1;
        }
    }

	
}