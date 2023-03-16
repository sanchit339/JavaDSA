package Bitwise.BitManipulate;
/*
    1                   = 1
    1   1               = 2
    1   2   1           = 4
    1   3   3   1       = 8
    1   4   6   4   1   = 16  == binary rep at each st age
    ex:- this is 5th row sum is (1 >> (n-1) ) == 2^4
*/

import java.util.Scanner;

// que is find the sum from the Nth row of pascals rep
public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println((1 << (n-1)));
    }
}
