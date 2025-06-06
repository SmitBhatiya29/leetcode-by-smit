class Solution {
    public int findKthPositive(int[] arr, int k) {
        if(arr.length == arr[arr.length -1]){
            return arr.length + k;
        }
        int ans = -1;
        int j  = 0;
        for(int i = 1; i <= arr[arr.length-1];i++){
            if(k == 0){
                break;
            }
            if(arr[j] == i){
                j++;
            }else{
                k--;
                ans = i;
            }
        }
        if(k != 0){
            return arr[arr.length -1] + k;
        }
        return ans;
        
    }
}