package Sorting;

import java.util.ArrayList;
import java.util.List;

public class SetMismatch {
    public static void main(String[] args) {

    }

    // find that one duplicate and return index + 1 and that number

    public int[] findErrorNums(int[] nums) {
        int i = 0;
        while (i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums , i , correct);
            }
            else {
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index + 1)
                return new int[] {nums[index] , index + 1};
        }
        return new int[] {-1 , -1};
    }

    static void swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
