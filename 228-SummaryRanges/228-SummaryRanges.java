// Last updated: 7/28/2026, 9:13:46 PM
import java.util.*;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums.length == 0) return result;

        int start = nums[0]; // start of current range

        for (int i = 1; i <= nums.length; i++) {
            // End of range when gap or end of array
            if (i == nums.length || nums[i] != nums[i-1] + 1) {
                if (start == nums[i-1]) {
                    result.add(String.valueOf(start));
                } else {
                    result.add(start + "->" + nums[i-1]);
                }
                if (i < nums.length) start = nums[i];
            }
        }

        return result;
    }
}
