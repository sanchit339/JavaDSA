package ArrayImpl;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiplAL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // initialize it for size 3 (always add the list)
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }
        System.out.println(list);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);
    }
}
