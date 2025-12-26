class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] s = s1.trim().split("\\s+");
        String[] t = s2.trim().split("\\s+");

        HashMap<String, Integer> map = new HashMap<>();
        for (String str : s) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        for (String str : t) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        ArrayList<String> result = new ArrayList<>();
        for (String st : map.keySet()) {
            if (map.get(st) == 1) {
                result.add(st);
            }
        }
        return result.toArray(new String[0]);

    }
}