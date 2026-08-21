class Solution {
    public int totalFruit(int[] arr) {
        int n=arr.length;
        int maxlength=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int i=0;
        for(int j=0;j<n;j++){
            int ele=arr[j];
            if(map.containsKey(ele)){
                map.put(ele,map.get(ele)+1);
            }else{
                map.put(ele,1);
            }
            while(map.size() > 2){
                if(map.get(arr[i]) == 1){
                    map.remove(arr[i]);
                }else{
                    map.put(arr[i],map.get(arr[i])-1);
                }
                i++;
            }
            int len=j-i+1;
            maxlength=Math.max(len,maxlength);
            
            
        }
        return maxlength;
    }
}