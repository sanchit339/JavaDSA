package Bitwise.BitManipulate;

import java.util.Scanner;

public class PowerFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt() , power = sc.nextInt();
        pow(base , power);
    }

    static void pow(int base , int power){
        int ans = 1;
        while (power > 0){
            if((power&1) == 1){
                ans *= base;
            }
            base *= base; // increment as base
            power >>= 1;
        }
        System.out.println(ans);
    }
}