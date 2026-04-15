class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);

        }
        ;
        int sum = 0;
        boolean hasOdd = false;
        for (int v : map.values()) {
            if (v % 2 == 0) {
                sum += v;
            } else {
                sum +=v-1;
                hasOdd = true;
            }

        }
        if (hasOdd)
            return sum += 1;
        return sum;
    }
}