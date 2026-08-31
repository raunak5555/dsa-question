class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int k=0;
        int j=0;
        while(j<n){
            if(nums[j] != val){
                nums[k]=nums[j];
                k++;
            }
            j++;
        }
        return k;
    }
}