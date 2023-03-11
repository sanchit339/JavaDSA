package BinarySearch;

public class Celling {
    public static void main(String[] args) {
        int arr[] = {1 ,2 ,3 , 5, 6, 7, 8, 10 , 13 , 15};
        int target = 10;
        int ans = celling(arr , target);
        System.out.println(ans);
    }
    // changes done
/*
    in this problem when the while loop gets terminated
    the start and the end gets to the point from where we can get
    the floor and ceil of the
 */
    static int celling(int[] arr , int target){

        if(target > arr[arr.length - 1]){
            return -1;
        }

        int start = 0 , end = arr.length;
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
        return start; // for finding floor just return the end
    }
}
