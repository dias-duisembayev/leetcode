//link https://leetcode.com/problems/number-of-1-bits/description/

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        var count == 0;
        while(n != 0) {
            int isOne = n & 1;
            count += isOne;
            n = n >>> 0;
        }
        return count;
}
