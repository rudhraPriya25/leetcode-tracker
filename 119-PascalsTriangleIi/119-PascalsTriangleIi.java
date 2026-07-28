// Last updated: 7/28/2026, 4:03:49 PM
import java.util.*;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1); // first row

        for (int i = 1; i <= rowIndex; i++) {
            row.add(0); // expand size
            for (int j = i; j > 0; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
        }

        return row;
    }
}
