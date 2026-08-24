class Solution {
    public int[] intersection(int[] nums1, int[] nums2){
        int n1=nums1.length;
        int n2=nums2.length;
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();

        for(int i=0;i<n2;i++){
            set.add(nums2[i]);
        }
        for(int num:nums1){
            if(set.contains(num)){
                set2.add(num);
            }
        }
        int[] result=new int[set2.size()];
        int i=0;
        for(int num : set2){
            result[i++]=num;
        }
        return result;
    }
}