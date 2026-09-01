class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int minlength=Integer.MAX_VALUE;
        int left=0;
        int sum=0;
        for(int i=left;i<n;i++){
            sum +=nums[i];

            while(sum >=target){
                int len=i-left+1;
                minlength=Math.min(len,minlength);

                sum -= nums[left];
                left++;
            }
            
        }
        if(minlength==Integer.MAX_VALUE){
            return 0;
        }else{
            return minlength;
        }
       
    }
}