class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] stops=new int[1001];
        for(int i=0;i<trips.length;i++){

            int numpass= trips[i][0];
            int from=trips[i][1];
            int to=trips[i][2];
            stops[from] += numpass;
            stops[to] -=numpass;
        }
        int currentPassengers = 0;
        for (int i = 0; i < 1001; i++) {
            currentPassengers += stops[i];
            if (currentPassengers > capacity) {
                return false;
            }
        }
        return true;
    }
}