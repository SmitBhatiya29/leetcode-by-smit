class Solution {
    public int lengthOfLongestSubstring(String s) {
       Set<Character> set = new HashSet<>();
       int finalAns = 0;
       int ans;
       for(int i = 0; i < s.length() ; i++){
            int j = i;
            ans = 0;
            while( j < s.length() && !set.contains( s.charAt(j) ) ){
                set.add(s.charAt(j));
                ans++;
                j++;
            }
            if(ans > finalAns){
                finalAns = ans;
            }
            set.clear();
             
       } 
       return finalAns;
    }
}