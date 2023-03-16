package Sorting;

public class FindDuplicate {
    public static void main(String[] args) {

    }

    public int findDuplicate(int[] nums) {
        int i = 0;
        while ( i < nums.length){
            if(nums[i] != i + 1){  // in the case of duplicate check the below
                int correct = nums[i] - 1;
                if(nums[i] != nums[correct]){ // if it is not at the correct posi
                    swap(nums , i , correct); // it will swap
                }
                else {
                    return nums[i]; // else it is a duplicate coz the original one is still at its posi
                }
            }
            else {
                i++;
            }
        }
        return -1; // no duplicate found
    }
    static void swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

