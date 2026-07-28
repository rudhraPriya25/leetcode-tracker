// Last updated: 7/28/2026, 7:34:10 AM
1class Solution {
2    public int evalRPN(String[] tokens) {
3        Stack<Integer> stack = new Stack<>();
4
5        for (String token : tokens) {
6            if (isOperator(token)) {
7                int b = stack.pop(); // second operand
8                int a = stack.pop(); // first operand
9                stack.push(applyOp(a, b, token));
10            } else {
11                stack.push(Integer.parseInt(token));
12            }
13        }
14
15        return stack.pop();
16    }
17
18    private boolean isOperator(String s) {
19        return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/");
20    }
21
22    private int applyOp(int a, int b, String op) {
23        switch (op) {
24            case "+": return a + b;
25            case "-": return a - b;
26            case "*": return a * b;
27            case "/": return a / b; // truncates toward zero
28        }
29        return 0;
30    }
31}
32