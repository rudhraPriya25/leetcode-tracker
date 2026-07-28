// Last updated: 7/28/2026, 4:05:01 PM
import java.util.*;

class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        backtrack(s, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(String s, int index, List<String> parts, List<String> result) {
        // Base case: 4 parts formed
        if (parts.size() == 4) {
            if (index == s.length()) {
                result.add(String.join(".", parts));
            }
            return;
        }

        // Try parts of length 1 to 3
        for (int len = 1; len <= 3; len++) {
            if (index + len > s.length()) break;

            String part = s.substring(index, index + len);

            // Validate part
            if ((part.startsWith("0") && part.length() > 1) || Integer.parseInt(part) > 255) {
                continue;
            }

            parts.add(part);
            backtrack(s, index + len, parts, result);
            parts.remove(parts.size() - 1); // backtrack
        }
    }
}
