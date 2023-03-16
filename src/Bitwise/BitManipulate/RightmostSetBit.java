package Bitwise.BitManipulate;
// 342 101010110 the right most bit is 1->1<-0

import java.util.Scanner;

// n = n & (n-1) removes one bit from right 6 gives 4 then 0 == 2 count
public class RightmostSetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 100
        setBits(n);
    }

    static void setBits(int n){
        int count = 0;
        while (n > 0){
            count++;
            n = n & (n-1); // removes the right bit
        }
        System.out.println(count);
    }
}

/*
    ex:- 101101100
    a = [101101] 1 b =[00]
    N =  a 1 b
    -N = ~a 1 b
    ans = N & (-N) = direct ans
    101101100
    010010100
    000000100 -> to decimal
*/
