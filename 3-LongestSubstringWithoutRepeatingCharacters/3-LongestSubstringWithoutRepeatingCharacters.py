# Last updated: 7/20/2026, 10:15:37 AM
class Solution:
    def lengthOfLongestSubstring(self, s):
        last_seen = {}
        left = max_len = 0

        for right, char in enumerate(s):
            if char in last_seen and last_seen[char] >= left:
                left = last_seen[char] + 1
            last_seen[char] = right
            max_len = max(max_len, right - left + 1)

        return max_len