// Last updated: 7/28/2026, 7:19:57 AM
1class Solution {
2    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
3        Set<String> dict = new HashSet<>(wordList);
4        if (!dict.contains(endWord)) return 0;
5
6        Queue<String> queue = new LinkedList<>();
7        queue.offer(beginWord);
8        int level = 1; // beginWord counts as first word
9
10        while (!queue.isEmpty()) {
11            int size = queue.size();
12            for (int i = 0; i < size; i++) {
13                String word = queue.poll();
14                if (word.equals(endWord)) return level;
15
16                for (String nei : getNeighbors(word, dict)) {
17                    queue.offer(nei);
18                    dict.remove(nei); // avoid revisiting
19                }
20            }
21            level++;
22        }
23
24        return 0;
25    }
26
27    private List<String> getNeighbors(String word, Set<String> dict) {
28        List<String> res = new ArrayList<>();
29        char[] chs = word.toCharArray();
30
31        for (int i = 0; i < chs.length; i++) {
32            char old = chs[i];
33            for (char c = 'a'; c <= 'z'; c++) {
34                if (c == old) continue;
35                chs[i] = c;
36                String newWord = String.valueOf(chs);
37                if (dict.contains(newWord)) res.add(newWord);
38            }
39            chs[i] = old;
40        }
41
42        return res;
43    }
44}
45