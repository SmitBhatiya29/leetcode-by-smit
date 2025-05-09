class Solution {
    public boolean isHappy(int n) {
        if(n < 10 && n != 1 && n!= 7){
            return false;
        }
            int sum = 0;
            while(n != 0){
                int digit = n % 10;
                digit = digit * digit;
                sum = sum + digit;
                n = n / 10;

            }
            if(sum == 1 || sum == 7){
                return true;
            }
            return isHappy(sum); 
        
    }
}