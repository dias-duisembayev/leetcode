//link https://leetcode.com/problems/happy-number/description/

class Solution {
    public boolean isHappy(int n) {
        var list = new ArrayList<Integer>();
        while (!list.contains(n)) {
            list.add(n);
            n = handle(n);
            if (n == 1) return true;
        }
        return false;
    }

    public int handle(int n) {
        var result = 0;
        while (n > 0) {
            var digit = n % 10;
            n = n/10;
            result = result + digit*digit;
        }
        return result;    
    }
}

