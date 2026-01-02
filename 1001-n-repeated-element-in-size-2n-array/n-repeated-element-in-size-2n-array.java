class Solution {
    public int repeatedNTimes(int[] nums) {
      HashMap<Integer,Integer> hash = new HashMap<>();
      int len = nums.length;
      for(int i =0; i < nums.length;i++){
        if( hash.containsKey(nums[i]) ){
            int num = hash.get(nums[i]);
            if((num+1 ) * 2== len){
                return nums[i];
            }
            hash.put(nums[i],num+1);
        }else{
            hash.put(nums[i],1);
        }
      }
      return nums[len-1];  
    }
}