package BinarySearch;

public class OrderAgnostic {
    public static void main(String[] args) {

    }

    static int orderAgnostic(int[] arr , int target){  // we don't know the sorting of the array
        int start = 0 , end = arr.length - 1;
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
}
