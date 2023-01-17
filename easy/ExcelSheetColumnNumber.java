//link https://leetcode.com/problems/excel-sheet-column-number/description/

class Solution {
    public int titleToNumber(String columnTitle) {
        var result = 0;
        var index = 0;
        for (int i = columnTitle.length() - 1; i >= 0; i--) {
            result += getNumber(columnTitle.charAt(i)) * Math.pow (26, index);
            index++;
        }
        return result;
    }

    public int getNumber(char c) {
        return (int) c - 64;
    }
}
