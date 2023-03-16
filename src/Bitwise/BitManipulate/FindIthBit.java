package Bitwise.BitManipulate;

// 342 find the 5th bit of the Binary rep of the number 101010110
// here the 5th bit is 1 ie 16

public class FindIthBit {
    public static void main(String[] args) {
        int x = 342 , ith = 5;
        System.out.println(findIthBit(x , ith));
        System.out.println(ithBit(x , ith));
    }

    static int findIthBit(int n , int k){
        // apply the bit mask --->  see the explanation
        return ((n & (1 << (k - 1))) >> (k - 1));
    }

    static int ithBit(int n , int k){
        // apply the bit mask --->  see the explanation
        return (n & (1 << (k - 1))); // ( 1 << (k-1)) is the mask to get the number
    }
}


/*
    342 --> 101010110
    5th --> 000010000 & it

    ans ==> 000010000

    x and (1 << (ith-1) ) == (1 << (5-1))
*/
