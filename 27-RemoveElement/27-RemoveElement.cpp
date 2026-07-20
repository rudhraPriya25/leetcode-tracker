// Last updated: 7/20/2026, 10:14:43 AM
class Solution {
public:
    int removeElement(vector<int>& nums, int val) {
        int k = 0; // Index for placing non-val elements

        for (int i = 0; i < nums.size(); ++i) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                ++k;
            }
        }

        return k;
    }
};
