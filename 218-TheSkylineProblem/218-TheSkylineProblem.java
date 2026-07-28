// Last updated: 7/28/2026, 9:14:33 PM
import java.util.*;

class Solution {
    public List<List<Integer>> getSkyline(int[][] buildings) {
        List<int[]> edges = new ArrayList<>();
        for (int[] b : buildings) {
            edges.add(new int[]{b[0], -b[2]}); // left edge (negative height)
            edges.add(new int[]{b[1], b[2]});  // right edge (positive height)
        }

        // Sort edges: by x, then by height
        Collections.sort(edges, (a, b) -> {
            if (a[0] != b[0]) return a[0] - b[0];
            return a[1] - b[1];
        });

        List<List<Integer>> result = new ArrayList<>();
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        heap.add(0); // ground level
        int prevHeight = 0;

        for (int[] e : edges) {
            int x = e[0], h = e[1];
            if (h < 0) { // left edge
                heap.add(-h);
            } else {     // right edge
                heap.remove(h);
            }

            int currHeight = heap.peek();
            if (currHeight != prevHeight) {
                result.add(Arrays.asList(x, currHeight));
                prevHeight = currHeight;
            }
        }

        return result;
    }
}
