//link https://leetcode.com/problems/fizz-buzz/description/

class Solution {
    public List<String> fizzBuzz(int n) {
        var list = new LinkedList<String>();
       for (int i = 1; i <= n; i++) {
            if (i%15 == 0) list.add("FizzBuzz");
            else if (i%5 == 0) list.add("Buzz");
            else if (i%3 == 0) list.add("Fizz");
            else list.add(Integer.toString(i));   
       }
       return list; 
    }
}
