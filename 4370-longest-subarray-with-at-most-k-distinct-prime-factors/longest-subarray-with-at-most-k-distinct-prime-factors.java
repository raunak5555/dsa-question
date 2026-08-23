class Solution {
    public List<Integer> primeFactors(int x) {
    List<Integer> res = new ArrayList<>();

    for (int i = 2; i* i <= x; i++) {
        if (x % i == 0) {
            res.add(i);

            while (x % i == 0){
                x /= i;
            }
        }
    }

    if (x > 1){
        res.add(x);
    }
    return res;
}
    public int longestSubarray(int[] nums, int k) {
        int n=nums.length;
        List<List<Integer>> factors =new ArrayList<>();

        for(int num:nums){
            factors.add(primeFactors(num));
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int i=0;
        int ans=0;
        for(int j=0;j<n;j++){
            for(int p : factors.get(j)){
                if(map.containsKey(p)){
                    map.put(p,map.get(p)+1);
                }else{
                    map.put(p,1);
                }
            }
            while(map.size() > k){
                for (int p : factors.get(i)){ 
                    int count = map.get(p); 
                    if (count == 1) {
                        map.remove(p);
                    }else {
                        map.put(p, count - 1); 
                    } 
                }
                i++;
            }
            ans=Math.max(ans,j-i+1);
        }
        return ans;
    }
}