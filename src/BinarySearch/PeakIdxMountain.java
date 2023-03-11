package BinarySearch;

public class PeakIdxMountain {
    public static void main(String[] args) {

    }

    public int peakIndexInMountainArray(int[] arr) {
        int start = 0 , end = arr.length - 1;
        while (start < end){  // check the pen paper condition for the impl
            int mid = start + (end - start) / 2;
            if( arr[mid] > arr[mid+1]){
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start; // start or the end both point to the same max element at the end of the loop
    }
}
