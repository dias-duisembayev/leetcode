// link https://leetcode.com/problems/valid-parentheses/description/
class Solution {
    public boolean isValid(String s) {
        if (s.length() < 2) return false;

        var stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            var c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
                continue;
            } 
                if (stack.isEmpty()) return false;
                 var top = stack.pop();
                 if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '['))
                 return false;
            
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }    
    }
}
