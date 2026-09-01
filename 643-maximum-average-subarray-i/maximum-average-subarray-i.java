class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        double sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
            
        double maxaverage=sum;
        for(int i=k;i<n;i++){
            sum=sum+nums[i]-nums[i-k];
            maxaverage=Math.max(maxaverage,sum);
        }

        
        return maxaverage/k;
       
        
    }
}