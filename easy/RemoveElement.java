//link https://leetcode.com/problems/remove-element/description/

class Solution {
    public int removeElement(int[] nums, int val) {
        var count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                count++;
            } else if (count > 0) {
                nums[i-count] = nums[i];
                nums[i] = val;
            }
        }
        return nums.length - count;
    }
}
