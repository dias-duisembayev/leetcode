//link https://leetcode.com/problems/valid-palindrome/description/

class Solution {
    public boolean isPalindrome(String s) {
        var l = 0;
        var r = s.length() - 1;
        while (l < r) {
            var lc = s.charAt(l);
            var rc = s.charAt(r);
            if (!Character.isLetterOrDigit(lc)) {
                l++;
                continue;
            }
            if (!Character.isLetterOrDigit(rc)) {
                r--;
                continue;
            }
            if (Character.toLowerCase(lc) != Character.toLowerCase(rc)) return false;
            l++; r--;
        }
        return true;
    }
}
