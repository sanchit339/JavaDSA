package Bitwise.BitManipulate;
// reset bit == 0 --> 0 and 1 --> 0
// 10111000 (374) reset 5th bit == 1 - 0
public class ResetIthBit {
    public static void main(String[] args) {
        int x = 374 , ith = 6; // 342 ans
        System.out.println(resetIthBit(x , ith));
    }

    static int resetIthBit(int n , int k){
        // mask will be (11011111) mast create == ~(1 << (k-1))
        return (n & ~(1 << (k-1)));
    }
}
