package BinarySearch;

public class RBS {
    public static void main(String[] args) {

    }

    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        // if you didn't get the pivot means array is not rotated
        if(pivot == -1){
            return Binarysearch(nums , target , 0 , nums.length -1); // if you didn't get the pivot return normal
        }
        //if pivot is found you have found 2 asc sorted array
        if(nums[pivot] == target){
            return pivot;
        }
        if(target >=  nums[0]){ // this means target is in first half
            return Binarysearch(nums , target , 0 , pivot - 1);
        }

        return Binarysearch(nums , target , pivot + 1 , nums.length -1 );
    }

    static int Binarysearch (int[] arr , int target , int start , int end){
        while (start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1 ;
            }else{
                return mid; // ans found
            }
        }
        return -1;
    }

    static int findPivot(int[] arr){ //   check this array [ 4, 5, 6, 7, 0, 1, 2, 3]
        int start = 0 , end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            // check the main condition
            if(end > mid && arr[mid] > arr[mid + 1] ){ // check for 7 <- mid  , 0 <- mid + 1
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1 ]){ // check for  7<-mid-1 . mid-> 0
                return mid - 1;
            }
            if( arr[start] >= arr[mid]){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return -1;
    }

    // with duplicate
    static int findPivotWithDupli(int[] arr){ //   check this array [ 4, 5, 6, 7, 0, 1, 2, 3]
        int start = 0 , end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            // check the main condition
            if(end > mid && arr[mid] > arr[mid + 1] ){ // check for 7 <- mid  , 0 <- mid + 1
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1 ]){ // check for  7<-mid-1 . mid-> 0
                return mid - 1;
            }
            // the array could be [2 , 9 , 2 , 2 , 2]
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                // just checking if the start is pivot
                if(arr[start] > arr[start + 1]){
                    return start;
                }
                start++; // just skip the element
                if(arr[end] < arr[end - 1]){
                    return end - 1;
                }
                end--;
            }
            // left side is sorted , so pivot should be in right
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = end + 1;
            }else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
