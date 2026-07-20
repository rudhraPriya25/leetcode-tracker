// Last updated: 7/20/2026, 10:14:21 AM
class Solution {
public:
    void backtrack(vector<int>& candidates, int target, vector<vector<int>>& result, vector<int>& current, int start) {
        if (target == 0) {
            result.push_back(current);
            return;
        }
        if (target < 0) return;

        for (int i = start; i < candidates.size(); ++i) {
            current.push_back(candidates[i]);
            backtrack(candidates, target - candidates[i], result, current, i); // not i+1 because we can reuse same element
            current.pop_back(); // backtrack
        }
    }

    vector<vector<int>> combinationSum(vector<int>& candidates, int target) {
        vector<vector<int>> result;
        vector<int> current;
        backtrack(candidates, target, result, current, 0);
        return result;
    }
};
