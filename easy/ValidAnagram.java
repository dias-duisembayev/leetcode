//link https://leetcode.com/problems/valid-anagram/description/

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        var arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[(int)s.charAt(i) - 'a'] += 1;
        }

        for (int i = 0; i < t.length(); i++) {
            if (arr[(int)t.charAt(i) - 'a'] == 0) return false; 
            arr[(int)t.charAt(i) - 'a'] -= 1;
        }
        return true;
    }
}
