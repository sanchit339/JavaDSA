/**
 * Just finds the first subsequence
 */

package Recursion.Subsequences;

import java.util.ArrayList;
import java.util.List;

public class find_if_subsequence_sum_k {
    public static boolean findSubSeq(int idx , int[] arr , int k , int sum , List<Integer> temp){
        if(idx == arr.length){
            if(sum == k){
                for(int i : temp) System.out.print(i + " ");
                System.out.println();
                return true;
            } 
            return false;
        }
        
        temp.add(arr[idx]);
        if(findSubSeq(idx + 1, arr, k, sum += arr[idx], temp) == true){
            return true;
        }

        temp.remove(temp.size() - 1);
        if(findSubSeq(idx + 1, arr, k, sum -= arr[idx], temp) == true){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8};
        int k = 10;

        List<Integer> temp = new ArrayList<>();
        findSubSeq(0, arr, k, 0, temp);
    }
    
}
