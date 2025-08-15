package Recursion.Subsequences;

import java.util.ArrayList;
import java.util.List;

public class subsequence_sum_k {
    public static void findSubSeq(int idx , int[] arr , int k , int sum , List<Integer> temp){
        if(idx == arr.length){
            if(sum == k){
                for(int i : temp) System.out.print(i + " ");
                System.out.println();
            } 
            return;
        }
        
        temp.add(arr[idx]);
        findSubSeq(idx + 1, arr, k, sum += arr[idx], temp);

        temp.remove(temp.size() - 1);
        findSubSeq(idx + 1, arr, k, sum -= arr[idx], temp);

    }
    public static void main(String[] args) {
        
        int[] arr = {2, 4, 6, 8};
        int k = 10;

        List<Integer> temp = new ArrayList<>();
        findSubSeq(0, arr, k, 0, temp);
    }
}
