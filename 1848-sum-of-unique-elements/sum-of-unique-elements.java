class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i]) + 1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        int sum = 0;
        for(int n : map.keySet()){
            if(map.get(n) == 1){
                sum+=n;
            }
        }
        return sum;
    }
}