//link https://leetcode.com/problems/longest-common-prefix/description/
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }
        String lcp = strs[0];
        for (int i = 1; i < strs.length; i++) {
            lcp = getCommonPrefix(lcp, strs[i]);    
        }
        return lcp;
    }

    private String getCommonPrefix(String s1, String s2) {
        var len = s1.length() > s2.length() ? s2.length() : s1.length();
        var prefix = "";
        for (int i = 0; i < len; i++) {
            if (s1.charAt(i) == s2.charAt(i)) prefix += s1.charAt(i);
            else break;
        } 
        return prefix;
    }
}
