class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] delta = new int[n+1];

        for(int i=0; i<trust.length; i++){
            delta[trust[i][0]]--;
            delta[trust[i][1]]++;
        }

        for(int i=1; i<=n; i++) {
            if(delta[i]==(n-1)){
                return i;
            }
        }
        return -1;
    }
}