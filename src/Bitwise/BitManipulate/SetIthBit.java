package Bitwise.BitManipulate;

// set Ith bit to 1 if zero
// if (101010110) 5th bit == 10111000

// Q:- 342 Set the 6th bit of the Binary rep of the number 101010110

public class SetIthBit {
    public static void main(String[] args) {
        int x = 342 , ith = 6;
        System.out.println(setBit(x , ith));
    }

    static int setBit(int n , int k){
        return ( n | (1 << (k-1)));  // after we set the 6th bit to 1 .. += 32
    }
}
/*
    342 ==> 101010110
    6th bit 000100000
    after OR ------
    342 += 32 == 374
*/