// Last updated: 7/28/2026, 8:48:36 PM
1import java.util.*;
2
3class Solution {
4    public int[] findOrder(int numCourses, int[][] prerequisites) {
5        // Step 1: Build graph + indegree
6        List<List<Integer>> graph = new ArrayList<>();
7        for (int i = 0; i < numCourses; i++) {
8            graph.add(new ArrayList<>());
9        }
10        int[] indegree = new int[numCourses];
11
12        for (int[] pre : prerequisites) {
13            int course = pre[0];
14            int prereq = pre[1];
15            graph.get(prereq).add(course);
16            indegree[course]++;
17        }
18
19        // Step 2: Queue for courses with indegree 0
20        Queue<Integer> queue = new LinkedList<>();
21        for (int i = 0; i < numCourses; i++) {
22            if (indegree[i] == 0) queue.offer(i);
23        }
24
25        // Step 3: Process queue
26        int[] order = new int[numCourses];
27        int index = 0;
28
29        while (!queue.isEmpty()) {
30            int curr = queue.poll();
31            order[index++] = curr;
32
33            for (int next : graph.get(curr)) {
34                indegree[next]--;
35                if (indegree[next] == 0) {
36                    queue.offer(next);
37                }
38            }
39        }
40
41        // Step 4: Check if all courses processed
42        if (index == numCourses) return order;
43        return new int[0]; // cycle detected
44    }
45}
46