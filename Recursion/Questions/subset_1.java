// Need to return all the possible subset 

import java.util.ArrayList;
import java.util.List;
public class subset_1 {
    public static void solve(int idx , int[] nums , List<Integer> temp , List<List<Integer>> ans){
        if(idx == nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }

        temp.add(nums[idx]);
        solve(idx + 1 , nums , temp , ans);
        temp.remove(temp.size() - 1);
        solve(idx + 1 , nums , temp , ans);
    }
    public static void main(String[] args) {
        // int[] arr = { 1 , 2 , 3};
        int[] arr = {0};
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        solve(0 , arr , temp , ans);

        for(List<Integer> nums : ans){
            for(int i : nums){
                System.out.print( i + " ");
            }
            System.out.print(" ] , [ ");
        }
    }
}
