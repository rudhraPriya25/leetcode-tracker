// Last updated: 7/9/2026, 10:25:00 AM
import java.util.*;

class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int i = 0;
        
        while (i < words.length) {
            int lineLen = words[i].length();
            int j = i + 1;
            
            // Greedily fit as many words as possible
            while (j < words.length && lineLen + 1 + words[j].length() <= maxWidth) {
                lineLen += 1 + words[j].length();
                j++;
            }
            
            int gaps = j - i - 1;
            StringBuilder sb = new StringBuilder();
            
            // Case 1: Last line OR only one word
            if (j == words.length || gaps == 0) {
                for (int k = i; k < j; k++) {
                    sb.append(words[k]);
                    if (k < j - 1) sb.append(" ");
                }
                // Fill remaining spaces
                while (sb.length() < maxWidth) {
                    sb.append(" ");
                }
            } else {
                // Case 2: Fully justify
                int totalSpaces = maxWidth - (lineLen - gaps);
                int spacePerGap = totalSpaces / gaps;
                int extraSpaces = totalSpaces % gaps;
                
                for (int k = i; k < j; k++) {
                    sb.append(words[k]);
                    if (k < j - 1) {
                        int spaces = spacePerGap + (extraSpaces-- > 0 ? 1 : 0);
                        for (int s = 0; s < spaces; s++) sb.append(" ");
                    }
                }
            }
            
            result.add(sb.toString());
            i = j;
        }
        
        return result;
    }
}
