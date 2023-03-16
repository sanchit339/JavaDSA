package Bitwise;

// find the number which has the Odd frequency in the Array
// XOR all the numbers even ones will bwe zero as a^a == 0

public class OddFreqNumber {
    public static void main(String[] args) {
        int[] arr = {1 , 2, 4 ,2 ,1 , 4 , 3, 2 , 1, 2 ,1};
        System.out.println(OddFreq(arr));       // Or the number occurring here can be called as Unique number
    }

    static int OddFreq(int[] arr){
        int odd = 0;
        for(int n:arr)
            odd ^= n;

        return odd;
    }
}
