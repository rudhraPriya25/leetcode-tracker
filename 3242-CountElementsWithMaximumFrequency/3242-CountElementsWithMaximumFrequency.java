// Last updated: 7/9/2026, 10:23:53 AM
import java.util.*;

class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        int maxFreq = 0;

        // Count frequencies
        for (int num : nums) {
            int count = freqMap.getOrDefault(num, 0) + 1;
            freqMap.put(num, count);
            maxFreq = Math.max(maxFreq, count);
        }

        // Sum frequencies of elements with max frequency
        int total = 0;
        for (int count : freqMap.values()) {
            if (count == maxFreq) {
                total += count;
            }
        }

        return total;
    }
}
