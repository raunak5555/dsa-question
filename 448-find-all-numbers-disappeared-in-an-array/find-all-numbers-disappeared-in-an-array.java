class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
         
        int n=nums.length;
        List<Integer> result=new ArrayList<>();
        boolean[] persent=new boolean[n+1];
        for(int num:nums){
            persent[num]=true;
        }
        for(int i=1;i<=n;i++){
            if(persent[i]==false){
                result.add(i);
            }
        }
        return result;
    }
}