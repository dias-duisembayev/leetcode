// link https://leetcode.com/problems/two-sum/description/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        var map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(target-nums[i]) != null) {
                return new int [] {i, map.get(target-nums[i])};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
