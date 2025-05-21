import java.util.*;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> hash = new HashMap<>();
        HashSet<String> usedWords = new HashSet<>();
        String[] words = s.split(" ");

        if (pattern.length() != words.length) return false;

        for (int i = 0; i < words.length; i++) {
            char ch = pattern.charAt(i);

            if (hash.containsKey(ch)) {
                if (!hash.get(ch).equals(words[i])) {
                    return false;
                }
            } else {
                // Check if this word is already used by another character
                if (usedWords.contains(words[i])) {
                    return false;
                }
                hash.put(ch, words[i]);
                usedWords.add(words[i]);
            }
        }

        return true;
    }
}
