class Solution {
    public int[] findErrorNums(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else{
                map.put(nums[i],map.get(nums[i]) + 1);
            }
        }
        int []ans = new int[2];
        for(int i = 1; i <= nums.length; i++){
            if(!map.containsKey(i)){
                ans[1] = i;
                break;
            }
        }
        for(int i = 1; i <= nums.length; i++){
            if(map.containsKey(i)){
                if(map.get(i) == 2){
                ans[0] = i;
                break;
            }
            }
            
        }
        return ans;

    }
}