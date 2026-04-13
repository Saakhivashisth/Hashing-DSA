class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> mapS=new HashMap<>();
        HashMap<Character,Integer> mapT=new HashMap<>();

        for(char c:s.toCharArray()){
            mapS.put(c,mapS.getOrDefault(c,0)+1);
        };
        for(char ch:t.toCharArray()){
            mapT.put(ch,mapT.getOrDefault(ch,0)+1);
        };

        return mapS.equals(mapT);
    }
}