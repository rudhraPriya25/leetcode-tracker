// Last updated: 7/28/2026, 8:47:33 PM
1class Trie {
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
16    public Trie() {
17        root = new TrieNode();
18    }
19
20    // Insert word
21    public void insert(String word) {
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
33    // Search word
34    public boolean search(String word) {
35        TrieNode node = root;
36        for (char c : word.toCharArray()) {
37            int index = c - 'a';
38            if (node.children[index] == null) return false;
39            node = node.children[index];
40        }
41        return node.isEnd;
42    }
43
44    // Search prefix
45    public boolean startsWith(String prefix) {
46        TrieNode node = root;
47        for (char c : prefix.toCharArray()) {
48            int index = c - 'a';
49            if (node.children[index] == null) return false;
50            node = node.children[index];
51        }
52        return true;
53    }
54}
55