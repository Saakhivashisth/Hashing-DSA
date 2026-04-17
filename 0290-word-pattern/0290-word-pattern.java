class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> usedWords = new HashSet<>();

        char[] p = pattern.toCharArray();
        String[] words = s.split("\\s+");

        if (p.length != words.length) return false;

        for (int i = 0; i < p.length; i++) {
            char ch = p[i];

            if (map.containsKey(ch)) {
                // validate existing mapping
                if (!map.get(ch).equals(words[i])) {
                    return false;
                }
            } else {
                // assign new mapping
                if (usedWords.contains(words[i])) {
                    return false;
                }
                map.put(ch, words[i]);
                usedWords.add(words[i]);
            }
        }
        return true;
    }
}