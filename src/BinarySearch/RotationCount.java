package BinarySearch;

public class RotationCount {
    public static void main(String[] args) {

    }
    static int countRotation(int[] arr){
        int pivot = pivot(arr);
        return pivot + 1; // 0 then not rotated
    }
    // no of rotation is the posi of pivot + 1
    static int pivot(int[] arr){
        int start = 0 , end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            // the only two condition
            if(end > mid && arr[mid] > arr[mid + 1]){ // if the mid-might be last
                return  mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){  // [4 , 5 , 6, {7 , 0 }, 1 ,2 ,3]
                return mid - 1;
            }
            // do the BS
            if(arr[mid] <= arr[start]){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
