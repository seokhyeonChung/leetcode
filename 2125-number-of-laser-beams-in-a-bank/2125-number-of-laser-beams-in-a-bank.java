class Solution {
    public int numberOfBeams(String[] bank) {
        int m = bank.length;
        int n = bank[0].length();
        int[] map = new int[m];
        int top = 0;
        int bottom = 0;
        for(int i =0; i<m; i++){
            int cnt = 0;
            for(int j =0; j<n; j++){
                cnt += bank[i].charAt(j) - '0';
            }
            map[i] = cnt;
            
        }
        if(m == 1) return 0;
        int idx = 1;
        int temp = map[0];
        int result = 0;
        while(idx < m){
            if(map[idx] != 0){
                result += temp * map[idx];
                temp = map[idx];
            }
            idx++;
        }
        
        return result;
    }
}