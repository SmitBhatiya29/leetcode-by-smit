class Solution {
    public String addBinary(String a, String b) {
        int lena = a.length();
        int lenb = b.length();
        if(lena != lenb){
            if(lena < lenb){
                int zeros = lenb - lena;
                while(zeros != 0){
                    a = "0" + a;
                    zeros--;
                }
            }else{
                int zeros = lena - lenb;
                while(zeros != 0){
                    b = "0" + b;
                    zeros--;
                }
            }
        }
        String ans = "";
        lena = a.length();
        lenb = b.length();
        int  carry = 0;
        int i = --lena;
        while(i >= 0){
            int q = a.charAt(i) - '0';
            int w = b.charAt(i) - '0';
            int sum = q + w + carry;
            if(sum == 0){
                ans = "0" + ans;
                carry = 0;
            }else if(sum == 1){
                ans = "1" + ans ;
                carry = 0;
            }else if(sum == 2){
                ans = "0" + ans;
                carry = 1;
            }else{
                ans = "1" + ans;
                carry = 1;
            }
            i--;

        }
        if(carry == 1){
            ans = "1" + ans;
        }
        return ans;
    }
}