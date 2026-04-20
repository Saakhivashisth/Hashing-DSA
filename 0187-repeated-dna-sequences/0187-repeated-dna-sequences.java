class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> seen=new HashSet<>(),res=new HashSet<>();
        for(int i =0;i+10<=s.length();i++){
            String window=s.substring(i,i+10);
            if(!seen.add(window)){
                res.add(window);
            }
        }
        return new ArrayList<>(res);
    }
}