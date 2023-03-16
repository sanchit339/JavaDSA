package Sorting;

// leetcode hard

import java.util.ArrayList;
import java.util.List;

public class FindMissingOne {

    // the hint is just the O(n) TC
    // ignore the -ve number and the num == arr.len
    // the first index that does not have correct index will be the ans

    // numbers will not be from 1 - N  if [ 7 , 8 , 9 , 11] return 1 --> first missing positive number
    public int firstMissingPositive(int[] nums) {
        int i = 0;
        while ( i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] > 0 && nums[i] < nums.length && nums[i] != nums[correct]){
                swap(nums , i , correct);
            }
            else {
                i++;
            }
        }
        // just find all the missing numbers
        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index + 1){
                return index + 1;
            }
        }
        return nums.length + 1; // if didn't find anyone return last one
    }

    static void swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
