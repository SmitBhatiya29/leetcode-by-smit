class Solution {
    public double findMaxAverage(int[] nums, int k) {
       
        int sum = 0;
        for(int i = 0 ; i < k ; i++){
            sum = nums[i] + sum;
        }
        double avg = (double)sum / k;
        for(int i = k ; i< nums.length; i++){
            sum  = ( sum - nums[i - k] ) + nums[i];
            double tempAvg = (double)sum / k;
            if(tempAvg > avg ){
                avg = tempAvg;
            }
        }
        return avg;
    }
}