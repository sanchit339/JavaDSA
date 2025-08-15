/**
 * Why Over the Merge sort 
 *  - Merge sort takes extra temp array space 
 *  - Quick sort
 *      - TC = N x log(N)
 *      - SC = O(1) - only the recursion stack space
 * 
 *  Hint : 
 *  - Pickup a pivot and place it in the correct place in the sorted array
 *  - then start sorting the reamining part 
 *  - smaller to the pivot goes to left and larger goes to the right
 * 
 *  - At every loop the element 1 element is sorted
 */

package Recursion.Sorting;

public class quick_sort {
    public static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int getPivot(int[] arr , int low , int high){
        int pivot = arr[low];
        int i = low ;
        int j = high ;

        while (i < j) {
            while ( i <= high && arr[i] <= pivot) {
                i++;
            } 
            while ( j >= low && arr[j] > pivot) {
                j--;
            }
            if(i < j){ // swap to sort the elements
                swap(arr, i, j);
            }
        }

        swap(arr, low, j);
        return j; // where the pivot is 
    }

    public static void QuickSort(int[] arr , int low , int high){
        // base case
        if(low < high){
            int partition = getPivot(arr , low , high);

            QuickSort(arr, low, partition - 1);
            QuickSort(arr, partition + 1, high);
        }
    }
    public static void main(String[] args) {
        int[] arr = { 3, 4 , 5 , 1 , 2 , 7 , 8 , 6};
        QuickSort(arr, 0, arr.length - 1);
        
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
