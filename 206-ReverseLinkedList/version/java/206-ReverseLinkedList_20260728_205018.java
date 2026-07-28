// Last updated: 7/28/2026, 8:50:18 PM
1class WordDictionary {
2    // Node definition
3    class TrieNode {
4        TrieNode[] children;
5        boolean isEnd;
6
7        TrieNode() {
8            children = new TrieNode[26]; // only lowercase a-z
9            isEnd = false;
10        }
11    }
12
13    private TrieNode root;
14
15    // Constructor
16    public WordDictionary() {
17        root = new TrieNode();
18    }
19
20    // Add word
21    public void addWord(String word) {
22        TrieNode node = root;
23        for (char c : word.toCharArray()) {
24            int index = c - 'a';
25            if (node.children[index] == null) {
26                node.children[index] = new TrieNode();
27            }
28            node = node.children[index];
29        }
30        node.isEnd = true;
31    }
32
33    // Search word (with '.' support)
34    public boolean search(String word) {
35        return dfsSearch(word, 0, root);
36    }
37
38    private boolean dfsSearch(String word, int pos, TrieNode node) {
39        if (node == null) return false;
40        if (pos == word.length()) return node.isEnd;
41
42        char c = word.charAt(pos);
43        if (c == '.') {
44            // Try all possible children
45            for (TrieNode child : node.children) {
46                if (child != null && dfsSearch(word, pos + 1, child)) {
47                    return true;
48                }
49            }
50            return false;
51        } else {
52            int index = c - 'a';
53            return dfsSearch(word, pos + 1, node.children[index]);
54        }
55    }
56}
57