//link https://leetcode.com/problems/pascals-triangle-ii/description/

class Solution {
    public List<Integer> getRow(int rowIndex) {
        var previousList = new ArrayList<Integer>();
        for (int i = 0; i <= rowIndex; i++) {
            var result = new ArrayList<Integer>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    result.add(1);
                } else {
                    var x = previousList.get(j);
                    var y = previousList.get(j-1);
                    result.add(x+y);
                }
            }
            previousList = result;
        } 
        return previousList;
    }
}
