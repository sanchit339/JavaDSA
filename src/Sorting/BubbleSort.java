package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1 , 5 , 7 , 3 , 2 , 1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    // with each pass the max element is push to the last of the array
    // other names are sinking sort and exchange sort
    // TC WC = n^2 and comparison are also n^2 ---> 50 size ---> 2500 comparisons

    // Best Case N - 1 comparison

    // stable ans unstable sorting algorithm ----> [10 , 20 , .20  , 30 , .10]
    // in stable the order of the elements is kept  ---> [10 , .10 , 20 , .20 , 30]


    static void bubble(int[] arr){
        // condition for sorted array
        boolean swapped ;
        // run for n - 1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // for each step max item come at the last of the array
            for (int j = 1; j < arr.length - i; j++) {
                // swap if bigger element is present
                if(arr[j] < arr[ j - 1 ] ){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}
