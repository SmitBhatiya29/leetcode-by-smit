class Solution {
    public int minInsertions(String s) {
        int req = 0;
        int ins = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                req+=2;

                if(req%2!=0)
                {
                    ins++;
                    req--;
                }
            }
            if(s.charAt(i) == ')'){
                req--;
                if(req < 0){
                    ins++;
                    req = 1;
                }
            }
        }
        return req + ins;
    }
}