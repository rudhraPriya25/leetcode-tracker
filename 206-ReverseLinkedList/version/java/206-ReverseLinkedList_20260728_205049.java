// Last updated: 7/28/2026, 8:50:49 PM
1import java.util.*;
2
3class Solution {
4    class TrieNode {
5        TrieNode[] children = new TrieNode[26];
6        String word = null; // store word at end
7    }
8
9    private TrieNode buildTrie(String[] words) {
10        TrieNode root = new TrieNode();
11        for (String w : words) {
12            TrieNode node = root;
13            for (char c : w.toCharArray()) {
14                int idx = c - 'a';
15                if (node.children[idx] == null) {
16                    node.children[idx] = new TrieNode();
17                }
18                node = node.children[idx];
19            }
20            node.word = w; // mark end of word
21        }
22        return root;
23    }
24
25    public List<String> findWords(char[][] board, String[] words) {
26        List<String> result = new ArrayList<>();
27        TrieNode root = buildTrie(words);
28
29        int m = board.length, n = board[0].length;
30        for (int i = 0; i < m; i++) {
31            for (int j = 0; j < n; j++) {
32                dfs(board, i, j, root, result);
33            }
34        }
35        return result;
36    }
37
38    private void dfs(char[][] board, int i, int j, TrieNode node, List<String> result) {
39        char c = board[i][j];
40        if (c == '#' || node.children[c - 'a'] == null) return;
41
42        node = node.children[c - 'a'];
43        if (node.word != null) {
44            result.add(node.word);
45            node.word = null; // avoid duplicates
46        }
47
48        board[i][j] = '#'; // mark visited
49
50        if (i > 0) dfs(board, i - 1, j, node, result);
51        if (j > 0) dfs(board, i, j - 1, node, result);
52        if (i < board.length - 1) dfs(board, i + 1, j, node, result);
53        if (j < board[0].length - 1) dfs(board, i, j + 1, node, result);
54
55        board[i][j] = c; // backtrack
56    }
57}
58