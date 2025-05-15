import java.util.*;
import java.lang.*;
class Solution {
    public String reverseWords(String s) {
        String []  strarr = s.split(" +"); 
        StringBuilder str1 = new StringBuilder();
        int itr = strarr.length -1;

        while(itr>=0){
            str1.append(strarr[itr]);
            str1.append(" ");
            itr--;
        }
        return str1.toString().trim();
    }
}