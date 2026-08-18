package NumberTheory;

import java.util.Map;
import java.util.Scanner;

// newton Raphson method for sqrt
public class NewtonSqrt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sqrt(n));
    }
    static double sqrt(int n){
        double x = n; // initially assume it as 1
        double root;
        while (true){
            root = 0.5 * (x + (n/x));
            if(Math.abs(root - x) < 1){  // set the precision
                break;
            }
            x = root;
        }
        return root;
    }
}
/*
    _/N = x + (n/x) * 0.5 ==> x = square root you assumed
    x = assumed root (assume it as n initially)
*/