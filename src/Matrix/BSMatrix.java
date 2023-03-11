package Matrix;

import java.util.Arrays;

// the matrix is sorted {row wise as well as column wise}

public class BSMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {10 , 20 , 30 , 40},
                {15 , 25 , 35 , 45},
                {28 , 29 , 37 , 49},
                {33 , 34 , 38 , 50}
        };

        System.out.println(Arrays.toString(search(arr , 37)));
    }
    static int[] search(int[][] matrix , int target){
        int row = 0 , column = matrix.length - 1;

        while (row < matrix.length && column >= 0){  // as we are decreasing the row and the column
            if(matrix[row][column] == target){
                return new int[]{row , column};
            }
            if(matrix[row][column] < target){
                row++; // go down :)
            }
            else {
                column--;
            }
        }
        return new int[]{ -1, -1 };
    }
}
