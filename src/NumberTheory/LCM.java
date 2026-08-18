package NumberTheory;

// the min number which is above A , B and is divisible by a , b

// the LCM is just the number (a*b) / (gcd) // as gcd id common multiple

/*
    lcm(a,b) = abs|a*b| / gcd(a,b)
*/
import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println(lcm(a, b));
    }

    static int lcm(int a , int b){
        return (a*b) / gcd_hcf(a,b);
    }

    static int gcd_hcf(int a , int b){
        if(a == 0){
            return b;
        }
        return gcd_hcf(b%a , a); // just like solving equation till Ax = 0 ie a = 0
    }
}
