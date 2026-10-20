class Solution {
    private static final long MOD = 1000000007;

    public int countGoodNumbers(long n) {
        long evenCount = (n + 1) / 2; // ceil(n/2)
        long oddCount = n / 2;         // floor(n/2)

        long fivePower = power(5, evenCount);
        long fourPower = power(4, oddCount);

        return (int) ((fivePower * fourPower) % MOD);
    }

    // Binary exponentiation: computes base^exp % MOD
    private long power(long base, long exp) {
        long result = 1;
        base %= MOD;

        while (exp > 0) {
            if (exp % 2 == 1) {
                result = (result * base) % MOD;
            }
            base = (base * base) % MOD;
            exp /= 2;
        }

        return result;
    }
}