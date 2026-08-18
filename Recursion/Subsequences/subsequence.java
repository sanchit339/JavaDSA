/**
 * TC 2^n x n
 * SC O(N) depth of the recursion (max Depth)
 */

package Recursion.Subsequences;

import java.util.*;

public class subsequence {
    public static List<List<Integer>> generateSubSequence(int[] arr , int i , List<List<Integer>> resultList , List<Integer> temp){
        if(i == arr.length){
            resultList.add(new ArrayList<>(temp));
            return resultList;
        }
        temp.add(arr[i]);
        generateSubSequence(arr, i + 1, resultList, temp);
        temp.remove(temp.size() - 1);
        generateSubSequence(arr, i + 1 , resultList, temp);

        return resultList;

    }
    public static void main(String[] args) {
        int[] array = {2 , 8  , 9 , 11 };
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        List<List<Integer>> ans = generateSubSequence(array, 0, result, temp);
        
        ans.sort((a , b) -> {
            if(a.size() != b.size()) return a.size() - b.size();
            return a.toString().compareTo(b.toString());
        });
        
        for(List<Integer> arr : ans){
            for(int i : arr){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    
}
