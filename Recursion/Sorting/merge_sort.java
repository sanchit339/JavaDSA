/**
 * TC = N x Log2(n) [Worst case O(N)] suppose to sort [3,2,1,5,4]
 * SC = O(N) because in worst case the Merge function can take the temp array of size O(N)
 */
package Recursion.Sorting;

import java.util.ArrayList;
import java.util.List;

public interface merge_sort {
    public static void Merge(int[] arr , int low , int mid , int high){
        List<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }
        // add the remaining 
        while (left <= mid) {   
            temp.add(arr[left]);
            left++;
        }
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // we are dealing with the Indexes
        for(int i = low ; i <= high ; i++){
            arr[i] = temp.get(i - low); // temps index start at the 0 not low
        }
    }

    public static void MergeSort(int[] arr , int low , int high){
        if(low >= high) return;
        int mid = (low + high) / 2;

        MergeSort(arr, low, mid);
        MergeSort(arr, mid + 1, high);

        Merge(arr , low , mid , high);
    }
    public static void main(String[] args) {
        int[] arr = { 3, 4 , 5 , 1 , 2 , 7 , 8 , 6};

        MergeSort(arr , 0 , arr.length - 1);

        for(int i : arr){
            System.out.print(i + " , ");
        }
    }
}
