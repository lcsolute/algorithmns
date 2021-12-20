public class Solution_36 {
    public boolean isValidSudoku(char[][] board) {
        int[][] rows = new int[9][9];
        int[][] cols = new int[9][9];
        int[][][] subboxs = new int[3][3][9];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == '.') {
                	continue;
                }
                int index = board[i][j] - '0' - 1;
                rows[i][index] += 1;
                cols[j][index] += 1;
                subboxs[i/3][j/3][index] += 1;

                if(rows[i][index] > 1 || cols[j][index] > 1 || subboxs[i/3][j/3][index] > 1) {
                	return false;
                }
            }
        }

        return true;
    }

}
