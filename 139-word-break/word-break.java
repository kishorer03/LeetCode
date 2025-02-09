import java.util.*;

class Solution {
    private Map<Integer, Boolean> memo = new HashMap<>();

    public boolean isSub(String str, List<String> wordDict) {
        return wordDict.contains(str); 
    }

    public boolean find(int i, String s, List<String> wordDict) {
        if (i == s.length()) {
            return true;
        }
        if (memo.containsKey(i)) {
            return memo.get(i); // Return precomputed result
        }

        for (int k = i; k < s.length(); k++) {
            if (isSub(s.substring(i, k + 1), wordDict)) {
                if (find(k + 1, s, wordDict)) {
                    memo.put(i, true);
                    return true;
                }
            }
        }

        memo.put(i, false);
        return false;
    }

    public boolean wordBreak(String s, List<String> wordDict) {
        return find(0, s, wordDict);
    }
}
