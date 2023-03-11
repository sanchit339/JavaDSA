package BinarySearch;

public class FirstNLast {
    public static void main(String[] args) {

    }

    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1 , -1};

        int start = search(nums , target , true);
        int end = search(nums , target , false);  // the second number

        ans[0] = start;
        ans[1] = end;

        return ans;
    }

    int search(int[] arr , int target , boolean findStartIndex){

        int ans = -1;

        int start = 0 , end = arr.length;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1 ;
            }else{
                ans = mid;
                if(findStartIndex == true){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
