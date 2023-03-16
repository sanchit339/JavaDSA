package Sorting;

import static Sorting.SelectionSort.swap;

public class FindMissing {
    public static void main(String[] args) {

    }

    public int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length){
            int correct = nums[i]; // as it is starting from 0 so direct
            if(nums[i] < nums.length && nums[i] != nums[correct]){ // skip the "Nth" number in array
                swap(nums , i , correct);
            }
            else {
                i++;
            }
        }

        // search for the missing number
        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index){
                return index;
            }
        }
        // case 2
        return nums.length;
    }
}
