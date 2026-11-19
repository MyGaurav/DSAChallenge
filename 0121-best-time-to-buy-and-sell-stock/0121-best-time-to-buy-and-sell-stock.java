class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int max = 0;
        int curr = 0;

        for(int i =1; i<prices.length;i++){
            if(min > prices[i]){
                min = prices[i];
            }
            if(prices[i] > min){
                curr = prices[i] - min;
            }
            if(curr > max){
                max = curr;
            }
        }
        return max;
    }
}