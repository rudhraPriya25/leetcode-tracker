// Last updated: 7/20/2026, 10:14:41 AM
class Solution {
public:
    int strStr(string haystack, string needle) {
        int hLen = haystack.length();
        int nLen = needle.length();

        if (nLen == 0) return 0; // Empty needle is always found at index 0
        if (nLen > hLen) return -1;

        for (int i = 0; i <= hLen - nLen; ++i) {
            if (haystack.substr(i, nLen) == needle) {
                return i;
            }
        }

        return -1;
    }
};
