class Solution {
    public int maxProduct(int n) {
       int a = 0;
       int num = n;
        while(num != 0 ){
            a++;
            num = num  / 10;
        }
        int []ans = new int[a];
        int i =0;
        while(n != 0 ){
            int digit = n % 10;
            ans[i] = digit;
            i++;
            n = n  / 10;
        }
        Arrays.sort(ans);
        return ans[a-1] * ans[a-2]; 
    }
}