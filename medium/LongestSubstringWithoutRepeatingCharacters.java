//link https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        var map = new HashMap<Character, Integer>();
        var max = 0;

        for (int l = 0, r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            if (map.containsKey(c) && map.get(c) >= l) {
                l = map.get(c) + 1;
            }
            max = Math.max(r-l+1, max);
            map.put(c, r);
        }
        return max;
    }
}
