class Solution {
    public int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }

        // Create a boolean array to mark non-prime numbers
        boolean[] isNotPrime = new boolean[n];
        int count = 0;

        for (int i = 2; i < n; i++) {
            if (!isNotPrime[i]) {
                count++;

                for (int j = 2 * i; j < n; j += i) {
                    isNotPrime[j] = true;
                }
            }
        }

        return count;
    }
}
