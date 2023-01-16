//link https://leetcode.com/problems/pascals-triangle/description/

class Solution {
    public List<List<Integer>> generate(int numRows) {
        var result = new ArrayList<List<Integer>>();
        for (int i = 0; i < numRows; i++) {
            var innerList = new ArrayList<Integer>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    innerList.add(1);
                } else {
                    var first = result.get(result.size() - 1).get(j-1);
                    var second = result.get(result.size() - 1).get(j);
                    innerList.add(first+second);
                }
            }  
            result.add(innerList);
        }
        return result;
    }
}
