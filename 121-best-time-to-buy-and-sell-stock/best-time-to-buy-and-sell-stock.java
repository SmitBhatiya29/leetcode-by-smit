class Solution {
    public int maxProfit(int[] prices) {
        int max =0;
        int min = Integer.MAX_VALUE;
        for(int i =0; i < prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            }
            int pro = prices[i] - min;
            if(pro > max){
                max = pro;
            }
        }
        return max;
    }
}