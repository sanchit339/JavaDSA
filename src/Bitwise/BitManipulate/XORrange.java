package Bitwise.BitManipulate;

import java.util.Scanner;

public class XORrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt() , b = sc.nextInt();
        int ans = xor(b) ^ xor(a-1); // 3 to 6 ==> (0^1^2^3^4^5^6) ^ (0^1^2);  || n ^ (a-1)
        System.out.println(ans);
    }

    static int xor(int n){
        if(n%4 == 0)
            return n;

        if(n%4 == 1)
            return 1;

        if(n%4 == 2)
            return n+1;

        if(n%4 == 3)
            return 0;

        return 0;
    }
}
