//link https://leetcode.com/problems/add-binary/description/

class Solution {
    public String addBinary(String a, String b) {
        if (a.length() - b.length() > 0) {
            var diff = a.length() - b.length();
            for (int i = 0; i < diff; i++) {
                b = "0" + b;
            }
        } else if (a.length() - b.length() < 0) {
            var diff = b.length() - a.length();
            for (int i = 0; i < diff; i++) {
                a = "0" + a;
            }
        }
        
        var carry = false;
        var result = "";
        for (int i = a.length() - 1; i >=0;  i--) {
            if (a.charAt(i) == '1' && b.charAt(i) == '1') {
                if (carry) {
                    result = "1" + result;
                } else {
                    result = "0" + result;
                }
                carry = true;
            } else if(a.charAt(i) == '0' && b.charAt(i) == '0') {
                if (carry) {
                    result = "1" + result;
                } else {
                    result = "0" + result;
                }
                carry = false;
            } else {
                if (carry) {
                    result = "0" + result;
                } else {
                    result = "1" + result;
                    carry = false;
                }
            }
        }
        
        if (carry) {
            return "1" + result;
        }

        return result;

    }
}
