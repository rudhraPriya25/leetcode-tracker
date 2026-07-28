// Last updated: 7/28/2026, 4:02:27 PM
class Solution {
    public String reverseWords(String s) {
        // Step 1: Trim and split
        String[] words = s.trim().split("\\s+"); // split by one or more spaces

        // Step 2: Reverse
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i > 0) sb.append(" ");
        }

        return sb.toString();
    }
}
