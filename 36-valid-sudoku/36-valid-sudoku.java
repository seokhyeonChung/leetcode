class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[] check = new boolean[10];
        
        for(int i =0; i<3; i++){
            for(int j =0; j<9; j++){
                Arrays.fill(check,false);
                for(int k =0; k<9; k++){
                    char c;
                    if(i == 0){
                        c = board[j][k];
                    } else if(i == 1){
                        c = board[k][j];
                    } else{
                        c = board[j/3 * 3 + k %3][j%3 *3 + k /3];
                    }
                    if(c == '.') continue;
                    int num = c - '0';
                    if(check[num]) return false;
                    else check[num] = true;
                    
                }
            }
        }
        return true;
    }
}