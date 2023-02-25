package ArrayImpl;


import java.util.ArrayList;
import java.util.Scanner;

// arrayList are Dynamic sized Arrays
public class ArrayListImpl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Syntax
        // we provided the initial capacity 10 then it will inc on its own
        ArrayList<Integer> arrayList = new ArrayList<>(10);

        arrayList.add(10);
        arrayList.add(21);
        arrayList.add(34);

        System.out.println(arrayList); // this will internally call the to-string method

        arrayList.remove(2); // remove at index 2
        arrayList.set(0 , 100); // idx 0 -> 100

        System.out.println(arrayList);

        // taking list input
        for (int i = 0; i < 5; i++) {
            arrayList.add(sc.nextInt());
        }

        // iterating through the array (OUTPUT)
        for (int i = 0; i < 5; i++) {
            System.out.println(arrayList.get(i));  // get this method
        }

        /*
            size is fixed initially
            if list fills by some amount
            it will create a new array list of double size
            old element are copied to new one
            old one deleted
        */
    }
}
