class Solution {
    public String removeOuterParentheses(String s) {
        char[] result = new char[s.length()];
        int count = 0, index = 0;
        
        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (count > 0) result[index++] = '(';
                count++;
            } else {
                count--;
                if (count > 0) result[index++] = ')';
            }
        }
        
        return new String(result, 0, index);
    }
}
