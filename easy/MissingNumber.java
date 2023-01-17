//link https://leetcode.com/problems/missing-number/description/

class Solution {
    public int missingNumber(int[] nums) {
        var aSum = (nums.length * (1 + nums.length))/2;
        var realSum = 0;
        for (int i = 0; i < nums.length; i++) {
            realSum += nums[i];
        }
        return aSum - realSum;
    }
}
