package Bitwise.BitManipulate;

import java.util.Scanner;

// 6 = 110 = 3
// 4 = 100 = 3
// find the last 1
public class FindNoOfDigitInBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numberSys = sc.nextInt();

        // with log method
        System.out.println(withLogMethod(n , numberSys));

        int count  = 0;
        while (n > 0){
            count++;
            n = n >> 1;
        }
        System.out.println(count);
    }
    // using log method in any number system
    // int (log b (n)) where b = number sys. ex = 10 decimal , 2 binary etc
    // n is the actual number

    // as log b (n) ==> n = b^(x) where x = is some number so
    // x+1 => x is always :) in decimal (some time whole)

    static int withLogMethod(int n , int ns){ // ns number system
        int ans = (int)(Math.log(n) / Math.log(ns)) + 1;
        System.out.println("Using Log method System");
        return ans;
    }
}
