class Solution {
    public boolean isBalanced(String num) {
       int n = num.length();
       int oddsum = 0;
       int evensum = 0;
       for(int i =0; i < n ; i= i + 2){
            int a = num.charAt(i) - '0';
            evensum += a;
       }
       for(int i =1; i < n ; i= i + 2){   
            int b = num.charAt(i) - '0';
            oddsum += b;
      
       }
       
       return oddsum == evensum;
    }
}