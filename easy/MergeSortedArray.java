//link https://leetcode.com/problems/merge-sorted-array/description/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        var f = m-1;
        var s = n-1;
        for (int i = m+n-1; i >= 0; i--) {
            if (s < 0) {
                nums1[i] = nums1[f];
                f--;
            } else if (f < 0){
                nums1[i] = nums2[s];
                s--;               
            } else {
                if (nums1[f] > nums2[s]) {
                    nums1[i] = nums1[f];
                    f--;
                } else {
                    nums1[i] = nums2[s];
                    s--;
                }
            }

        }
    }
}
