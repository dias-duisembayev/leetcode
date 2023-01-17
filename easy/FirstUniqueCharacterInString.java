//link https://leetcode.com/problems/first-unique-character-in-a-string/description/

class Solution {
    public int firstUniqChar(String s) {
        var arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[(int) s.charAt(i) - 'a'] += 1;
        }
        for (int i = 0; i < s.length(); i++) {
            if (arr[(int) s.charAt(i) - 'a'] == 1) return i;
        }
        return -1;
    }
}
