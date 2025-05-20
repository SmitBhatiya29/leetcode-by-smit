class Solution {
    public int climbStairs(int n) {
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }

        int pre1 = 1;
        int pre = 2;
        int ans = 0;
        for(int i = 3; i <= n; i++){
            ans = pre + pre1;
            pre1 = pre;
            pre = ans;
        } 
        return ans;
    }
}