class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums1){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        ArrayList<Integer> list=new ArrayList<>();

        for(int nums:nums2){
            if(map.containsKey(nums)&& map.get(nums)>0){
                list.add(nums);
                map.put(nums,map.get(nums)-1);

            }
        }
        int[] result=new int[list.size()];
        for(int i=0;i<list.size();i++){
            result[i]=list.get(i);

        }
        return result;
    }
}