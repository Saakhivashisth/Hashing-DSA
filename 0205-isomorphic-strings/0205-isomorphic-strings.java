class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();

        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        if (arr1.length != arr2.length)
            return false;

        for (int i = 0; i < arr1.length; i++) {
            char ch = arr1[i];
            char ch1 = arr2[i];
            if (map.containsKey(ch)) {
                if (!map.get(ch).equals(ch1)) {
                    return false;
                }
            } else {
                if (set.contains(ch1)) {
                    return false;
                }

                map.put(ch, ch1);
                set.add(ch1);
            }

        }
        return true;
    }
}