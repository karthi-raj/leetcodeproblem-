class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int k = primes.length;

        long[] ugly = new long[n];
        ugly[0] = 1;

        int[] idx = new int[k];
        long[] next = new long[k];

        
        for (int i = 0; i < k; i++) {
            next[i] = primes[i];
        }

        for (int i = 1; i < n; i++) {
            long min = Long.MAX_VALUE;

           
            for (int j = 0; j < k; j++) {
                min = Math.min(min, next[j]);
            }

            ugly[i] = min;

           
            for (int j = 0; j < k; j++) {
                if (next[j] == min) {
                    idx[j]++;
                    next[j] = ugly[idx[j]] * primes[j];
                }
            }
        }

        return (int) ugly[n - 1];
    }
}
