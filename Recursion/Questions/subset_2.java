// Unique are present so handle that condition 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subset_2 {
    public static void solve(int idx , int[] nums , List<Integer> temp , List<List<Integer>> ans){
        
        ans.add(new ArrayList<>(temp));

        for(int i = idx ; i < nums.length ; i++ ){
            if(i > idx && nums[i] == nums[i - 1]) continue;

            temp.add(nums[i]);
            solve(i + 1, nums, temp, ans);
            temp.remove(temp.size() - 1);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1 , 2 , 2};
        // for the unsorted array os per the question 
        Arrays.sort(arr);
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        solve(0 , arr , temp  , ans);

        for(List<Integer> nums : ans){
            for(int i :  nums){
                System.out.print(i + " ");
            }
            System.out.print(" ] , [ ");
        }
    }   
}
