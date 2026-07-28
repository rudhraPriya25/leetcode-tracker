// Last updated: 7/28/2026, 9:15:09 PM
import java.util.*;

class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // Step 1: Build graph and indegree array
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }
        int[] indegree = new int[numCourses];

        for (int[] pre : prerequisites) {
            int course = pre[0];
            int prereq = pre[1];
            graph.get(prereq).add(course);
            indegree[course]++;
        }

        // Step 2: Initialize queue with courses having indegree 0
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) queue.offer(i);
        }

        // Step 3: Process courses
        int count = 0;
        while (!queue.isEmpty()) {
            int curr = queue.poll();
            count++;
            for (int next : graph.get(curr)) {
                indegree[next]--;
                if (indegree[next] == 0) {
                    queue.offer(next);
                }
            }
        }

        // Step 4: If all courses processed → possible
        return count == numCourses;
    }
}
