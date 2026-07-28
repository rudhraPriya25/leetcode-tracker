// Last updated: 7/28/2026, 9:14:25 PM
import java.util.*;

class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        TreeSet<Long> set = new TreeSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            long num = nums[i];

            // Find the smallest number >= num
            Long ceil = set.ceiling(num);
            if (ceil != null && ceil - num <= valueDiff) return true;

            // Find the largest number <= num
            Long floor = set.floor(num);
            if (floor != null && num - floor <= valueDiff) return true;

            set.add(num);

            // Maintain sliding window of size indexDiff
            if (i >= indexDiff) {
                set.remove((long) nums[i - indexDiff]);
            }
        }
        
        return false;
    }
}
