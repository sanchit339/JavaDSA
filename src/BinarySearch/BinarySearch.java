package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1 ,2 ,3 , 5, 6, 7, 8, 10 , 13 , 15};
        int target = 10;
        int ans = search(arr , target);
        System.out.println(ans);
    }
    static int search (int[] arr , int target){
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
        return -1;
    }
}
