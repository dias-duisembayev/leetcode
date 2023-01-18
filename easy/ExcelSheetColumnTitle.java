//link https://leetcode.com/problems/excel-sheet-column-title/description/

class Solution {
    public String convertToTitle(int columnNumber) {
        String res = "";
        while(columnNumber > 0) {
            columnNumber -= 1;
            var mod = columnNumber%26;   
            res = (char)('A' + mod) + res;
            columnNumber /= 26;
        }
        return res;    
    }
}
