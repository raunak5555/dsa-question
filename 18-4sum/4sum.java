class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n=nums.length;
        Set<List<Integer>> resultSet = new HashSet<>();
        Arrays.sort(nums);

        for(int i=0;i<n-3;i++){
            for(int j=i+1;j<n-2;j++){
                int p=j+1,q=n-1;

                while(p< q){
                    long sum =  (long)nums[i] + nums[j] + nums[p] +nums[q];
                    if(sum==target){
                        List<Integer> fourp = new ArrayList<>();
                        fourp.add(nums[i]);
                        fourp.add(nums[j]);
                        fourp.add(nums[p]);
                        fourp.add(nums[q]);

                    resultSet.add(fourp);
                    p++;
                    q--;
                    }else if (sum < target) {
                        p++;
                    } else{
                        q--;
                    }
                }
            }
        }
        return new ArrayList<>(resultSet);
    }
}