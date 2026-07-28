// Last updated: 7/28/2026, 4:03:34 PM
class Solution {
    public boolean isPalindrome(String s) {
        // Step 1: Clean string (keep only alphanumeric, lowercase)
        StringBuilder cleaned = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleaned.append(Character.toLowerCase(c));
            }
        }

        // Step 2: Reverse and compare
        String str = cleaned.toString();
        String rev = cleaned.reverse().toString();

        return str.equals(rev);
    }
}
