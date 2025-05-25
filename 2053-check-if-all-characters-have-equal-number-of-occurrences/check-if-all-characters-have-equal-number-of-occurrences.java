class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> hash = new HashMap<>();
        for(int i = 0; i < s.length() ; i ++){
            if(hash.containsKey(s.charAt(i))){
                hash.put(s.charAt(i),hash.get(s.charAt(i)) +1);
            }else{
                hash.put(s.charAt(i),1);
            }
        }
        int pre = hash.get(s.charAt(0));
        for (Integer value : hash.values()) {
            if(value != pre){
                return false;
            }
        }
        return true;
    }
}