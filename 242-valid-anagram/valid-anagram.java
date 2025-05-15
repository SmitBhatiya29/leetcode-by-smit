
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char[] arr = s.toCharArray();
        char[] arr2 = t.toCharArray();

        Arrays.sort(arr);
        Arrays.sort(arr2);

        if(!Arrays.equals(arr,arr2)){
                return false;
        }
        return true;
    }
}