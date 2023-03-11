package BinarySearch;

public class SearchInMountain {
    public static void main(String[] args) {

    }

//    public int findInMountainArray(int target, MountainArray mountainArr) {
//
//    }

    int search(int[] arr , int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnostic(arr , target , 0 , peak);
        if(firstTry != -1){
            return firstTry;
        }
        return orderAgnostic(arr , target , peak + 1 , arr.length - 1);
    }

    static int orderAgnostic(int[] arr , int target , int start , int end){  // we don't know the sorting of the array
        boolean isAgno = arr[start] < arr[end];

        while (start <= end){
            int mid = start + (start - end) / 2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAgno){ // if array is sorted in descending order then it will be changed here
                if(target < arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else {
                if(target > arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return -1;
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
