package ArrayImpl;

import java.util.Arrays;
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[2][3];

        for(int row = 0 ; row < arr.length ; ++row){
            for(int column = 0 ; column < arr[row].length ; ++column){  // important impl
                arr[row][column] = sc.nextInt();
            }
        }

        // accessing via toString method
        for (int row = 0 ; row < arr.length ; ++row){
            System.out.println(Arrays.toString(arr[row]));
        }

        // range based for loop
        System.out.println("output from the range based for loop : -");
        for(int[] a:arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
