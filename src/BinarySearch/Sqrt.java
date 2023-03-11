package BinarySearch;

public class Sqrt {
    public static void main(String[] args) {
        ;
    }

    public int mySqrt(int x) {
        int start = 0 , end = x;
        while(start <= end){
            int mid = (start + end) / 2;
            if(mid * mid == x){
                return mid;
            }
            if(mid * mid > x){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return end;
    }
}
