package Bitwise.BitManipulate;

import java.util.Scanner;

/*
    take the ith bit as power of 5 and add all and return the sum
    ex :- 3 == 011 binary ie :- 5^2 + 5^1 = 25+5 = 30
    ..... 4 == 100 ie 5^3 = 125
    loop and get the ith bit
*/
public class NthMagicalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0 ;
        int base = 5; // finding the value with the base

        while (n > 0){
            int last = n & 1; // last bit
            n = n >> 1; // shifting right per loop 110 == 11 == 1
            // just like dividing
            ans += last * base;
            base *= 5;
        }
        System.out.println(ans);
    }
}
