// Last updated: 7/9/2026, 10:25:28 AM
class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        unordered_map<string, vector<string>> anagramGroups;

        for (string& s : strs) {
            string key = s;
            sort(key.begin(), key.end());  // Sort characters to form the key
            anagramGroups[key].push_back(s);
        }

        vector<vector<string>> result;
        for (auto& group : anagramGroups) {
            result.push_back(group.second);
        }

        return result;
    }
};
