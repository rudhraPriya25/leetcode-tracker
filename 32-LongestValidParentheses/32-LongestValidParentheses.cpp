// Last updated: 7/20/2026, 10:14:36 AM
class Solution {
public:
    int longestValidParentheses(string s) {
        stack<int> stk;
        stk.push(-1); // Base for valid substring
        int maxLen = 0;

        for (int i = 0; i < s.length(); ++i) {
            if (s[i] == '(') {
                stk.push(i);
            } else {
                stk.pop();
                if (stk.empty()) {
                    stk.push(i); // Reset base
                } else {
                    maxLen = max(maxLen, i - stk.top());
                }
            }
        }

        return maxLen;
    }
};
