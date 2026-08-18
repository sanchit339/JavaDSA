/**
 * Works on Unsorted array
 * - Question - [Question](./CombinaitonSum.md)
 */
// package Recursion.Questions;

import java.util.ArrayList;
import java.util.List;

public class combination_sum {
    public static void find_combination(int idx , int[] arr , int target, List<Integer> temp ){
        if(target <= 0 || idx == arr.length){
            if(target == 0){
                for(int i : temp) System.out.print(i + " ");
                System.out.println();
            }
            return;
        }

        temp.add(arr[idx]);    
        find_combination(idx, arr, target - arr[idx], temp);
        temp.remove(temp.size() - 1);
        find_combination(idx + 1, arr, target, temp);
    }
    public static void main(String[] args) {
        // int[] arr = {2 , 3 , 5 };
        int[] arr = { 5 , 2 , 3};
        List<Integer> temp = new ArrayList<>();
        find_combination(0, arr, 8, temp);
    }
    
}

// LC - Solution 

/*

class Solution {
    public static void solve(int idx , int[] arr , List<Integer> temp , int target  , List<List<Integer>> ans){
        if(idx == arr.length){
            if(target == 0){
                ans.add(new ArrayList<>(temp));
            }
            return ;
        }

        if(arr[idx] <= target){
            temp.add(arr[idx]);
            solve(idx , arr , temp , target - arr[idx] , ans);
            temp.remove(temp.size() - 1);
        }
        solve(idx + 1  , arr , temp , target , ans);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        solve(0 , candidates , temp , target , ans );
        return ans;
    }
}

 */