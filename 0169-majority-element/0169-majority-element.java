class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
          int majority=nums[0];
          int mfi=0;
          for(int key:map.keySet()){
            if(mfi<map.get(key)){
                mfi=map.get(key);
                majority=key;
            }
          }
          return majority;
    }
}