class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        int i;
        StringBuilder str = new StringBuilder();
        for (int j = 1; j <= numRows; j++) {
            i = j - 1;
            if (i >= s.length()) {
                        break;
                    }
            while (true) {
                if (j != numRows) {
                    str.append(s.charAt(i));
                    i += (numRows - j) * 2;
                    if (i >= s.length()) {
                        break;
                    }
                }
                if (j != 1) {
                    str.append(s.charAt(i));
                    i += (j - 1) * 2;
                    if (i >= s.length()) {
                        break;
                    }
                }

            }
        }
        return str.toString();
    }
}