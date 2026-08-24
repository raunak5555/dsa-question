class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }
        for(int key :map.keySet()){
            int count=map.get(key);
            if(count==1){
                return key;
            }
        }
        return -1;
    }
}