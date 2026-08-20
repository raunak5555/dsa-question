class Solution {
    public int[] dailyTemperatures(int[] arr) {
        int n=arr.length;
        int[] ans=new int[n];
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<n;i++){
            while(!s.isEmpty()  && arr[i] >arr[s.peek()]){
                int previndx=s.pop();
                ans[previndx]=i-previndx;
            }
            s.push(i);
        }
        return ans;
    }
}