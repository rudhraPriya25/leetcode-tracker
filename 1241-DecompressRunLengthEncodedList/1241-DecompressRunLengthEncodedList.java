// Last updated: 7/9/2026, 10:24:02 AM
import java.util.*;

class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> result = new ArrayList<>();

        // Step 1: process pairs
        for (int i = 0; i < nums.length; i += 2) {
            int freq = nums[i];
            int val = nums[i + 1];

            // Step 2: add val freq times
            for (int j = 0; j < freq; j++) {
                result.add(val);
            }
        }

        // Step 3: convert list to array
        int[] ans = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }

        return ans;
    }
}
