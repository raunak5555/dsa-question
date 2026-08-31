class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int k=0;
        int j=0;
        int zeroes=0;
        while(j<n){
            if(nums[j]==0){
                zeroes++;
            
            }else{
                nums[k]=nums[j];
                k++;
            }
            j++;          
        }
        for(int i=k;i<n;i++){
            nums[i]=0;

        }
        System.out.println(nums);
    }
}