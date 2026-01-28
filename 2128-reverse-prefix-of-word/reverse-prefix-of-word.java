import java.util.*;
class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character> s = new Stack<>();
        int i;
        for(i = 0; i < word.length(); i++){
            s.push(word.charAt(i));
            if(word.charAt(i) == ch){
                break;
            }
        }
        if (i == word.length()) {
            return word;
        }

        String part2 = word.substring(i+1,word.length());
        String part1 = "";
        while(!s.isEmpty()){
            part1 = part1+s.pop() +"";
        }
        return part1+part2;
    }
}