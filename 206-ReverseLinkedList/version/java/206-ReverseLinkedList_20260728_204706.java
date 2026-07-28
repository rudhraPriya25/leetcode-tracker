// Last updated: 7/28/2026, 8:47:06 PM
1import java.util.*;
2
3class Solution {
4    public boolean canFinish(int numCourses, int[][] prerequisites) {
5        // Step 1: Build graph and indegree array
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
19        // Step 2: Initialize queue with courses having indegree 0
20        Queue<Integer> queue = new LinkedList<>();
21        for (int i = 0; i < numCourses; i++) {
22            if (indegree[i] == 0) queue.offer(i);
23        }
24
25        // Step 3: Process courses
26        int count = 0;
27        while (!queue.isEmpty()) {
28            int curr = queue.poll();
29            count++;
30            for (int next : graph.get(curr)) {
31                indegree[next]--;
32                if (indegree[next] == 0) {
33                    queue.offer(next);
34                }
35            }
36        }
37
38        // Step 4: If all courses processed → possible
39        return count == numCourses;
40    }
41}
42