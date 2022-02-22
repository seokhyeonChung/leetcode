class Solution {
    public int uniquePaths(int m, int n) {
        int[][] arr = new int[m][n];
        
        return solve(arr,m-1,n-1);
    }
    
    public int solve(int[][] arr, int m, int n){
        if(m == 0|| n == 0) {
            arr[m][n] = 1;
            return 1;
        } else if(arr[m][n] > 0){
            return arr[m][n];
        } else{
            arr[m][n] = solve(arr,m-1,n) + solve(arr,m,n-1);
            return arr[m][n];
        }
        
        
    }
}