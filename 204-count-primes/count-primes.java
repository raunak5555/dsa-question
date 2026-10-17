class Solution {
    public int countPrimes(int n) {
        if(n<=2){
           return 0;
        }
        boolean[] isprime=new boolean[n];
        for(int i=2;i<n;i++){
            isprime[i]=true;
    
        }
        for(int p=2;p<=Math.sqrt(n);p++){
            if(isprime[p] == true){
                for (int i = p * p; i < n; i += p) {
                    isprime[i] = false;
                }
            }
        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isprime[i]==true) {
                count++;
            }
        }

        return count;
    
    }
    
}