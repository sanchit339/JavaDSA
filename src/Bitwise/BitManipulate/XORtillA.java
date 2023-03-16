package Bitwise.BitManipulate;
/*
    from observation
    if n%4 = 0 || ans = n
    if n%4 = 1 || ans = 1
    n%4 = 2 || ans = n + 1
    n%4 = 3 || ans = 0
*/

// Question find the XOR of the all numbers till n

import java.util.Scanner;

public class XORtillA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n%4 == 0)
            System.out.println(n);

        if(n%4 == 1)
            System.out.println(1);

        if(n%4 == 2)
            System.out.println(n+1);

        if(n%4 == 3)
            System.out.println(0);
    }
}
