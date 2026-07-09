// Last updated: 7/9/2026, 10:24:51 AM
class Solution {
public:
    string convertToTitle(int columnNumber) {
        string result = "";
        
        while (columnNumber > 0) {
            columnNumber--;  // adjust because there's no zero in Excel columns
            int remainder = columnNumber % 26;
            char letter = 'A' + remainder;
            result = letter + result;  // prepend letter
            columnNumber /= 26;
        }
        
        return result;
    }
};
