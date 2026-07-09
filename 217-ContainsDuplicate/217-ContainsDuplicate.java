// Last updated: 7/9/2026, 10:24:19 AM
import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (seen.contains(num)) {
                return true;  // duplicate found
            }
            seen.add(num);
        }

        return false;  // no duplicates
    }
}
