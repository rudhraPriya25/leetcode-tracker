// Last updated: 7/28/2026, 7:36:21 AM
1class MinStack {
2    private Stack<Integer> stack;
3    private Stack<Integer> minStack;
4
5    public MinStack() {
6        stack = new Stack<>();
7        minStack = new Stack<>();
8    }
9
10    public void push(int value) {
11        stack.push(value);
12        if (minStack.isEmpty() || value <= minStack.peek()) {
13            minStack.push(value);
14        }
15    }
16
17    public void pop() {
18        int removed = stack.pop();
19        if (removed == minStack.peek()) {
20            minStack.pop();
21        }
22    }
23
24    public int top() {
25        return stack.peek();
26    }
27
28    public int getMin() {
29        return minStack.peek();
30    }
31}
32