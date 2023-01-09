// link https://leetcode.com/problems/climbing-stairs/description/
class Solution {
    public int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        var previous = 1;
        var current = 2;
        for (int i = 3; i <= n; i++) {
            var temp = previous;
            previous = current;
            current += temp;
        }
        return current;
    }
}
