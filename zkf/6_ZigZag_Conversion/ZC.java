import java.util.LinkedList;

class ZC {
    public String convert(String s, int numRows) {
        char[] chars = s.toCharArray();
        StringBuffer[] rows = new StringBuffer[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuffer();
        }
        int i = 0;
        int len = s.length();
        while (i < len) {
            for (int idx = 0; idx < numRows && i < len; idx++) // vertically down
                rows[idx].append(chars[i++]);
            for (int idx = numRows - 2; idx >= 1 && i < len; idx--) // obliquely up
                rows[idx].append(chars[i++]);
        }
        for (i = 1; i < numRows; i++) {
            rows[0].append(rows[i]);
        }
        return rows[0].toString();
    }
	
}