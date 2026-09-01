class Solution {
    public int longestSubarray(int[] nums) {
        int n=nums.length;
        int maxlength=0;
        int left=0;
        int zeroes=0;
        for(int i=left;i<n;i++){
            
            if(nums[i]==0){
                zeroes++;
            }
            while(zeroes>1){
                if(nums[left]==0){
                    zeroes--;
                }
                left++;
            }
            int len=i-left;
            maxlength=Math.max(maxlength,len);
        }
        if(maxlength==0){
            return 0;
        }else{
            return maxlength;
        }
    }
}