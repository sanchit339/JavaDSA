package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {1 , 5 , 7 , 3 , 2 , 1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) { // check the cases --> runs (N-2) times
            for (int j = i + 1; j > 0 ; j--) {   // check ulta :)
                if(arr[j] < arr[j - 1]){
                    swap(arr , j , j-1);
                }
                else {
                    break; // break for the particular loop as the array is sorted
                }
            }
        }
    }
    static void swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
