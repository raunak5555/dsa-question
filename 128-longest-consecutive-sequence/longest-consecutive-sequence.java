class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int maxlength=0;
        for(int num:set){
            if(!set.contains(num-1)){
                int currnum=num;
                int len=1;

                while(set.contains(currnum+1)){
                    currnum +=1;
                    len+=1;
                }
                maxlength=Math.max(maxlength,len);
            }
        }
        return maxlength;
    }
}