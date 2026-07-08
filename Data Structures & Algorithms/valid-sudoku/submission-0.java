class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n = board.length;
        int m = board[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j] == '.' )
                    continue;
                System.out.println("\n"+"------"+"\n" + i+" "+j);
                boolean res = true;
                res = res && !checkRow(board, i,j);
                System.out.println(res);
                res = res && !checkColumn(board,i,j);
                System.out.println(res);
                res = res && !checkGrid(board, i, j);
                System.out.println(res);
                if(!res){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean checkRow(char[][] board, int row, int col){
        char val = board[row][col];
        for(int i=0;i<board[row].length;i++){
            if(i == col) continue;
            if(board[row][i] == val){
                return true;
            }
        }
        return false;
    }

    public boolean checkColumn(char[][] board, int row, int column){
        char val = board[row][column];
        for(int i=0;i<board.length;i++){
            if(i == row) continue;
            if(board[i][column] == val){
                return true;
            }
        }
        return false;
    }

    public boolean checkGrid(char[][] board, int i, int j){
        char val = board[i][j];
        int rl = (i/3)*3;
        int ru = rl + 3;
        int cl = (j/3)*3;
        int cu = cl + 3;
        for(int row = rl;row<ru;row++){
            for(int col=cl;col<cu;col++){
                if(row == i && col == j)
                    continue;
                if(board[row][col] == val){
                    return true;
                }
            }
        }
        return false;
    }
}
