// Last updated: 7/28/2026, 7:13:19 PM
1class Solution {
2    public int countPrimes(int n) {
3        if (n <= 2) return 0;
4
5        boolean[] isPrime = new boolean[n];
6        for (int i = 2; i < n; i++) {
7            isPrime[i] = true;
8        }
9
10        // Sieve of Eratosthenes
11        for (int i = 2; i * i < n; i++) {
12            if (isPrime[i]) {
13                for (int j = i * i; j < n; j += i) {
14                    isPrime[j] = false;
15                }
16            }
17        }
18
19        int count = 0;
20        for (int i = 2; i < n; i++) {
21            if (isPrime[i]) count++;
22        }
23
24        return count;
25    }
26}
27