import java.util.*;
class Solution {
    public int longestPalindrome(String s) {
        Hashtable<Character,Integer> table = new Hashtable<>();
        for(int i = 0; i < s.length(); i++){
            if(!table.containsKey(s.charAt(i))){
                table.put(s.charAt(i),1);
            }else{
                table.put(s.charAt(i),table.get(s.charAt(i)) + 1);
            }
        }
        int ans = 0;
        boolean oddHai = false;
        for(Map.Entry<Character,Integer> val : table.entrySet()){
            if(val.getValue() % 2 == 0 ){
                ans += val.getValue();
            }else{
                ans = ans +  (val.getValue() / 2) * 2;
                oddHai = true;
            }
        }
        if(oddHai){
            ans++;
        }
        return ans;
    }
}