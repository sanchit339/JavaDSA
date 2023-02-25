package ArrayImpl;

import java.util.*;

public class ArraysImpl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr1[] = new int[5]; // new array of size 5
        int arr[] = {1, 2, 3 ,4 ,5}; // pre defined
        /*
        as obj are stored in the heap memory
        and heap obj is not continuous
        array object may not be continuous -> depends on the JVM
        */
        int NewArr[] = new int[10]; // declaration of array , defined in

        for (int i = 0; i < 10; i++) {
            NewArr[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(NewArr[i] + " ");
        }
        System.out.println();

        // range based for loop
        System.out.println("this is output of range based for loop");
        for(var num : NewArr){
            System.out.print(num + " ");
        }

        System.out.println();
        System.out.println("the out from the to string method");
        System.out.println(Arrays.toString(NewArr));
    }
}
