// link - https://leetcode.com/problems/roman-to-integer/description/

class Solution {
    public int romanToInt(String s) {
        var result = 0;
        for (int i=0; i < s.length(); i++) {
            if (i+1 < s.length() && (getValueFromChar(s.charAt(i)) < getValueFromChar(s.charAt(i+1)))){
                result -= getValueFromChar(s.charAt(i));
                continue;
            } 
            result += getValueFromChar(s.charAt(i));
            
        }
        return result;
    }

    public int getValueFromChar (char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case default:
                return 1000;
        }
    }
}
