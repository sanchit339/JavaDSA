package BinarySearch;

public class InfiniteArray {
    public static void main(String[] args) {

    }

    static int ans(int[] arr , int target){
        int start = 0;
        int end = 1; // as we don't know the end index of the array

        while (target > arr[end]){
            int temp = end + 1;
            // double the box value
            // end = previous end + sizeofbox * 2   [1 , 2, 3, 4, 5, 5, 6 , 7];
            // initial [1,2] size 2 = (1 - 0 + 1) * 2
            end = end + (end - start + 1) * 2;
            start = temp; // thus values will not be changed
        }
        return search(arr, target , start ,end);
    }
    static int search (int[] arr , int target , int start , int end){
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
}
