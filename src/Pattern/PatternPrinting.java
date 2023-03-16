package Pattern;
/*
    STEP 1 :- no. of lines = no. of rows
        = the number of times the outer for loop will run
    Step 2 :- Identify the for every row number
    > how many cols are there
    > and type of elements in the column

    Step 3 :- What you need to print

*/
public class PatternPrinting {
    public static void main(String[] args) {
        pattern5(4);
    }

    static void pattern1(int n){
        for (int row = 1; row <= n ; row++) {
            // for every row , run the column
            for (int col = 1 ; col <= n; col++) {
                System.out.print("* ");
            }
            // print new line
            System.out.println();
        }
        /*

         * * * *
         * * * *
         * * * *
         * * * *

         */
    }
    static void pattern2(int n){
        for (int row = 1; row <= n ; row++) {
            // for every row , run the column
            for (int col = 1 ; col <= row; col++) {
                System.out.print("* ");
            }
            // print new line
            System.out.println();
        }
        /*

         *
         * *
         * * *
         * * * *

         */
    }

    static void pattern3(int n) {
        for (int row = 0; row < n; row++) {
            // for every row , run the column
            for (int col = n - row ; col > 0; col--) {
                System.out.print("* ");
            }
            // print new line
            System.out.println();
        }
        /*

         * * * *
         * * *
         * *
         *

        */
    }

    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row , run the column
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            // print new line
            System.out.println();
        }
        /*

        1
        1 2
        1 2 3
        1 2 3 4

         */
    }

    static void pattern5(int n) {
        for (int row = 0; row < (2*n) ; row++) {
            int totalColInRow = row > n ? 2 * n - row : row;
            for (int col = 1; col <= totalColInRow; col++) {
                System.out.print(col + " ");
            }
            // print new line
            System.out.println();
        }
    }
}
