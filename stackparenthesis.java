import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) { 
            if (c == '(') 
                stack.push(')'); 
            else if (c == '{') 
                stack.push('}'); 
            else if (c == '[') 
                stack.push(']'); 
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String test1 = "()";
        String test2 = "()[]{}";
        String test3 = "(]";
        String test4 = "([)]";
        String test5 = "{[]}";

        System.out.println(solution.isValid(test1)); 
        System.out.println(solution.isValid(test2));
        System.out.println(solution.isValid(test3)); 
        System.out.println(solution.isValid(test4)); 
        System.out.println(solution.isValid(test5)); 
    }
}
