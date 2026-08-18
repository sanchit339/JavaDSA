package NumberTheory;

// SQRT of the decimal numbers' ex (40) == 6.32

import java.util.Scanner;

// the precision till the decimal places is
// if till 2 then 0.01 ___ till 1 add 0.1

public class BinarySearchSqrt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        System.out.printf("%3f" , sqrt(n,p));
    }
    static double sqrt(int n , int p){
        int start = 0 , end = n;
        double root = 0.0; // as we want ans in decimal
        while (start <= end){
            int mid = start + (end - start) / 2 ;
            if(mid * mid == n)
                return mid;

            if (mid * mid < n){
                root = mid;
                start = mid + 1;   // till the ans is less , then increment
            }
            else {
                end = mid - 1;
            }
        }
        double incr = 0.1;
        for (int i = 0; i < p; i++) {
            while (root * root <= n){
                root += incr;
            }
            root -= incr;
            incr /= 10; // for the precision
        }
        return root;
    }
}
