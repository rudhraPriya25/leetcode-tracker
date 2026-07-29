// Last updated: 7/29/2026, 2:47:21 PM
1import java.util.*;
2
3class MyQueue {
4    Stack<Integer> inStack;
5    Stack<Integer> outStack;
6
7    public MyQueue() {
8        inStack = new Stack<>();
9        outStack = new Stack<>();
10    }
11
12    public void push(int x) {
13        inStack.push(x);
14    }
15
16    public int pop() {
17        shiftStacks();
18        return outStack.pop();
19    }
20
21    public int peek() {
22        shiftStacks();
23        return outStack.peek();
24    }
25
26    public boolean empty() {
27        return inStack.isEmpty() && outStack.isEmpty();
28    }
29
30    private void shiftStacks() {
31        if (outStack.isEmpty()) {
32            while (!inStack.isEmpty()) {
33                outStack.push(inStack.pop());
34            }
35        }
36    }
37}
38