class Solution {
    private static final long MOD = 1000000007;

    public int countGoodNumbers(long n) {
        long even = (n+1)/2;
        long odd = n/2;

        long res = (power(5, even) * power(4,odd)) % MOD;
        return (int)res;
    }
    private long power(long base , long exp){
        if(exp == 0){
            return 1;
        }
        long temp = power(base,exp/2);

        if(exp % 2 == 1){
            return (base * temp * temp) % MOD;
        }

        return (temp*temp) % MOD;
    }
}