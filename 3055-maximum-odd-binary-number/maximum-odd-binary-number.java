class Solution {
    public String maximumOddBinaryNumber(String s) {
        int n = s.length();
        int count = 0;
        for(int i = 0 ; i < n; i++){
            if(s.charAt(i) == '1'){
                count++;
            }
        }
        StringBuilder result = new StringBuilder();
        for(int i =0 ; i < count-1; i++){
            result.append('1');
        }
        for(int i =0 ; i < n-count; i++){
            result.append('0');
        }
        result.append('1');
        return result.toString();
    }
}