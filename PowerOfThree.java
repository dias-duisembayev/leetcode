//link https://leetcode.com/problems/power-of-three/description/

class Solution {
    public boolean isPowerOfThree(int n) {
        if (n == 3 || n == 1) return true;
        if (n < 3 || n%3 != 0) return false;
        return isPowerOfThree(n/3);
    }
}
