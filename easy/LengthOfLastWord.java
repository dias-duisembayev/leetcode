//link https://leetcode.com/problems/length-of-last-word/description/

class Solution {
    public int lengthOfLastWord(String s) {
        var i = s.length() - 1;
        var trailingSpaceCounter = 0;
        while (s.charAt(i) == ' ') {
            i--;
            trailingSpaceCounter++;
        }
        while (i >= 0) {
            if (s.charAt(i) == ' ') {
                break;
            }
             i--;
        }
        return s.length() - i - 1 - trailingSpaceCounter;
    }
}
