// Last updated: 7/28/2026, 7:32:21 AM
1class LRUCache {
2    private class Node {
3        int key, value;
4        Node prev, next;
5        Node(int k, int v) { key = k; value = v; }
6    }
7
8    private Map<Integer, Node> map;
9    private int capacity;
10    private Node head, tail;
11
12    public LRUCache(int capacity) {
13        this.capacity = capacity;
14        map = new HashMap<>();
15        head = new Node(0, 0);
16        tail = new Node(0, 0);
17        head.next = tail;
18        tail.prev = head;
19    }
20
21    public int get(int key) {
22        if (!map.containsKey(key)) return -1;
23        Node node = map.get(key);
24        remove(node);
25        insert(node);
26        return node.value;
27    }
28
29    public void put(int key, int value) {
30        if (map.containsKey(key)) {
31            remove(map.get(key));
32        }
33        if (map.size() == capacity) {
34            remove(tail.prev); // evict LRU
35        }
36        Node node = new Node(key, value);
37        insert(node);
38    }
39
40    private void remove(Node node) {
41        map.remove(node.key);
42        node.prev.next = node.next;
43        node.next.prev = node.prev;
44    }
45
46    private void insert(Node node) {
47        map.put(node.key, node);
48        node.next = head.next;
49        node.prev = head;
50        head.next.prev = node;
51        head.next = node;
52    }
53}
54