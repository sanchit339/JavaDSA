package Bitwise.BitManipulate;

public class IsEven {
    public static void main(String[] args) {
        int x = 68;
        System.out.println(isOdd(x));
    }

    private static boolean isOdd(int n){
        return ( n & 1) == 1 ;
    }
}

/*
    Internal Working
     16 & 1 == 0 how
      1 0 0 0
& 1 = 0 0 0 1
      -------
      0 0 0 0  ---> even

     17 & 1 == 1 how
     1 0 0 1
& 1= 0 0 0 1
     -------
     0 0 0 1  ---> odd

*/
