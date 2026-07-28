// Last updated: 7/28/2026, 7:33:42 AM
1import java.util.*;
2
3class Solution {
4    public int maxPoints(int[][] points) {
5        if (points.length <= 2) return points.length;
6
7        int maxPoints = 0;
8
9        for (int i = 0; i < points.length; i++) {
10            Map<String, Integer> slopeCount = new HashMap<>();
11            int overlap = 0;
12            int localMax = 0;
13
14            for (int j = i + 1; j < points.length; j++) {
15                int dx = points[j][0] - points[i][0];
16                int dy = points[j][1] - points[i][1];
17
18                if (dx == 0 && dy == 0) {
19                    overlap++;
20                    continue;
21                }
22
23                int gcd = gcd(dx, dy);
24                dx /= gcd;
25                dy /= gcd;
26
27                String slope = dx + "/" + dy;
28                slopeCount.put(slope, slopeCount.getOrDefault(slope, 0) + 1);
29                localMax = Math.max(localMax, slopeCount.get(slope));
30            }
31
32            maxPoints = Math.max(maxPoints, localMax + overlap + 1); // +1 for base point
33        }
34
35        return maxPoints;
36    }
37
38    private int gcd(int a, int b) {
39        if (b == 0) return a;
40        return gcd(b, a % b);
41    }
42}
43