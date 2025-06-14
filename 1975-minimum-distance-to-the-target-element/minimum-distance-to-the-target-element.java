class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        if(target == nums[start]){
            return 0;
        }
        int count = 0;
        for(int i = start + 1; i < nums.length; i++){
            if(target == nums[i]){
                count = i - start;
                break;
            }
           
        }
        int count1 = 0;
        for(int i = start - 1; i >= 0; i--){
            if(target == nums[i]){
                count1 = start - i;
                break;
            } 
        }
        if(count == 0 && count1 != 0){
            return count1;
        }else if(count1 == 0 && count != 0){
            return count;
        }
        return count < count1 ? count : count1;
    }
}