class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int ans=0;
        boolean[] persent=new boolean[n+1];
        for(int num:nums){
            persent[num]=true;
        }
        for(int i=0;i<=n;i++){
            if(persent[i]==false){
                ans=i;
            }
        }
        return ans;
    }
}