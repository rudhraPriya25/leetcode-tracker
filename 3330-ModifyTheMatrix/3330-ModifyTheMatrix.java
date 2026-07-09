// Last updated: 7/9/2026, 10:23:47 AM
class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[] colMax = new int[n];

        // Step 1: find max in each column
        for (int j = 0; j < n; j++) {
            int maxVal = Integer.MIN_VALUE;
            for (int i = 0; i < m; i++) {
                if (matrix[i][j] != -1) {
                    maxVal = Math.max(maxVal, matrix[i][j]);
                }
            }
            colMax[j] = maxVal;
        }

        // Step 2: replace -1 with column max
        int[][] answer = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == -1) {
                    answer[i][j] = colMax[j];
                } else {
                    answer[i][j] = matrix[i][j];
                }
            }
        }

        return answer;
    }
}
