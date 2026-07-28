// Last updated: 7/28/2026, 4:03:31 PM
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> dict = new HashSet<>(wordList);
        if (!dict.contains(endWord)) return 0;

        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        int level = 1; // beginWord counts as first word

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String word = queue.poll();
                if (word.equals(endWord)) return level;

                for (String nei : getNeighbors(word, dict)) {
                    queue.offer(nei);
                    dict.remove(nei); // avoid revisiting
                }
            }
            level++;
        }

        return 0;
    }

    private List<String> getNeighbors(String word, Set<String> dict) {
        List<String> res = new ArrayList<>();
        char[] chs = word.toCharArray();

        for (int i = 0; i < chs.length; i++) {
            char old = chs[i];
            for (char c = 'a'; c <= 'z'; c++) {
                if (c == old) continue;
                chs[i] = c;
                String newWord = String.valueOf(chs);
                if (dict.contains(newWord)) res.add(newWord);
            }
            chs[i] = old;
        }

        return res;
    }
}
