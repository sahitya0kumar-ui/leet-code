class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(0);
            } 
            else {
                int current = stack.pop();
                if (current == 0) {
                    current = 1;
                } 
                else {
                    current = current * 2;
                }
                int previous = stack.pop();
                stack.push(previous + current);
            }
        }
       return stack.pop();
    }
}
