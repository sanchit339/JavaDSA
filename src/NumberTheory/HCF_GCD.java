package NumberTheory;

import java.util.Scanner;

public class HCF_GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt() , b = sc.nextInt();
        System.out.println(gcd_hcf(a , b));
    }

    static int gcd_hcf(int a , int b){
        if(a == 0){
            return b;
        }
        return gcd_hcf(b%a , a); // just like solving equation till Ax = 0 ie a = 0
    }
}
