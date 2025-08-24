import java.util.ArrayList;
import java.util.List;

/**
 *     1 |   |
 *     1 | Q | as you palce the queen here do lower dia upper dia and left 1 and now call for the next column tahts it 
 *     1 |   |
 * 
 *   while back track remove it to 0 
 */

public class n_queens {
    private static boolean isSafe(int row, int col , char[][] board , int n){
        // check upper diagonal
        int dupCol = col;
        int dupRow = row;

        while (row >= 0 && col >= 0) {
            if(board[row][col] == 'Q'){
                return false;
            } 
            --row ; --col;
        }

        col = dupCol ;
        row = dupRow ;

        // check left
        while (col >= 0) {
            if(board[row][col] == 'Q') return false;
            --col;
        }
        col = dupCol;
        row = dupRow;

        // check lower diagonal 
        while (row < n && col >= 0) {
            if(board[row][col] == 'Q') return false;
            ++row;
            --col;
        }
        return true;
    }
    private static void solve(int col , int n , char[][] board , List<List<String>> ans){
        // base case
        if(col == n){
            List<String> temp = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                temp.add(new String(board[i]));
            }
            ans.add(temp);
            return;
        }

        for(int row = 0 ; row < n ; row++){
            if(isSafe(row, col , board, n)){
                board[row][col] = 'Q';
                solve(col + 1, n, board, ans); // go to next column
                board[row][col] = '.';
            }
        }
    }
    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];

        // initialize with 0
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                board[i][j] = '.';
            }
        }
        List<List<String>> chessBoard = new ArrayList<>();
        solve(0 , n , board , chessBoard);

        // printing all the solutions
        int count = 1;
        for(List<String> sol : chessBoard){
            System.out.println("Solution " + count++ + ":");
            for(String row : sol){
                System.out.println(row);
            }
            System.out.println();
        }
    }
}
