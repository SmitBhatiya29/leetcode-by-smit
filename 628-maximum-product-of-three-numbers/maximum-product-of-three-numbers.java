class Solution {
    public int maximumProduct(int[] nums) {
        int  n = nums.length;
        int max = nums[0] * nums[1] * nums[2];
        if(nums.length == 3){
            return max;
        }
        Arrays.sort(nums);
        max = nums[n-1] * nums[n-2] * nums[n-3];
        if(nums[0] * nums[1] * nums[n-1] > max){
            max = nums[0] * nums[1] * nums[n-1];
        }
        return max;
    }
}