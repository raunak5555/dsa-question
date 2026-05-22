class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int l=0;
        int r=0;
        int maxcount=0;
        int count=0;
        while(r<n){
        
            if(nums[r]==1){
                r++;
                count++;
            }else{
                count =0;
                while(nums[l] !=0){
                    l++;
                    break;
                }
                l++;
                r++;
               

            }
            maxcount=Math.max(count,maxcount);

        }
        return maxcount;
    }
}