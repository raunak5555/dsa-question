class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        for(int a:nums1){
            for(int b:nums2){
                int sum=a+b;
                if(map.containsKey(sum)){
                    map.put(sum,map.get(sum)+1);
                }else{
                    map.put(sum,1);
                }
            }
        }
        for(int c:nums3){
            for(int d:nums4){
                int target= -(c+d);
                if(map.containsKey(target)){
                    count += map.get(target);
                }
            }
        }
        return count;
    }
}