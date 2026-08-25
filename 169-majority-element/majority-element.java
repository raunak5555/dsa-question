class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int ans=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num :nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }
        for(int key : map.keySet()){
            int val=map.get(key);
            if(val>n/2){
                ans=key;
            } 
        }
        return ans;
    
    }
}