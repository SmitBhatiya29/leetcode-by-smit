import java.util.*;
class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums.length == 1){
            return nums[0];
        }
        int ans = nums[0];
        int i = 0;
        while(i < nums.length -1 ){
            if(nums[i] != nums[i+1]){
                return nums[i];
            }
            i+=2;
        }
        return nums[nums.length-1];
    }
}