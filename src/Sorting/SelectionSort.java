package Sorting;

import java.util.Arrays;

// selection Sort swap the max item to the last

// worst case n^2
// best case n^2
// stable Algo -> NO
// performs well on small list and arrays
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1 , 5 , 7 , 3 , 2 , 1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // loop is running (n-i-1) times
    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            // find the max item in the remaining array and swap with correct index
            int last  = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr , 0 , last);

            swap(arr, maxIndex , last);
        }
    }

    static void swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    private static int getMaxIndex(int[] arr , int start , int end){
        int max = start;
        for (int i = start ; i <= end ; i++) {
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
}
