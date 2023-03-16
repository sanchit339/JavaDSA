package Bitwise.BitManipulate;
// if count is one then power oof two

// n & ~n == 1000 &
public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(n & (n-1)); // 1000 & 0111
    }
}
