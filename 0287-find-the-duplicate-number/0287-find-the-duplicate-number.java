class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int result=0;
        for(int num:nums){
            if(!set.contains(num)){
                set.add(num);
                }else{
              result=num;
            }
            }
        return result;
    }
}