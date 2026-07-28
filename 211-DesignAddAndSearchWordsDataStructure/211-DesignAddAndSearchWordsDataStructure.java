// Last updated: 7/28/2026, 9:14:59 PM
class WordDictionary {
    // Node definition
    class TrieNode {
        TrieNode[] children;
        boolean isEnd;

        TrieNode() {
            children = new TrieNode[26]; // only lowercase a-z
            isEnd = false;
        }
    }

    private TrieNode root;

    // Constructor
    public WordDictionary() {
        root = new TrieNode();
    }

    // Add word
    public void addWord(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (node.children[index] == null) {
                node.children[index] = new TrieNode();
            }
            node = node.children[index];
        }
        node.isEnd = true;
    }

    // Search word (with '.' support)
    public boolean search(String word) {
        return dfsSearch(word, 0, root);
    }

    private boolean dfsSearch(String word, int pos, TrieNode node) {
        if (node == null) return false;
        if (pos == word.length()) return node.isEnd;

        char c = word.charAt(pos);
        if (c == '.') {
            // Try all possible children
            for (TrieNode child : node.children) {
                if (child != null && dfsSearch(word, pos + 1, child)) {
                    return true;
                }
            }
            return false;
        } else {
            int index = c - 'a';
            return dfsSearch(word, pos + 1, node.children[index]);
        }
    }
}
